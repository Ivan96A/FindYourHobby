(function () {
	'use strict';

	var main = angular.module('main', [
		'ui.router',
		'ui.bootstrap',
		'ngResource',
		'ngAnimate',
		'ngCookies',
		'checklist-model',
		'ngDialog',
		'uiSwitch'
		])
	.config(configure);

	configure.$inject = ['$stateProvider', '$urlRouterProvider'];
	function configure ($stateProvider, $urlRouterProvider) {

		$urlRouterProvider.otherwise(function ($injector) {
			var $state = $injector.get("$state");
			$state.go('main.category');
		});

		$stateProvider 
		.state('main', {
			url: '/',
			abstract: true,
			templateUrl: '/app/main.view.html'
		})
		.state('main.category', {  
			url: 'category',
			views: {
				'': {
					templateUrl: '/app/category/category.view.html',
					controller: 'CategoryCtrl'
				}
			}
		})
		.state('main.task', {
			url: 'task',
			views: {
				'': {
					templateUrl: '/app/task/task.view.html',
					controller: 'TaskCtrl'
				}
			}
		})
		.state('main.result', {
			url: 'result',
			views: {
				'': {
					templateUrl: '/app/result/result.view.html',
					controller: 'ResultCtrl'
				}
			}
		});

	}

})();

(function () {
    'use strict';

    angular
        .module('main')
        .controller('CategoryCtrl', CategoryCtrl);

    function CategoryCtrl($scope, $state, CategoryService) {
        var sc = $scope;
 
        sc._categories = [];

        sc.getCategories = function () {
            var success = function (response) {
                sc.categories = response.data;
            };

            var failed = function () {

            };

            CategoryService.getAll().then(success, failed);
        };
        
        sc.setCategories = function (_categories) {
            var categories = new Array(_categories.length);

            _categories.forEach(function(item, i, arr) {
                categories[i] = item.category;
            });

            if (_categories.length != 0) {
                CategoryService.set(categories);
                sc.categoriesNull = false;
                $state.go('main.task');
            }
            else sc.categoriesNull = true;
        }
        
    }
})(); 
(function () {
    'use strict';

    angular
        .module('main')
        .service('CategoryService', function ($http) {

            var urlBase = '/category';

            this.getAll = function () {
                return $http.get(urlBase);
            };

            this.set = function (categories) {
                return $http.post('task', categories);
            };

        });
})();
(function () {
    'use strict';

    angular
        .module('main')
        .controller('ResultCtrl', ResultCtrl);

    function ResultCtrl($scope, $state, TaskService) {
        var sc = $scope;
        
        sc.getResult = function() {
            var success = function (response) {
                sc.results = response.data;
            };

            var failed = function () {

            };

            TaskService.getResults().then(success, failed);
        };

    }
})();
(function () {
    'use strict';

    angular
        .module('main')
        .controller('TaskCtrl', TaskCtrl);

    function TaskCtrl($scope, $state, TaskService) {
        var sc = $scope;

        sc._variants = [];

        sc.getTasks = function () {
            var success = function (response) {
                sc.tasks = response.data;
            };

            var failed = function () {

            };

            TaskService.getAll().then(success, failed);
        };

        sc.getTaskById = function (id) {
            var success = function (response) {
                sc.task = response.data
            };

            var failed = function () {

            };

            TaskService.getById(id).then(success, failed);
        };

        sc.getResult = function() {
            var success = function (response) {
                sc.results = response.data;
            };

            var failed = function () {

            };

            TaskService.getResults().then(success, failed);
        };

        sc.postResult = function (variants) {
            var success = function (response) {
                $state.go('main.result');
            };
 
            var failed = function () {

            };
            if (variants.length >= 5) TaskService.pushAnswer(variants).then(success, failed);
        };

    }
})();
(function () {
    'use strict';

    angular
        .module('main')
        .service('TaskService', function ($http) {

            var urlBase = '/task';

            this.getAll = function () {
                return $http.get(urlBase);
            };

            this.getById = function (id) {
                return $http.get(urlBase + '/' + id);
            };
            
            this.pushAnswer = function (answer) {
                return $http.post('/answer', answer);
            }; 

            this.getResults = function () {
                return $http.get('/answer');
            }

        });
})();