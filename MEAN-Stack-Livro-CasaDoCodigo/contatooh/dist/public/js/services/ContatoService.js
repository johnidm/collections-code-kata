angular.module('contatooh').factory('Contato', ["$resource", function ($resource) {
	return $resource('contatos/:id');
}])