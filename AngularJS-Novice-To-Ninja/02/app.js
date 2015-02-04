/*
var app = angular.module('plunker', []);

app.controller('MainCtrl', function($scope) {
  $scope.name = 'World';
});*/

/*
angular.module('myApp', []).controller('GreetingController',function($scope){
	
	$scope.now = new Date();
	$scope.greeting = 'Hello';

}); 
*/


'use strict'

angular.module('myApp', ['myApp.controllers']);

angular.module('myApp').run(function ($rootScope) {	
	$rootScope.title = 'Famous Books';
	$rootScope.name = 'Root Scope';
});
