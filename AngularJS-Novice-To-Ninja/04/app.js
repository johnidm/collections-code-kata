
'use strict'

//angular.module('myApp', ['myApp.controllers', 'ngRoute']);
angular.module('myApp', ['myApp.controllers', 'ui.router']);


angular.module('myApp').config(function ($stateProvider, $urlRouterProvider, $locationProvider) {
	
	$stateProvider.state('view1', {
		url: '/view1',
		controller: 'Controller1',
		templateUrl: 'partials/view1.html'

	}).state('view2', {
		url: '/view2/:firstname/:lastname',
		controller: 'Controller2',
		templateUrl: 'partials/view2.html',

		resolve: {
			names : function() {
				return ['Johni', 'Douglas'];
			}
		}

	});

	$urlRouterProvider.otherwise( '/view1' );

	
})

/*
angular.module('myApp').config(function ($routeProvider, $locationProvider) {
	$routeProvider.when('/view1', {
		templateUrl: 'partials/view1.html',
		controller: 'Controller1'
	}).when('/view2/:firstname/:lastname', {
		templateUrl: 'partials/view2.html',
		controller: 'Controller2',

		resolve: {
			names: function() {
			 	return ["Johni", "Douglas"];
			}
		}

	}).otherwise({ redirectTo: '/view1' });	
})*/
