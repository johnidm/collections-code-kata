require File.expand_path("library")

biblioteca = Biblioteca.new 

biblioteca.adiciona Livro.new "TDD", "Mauricio Aniche", "123456", 247, 69.9, :testes
biblioteca.adiciona Livro.new "Design Responsivo", "Tarcio Zemel", "654321", 247, 58.9, :web_design

imprime_livro_no_console = lambda do |livro|
	p livro.autor
end

biblioteca.livros_por_categoria :testes, &imprime_livro_no_console

#relatorio = Relatorio.new biblioteca

#p relatorio.titulos
#p relatorio.total

=begin
imprime_livro_no_console = Proc.new do |livro|
	p livro.autor
end

imprime_livro_no_cosnole_com_puts = Proc.new do |livro|
	puts livro.autor
end


biblioteca.livros_por_categoria :testes, imprime_livro_no_console, imprime_livro_no_cosnole_com_puts
=end





