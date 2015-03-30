require File.expand_path("formatar_moeda")

class Midia
	attr_accessor :valor
	attr_accessor :titulo

	def initialize
		@desconto = 0.1
		@valor = 10.00
	end


	def valor_com_desconto
		@valor - desconto
	end

	private

	def desconto 
		@valor * @desconto
	end

end


# coding: utf-8
class DVD < Midia
	def initialize(titulo, valor, categoria)
		super()

		@titulo = titulo
		@valor = valor
		@categoria = categoria

	end

	def to_s 
		%Q{Título: #{@titulo}, Valor: #{@valor}}
	end

end

# coding: utf-8
class Livro < Midia
	

	attr_reader :categoria, :autor

	include FormatadorMoeda

	def initialize(titulo, autor, isbn = "Não informado", numero_de_paginas, valor, categoria)

		@titulo = titulo
		@autor = autor
		@isbn = isbn

		@numero_de_paginas = numero_de_paginas

		@valor = valor

		@categoria = categoria

		@desconto = 0.2

	end

	def to_s
		puts "Autor #{@autor}, ISBN #{@isbn}, Pág #{@numero_de_paginas}"
	end

end


tdd = Livro.new "TDD", "Mauricio Aniche", "123456", 247, 69.9, :testes

p tdd.valor
p tdd.titulo
p tdd.valor_com_desconto

p tdd.valor_formatado

windows = DVD.new "Win 7", 98.9, :so

p windows.valor
p windows.titulo
p windows.valor_com_desconto






