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
		});

	}

})();
