(function () {
    'use strict';

    angular
        .module('main')
        .controller('TaskCtrl', TaskCtrl);

    function TaskCtrl($scope, $state, TaskService) {
        var sc = $scope;

        sc._variantes = [];

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

        sc.putVarintes = function (index, task, variant) {

            var _variant = {
                'task' : task,
                'variant' : variant
            };

            sc._variantes.push(_variant);
            
        }

    }
})();