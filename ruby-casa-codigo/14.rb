require File.expand_path("biblioteca")
require File.expand_path("livro")

conjunto_de_livros = VendaFacil::Set.new

conjunto_de_livros.adiciona Livro.new "TDD", "Mauricio Aniche", "123456", 247, 69.9, :testes

p conjunto_de_livros.livros


