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