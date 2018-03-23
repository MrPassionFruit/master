var actionApp = angular.module('actionApp', ['ngRoute']);
actionApp.config(['$routeProvider', function ($routeProvider) {
    $routeProvider.when('/oper', {
        //路由控制器名称
        controller: 'View1Controller',
        //视图地址
        templateUrl: 'views/view1.html'
    }).when('/directive', {
        controller: 'View2Controller',
        templateUrl: 'views/view2.html'
    });
}]);