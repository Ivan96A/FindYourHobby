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