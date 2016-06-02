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