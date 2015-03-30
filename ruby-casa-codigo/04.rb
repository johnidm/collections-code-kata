require File.expand_path("library")

biblioteca = Biblioteca.new

biblioteca.adiciona Livro.new "TDD", "Mauricio Aniche", "123456", 247, 69.9, :testes
biblioteca.adiciona Livro.new "Design Responsivo", "Tarcio Zemel", "654321", 247, 58.9, :web_design


imprime_livro_no_console = Proc.new do |livro|
	p livro.autor
end

biblioteca.livros_por_categoria :testes, &imprime_livro_no_console

#relatorio = Relatorio.new biblioteca
#p relatorio.total


#biblioteca.livros_por_categoria :html do |livro|
#	p livro.autor
#end


=begin
for categoria, livros in biblioteca.livros do
	p categoria

	p livros
	#for livro in livros do 
	#	p livro.preco
	#end

end
=end
