require File.expand_path("library")

tdd = Livro.new "TDD", "Mauricio Aniche", "123456", 247, 69.9, :testes
bdd = Livro.new "BDD", "Fulano", "123456", 247, 69.9, :testes
web_design = Livro.new "Design Responsivo", "Tarcio Zemel", "654321", 247, 58.9, :web_design

#BancoDeArquivos.new.salva tdd

biblioteca = Biblioteca.new

biblioteca.adiciona tdd
biblioteca.adiciona web_design
biblioteca.adiciona bdd

#biblioteca.livros

#p biblioteca.livros_por_categoria :testes

p Biblioteca.superclass.methods



