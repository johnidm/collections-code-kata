angular.module('myApp').config(function ($provide) {
	$provide.decorator('$log', function($delegate) {
		$delegate.postInfoToURI = function(message) {
			$delegate.log('Data to post: ' + message);
			$delegate.log('Sending data to server');
		}
		return $delegate;
	});	
});




angular.module('myApp').value('appVersion', '1.0');
angular.module('myApp').constant('DATA_SOURCE', 'a string here');


angular.module('myApp').provider('greet', function () {
	
	this.greeting = 'Hello';

	this.$get = function() {

		var greeting = this.greeting;

		return function(name) {
			alert(greeting + ', ' + name)
		}
	}

	this.setGreeting = function(greeting) {
		this.greeting = greeting;
	}

});


angular.module('myApp').config(function(greetProvider, $log) {
		greetProvider.setGreeting('Hola');

		$log.postInfoToURI("Incluido novos dados");
	});

angular.module('myApp').controller('TestController', 
	function(greet) {
		greet('Sandeep');
	});


angular.module('myApp').factory('noteFactory', function ($http) {

	return {
		addNote: function(note) {

		},

		updateNote: function(note) {

		},

		getNote: function(note) {

		},

		getNotes: function(note) {

		}
	};
})



angular.module('myApp').service('helloService', 
	function ($timeout) {
		this.sayHello = function(name) {
			$timeout(function() {
				alert("Ola " + name)
			}, 2000)			
		}	
	});

angular.module('myApp').run(
	function(helloService) {

	});

angular.module('myApp').controller('TestController', 
	function(helloService){
		helloService.sayHello('AngularJS');
		helloService.echo("I love AngularJS");
	});


angular.module('myApp').factory('helloService', function () {

	return {
		sayHello: function(name) {
			alert("Ola " + name);
		},

		echo: function(message) {
			alert(message);
		}	
	};
})
