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