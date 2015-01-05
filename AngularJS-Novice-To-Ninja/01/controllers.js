angular.module('myApp.controllers', []).
	controller('FinanceController', function($scope){
		$scope.salary = 3;
		$scope.percentage = 4;

		$scope.result = function() {
			return $scope.salary * $scope.percentage * 0.01;
		}

	}).controller('GreetingController', function($scope){
		
		$scope.now = new Date();
		$scope.greeting = 'Johni';


	}).controller('DemoController', ['$rootScope, $scope, $http', function($rootScope, $scope, $http){
		
		

	}]);
