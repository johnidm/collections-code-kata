describe('Página principal', function() {
	beforeEach(function() {
		browser.get('http://localhost/:3000/#/contato');
	});

	it ('Deve cadastrar um contato', function() {
		element(by.id('usuario-logado')).getText()
			.then(function(texto){
				expect(texto.trim().length).toBeGreaterThan(0);
			});
	});

});