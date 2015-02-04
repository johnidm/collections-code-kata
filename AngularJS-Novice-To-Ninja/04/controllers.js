'use strict'

angular.module('myApp.controllers',[]).
	controller('Controller1', function($scope, $location, $state) {

		$scope.loadView2 = function() {
			$state.go('view2', {
				 firstname: $scope.firstname,
				 lastname : $scope.lastname
			} );
		}

	}).controller('Controller2', function($scope, $routeParams, names){

		$scope.firstname = $routeParams.firstname;
		$scope.lastname = $routeParams.lastname;

		$scope.names = names

	});