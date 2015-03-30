#codding: utf-8

class Livro
	
	#attr_writer :preco
	#attr_reader :preco
	attr_accessor :preco
	attr_reader :categoria, :isbn, :autor, :titulo


	def initialize(titulo, autor, isbn = "Não informado", numero_de_paginas, preco, categoria)

		@titulo = titulo
		@autor = autor
		@isbn = isbn

		@numero_de_paginas = numero_de_paginas

		@preco = preco

		@categoria = categoria

	end

	def to_s
		puts "Autor #{@autor}, ISBN #{@isbn}, Pág #{@numero_de_paginas}"
	end

	def eql?(outro_objeto)
		@isbn == outro_objeto.isbn
	end

	def hash
		@isbn.hash
	end

=begin
	def preco 
		@preco
	end

	def preco=(preco)
		@preco = preco
	end
=end

end
