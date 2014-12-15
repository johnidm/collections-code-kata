class Pessoa

	def nome
		@nome
	end

	def nome=(novo_nome)
		@nome = novo_nome
	end
end

pessoa = Pessoa.new
pessoa.nome=("Johni")
puts pessoa.nome


