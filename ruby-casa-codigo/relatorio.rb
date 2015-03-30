class Relatorio

	def initialize(biblioteca)
		@biblioteca = biblioteca
	end

	def titulos
=begin
		titulos = []

		@biblioteca.livros.each do |livro|
			titulos << livro.titulo
		end

		titulos

=end
		#@biblioteca.livros.map { |livro| livro.titulo }
		@biblioteca.livros.map  &:titulo 

	end

	def total

		#@biblioteca.livros.inject(0) { | tot, livro | tot += livro.preco }
		#@biblioteca.livros.map(&:preco).inject(0) { |tot, valor| tot += valor }
		@biblioteca.livros.map(&:preco).inject(:+)

=begin		
		soma = 0.0

		@biblioteca.livros.each do |livro|
			soma += livro.preco
		end

		soma
=end		
	end

end


