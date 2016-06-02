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
            }

        });
})();