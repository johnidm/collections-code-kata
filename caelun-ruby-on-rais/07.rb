class Pessoa

	def initialize(nome)
		@nome = nome
		puts "Criando uma nova pessoa"
	end

	def muda_nome(novo_nome)
		@nome = novo_nome
	end

	def diz_nome
		"Meu nome é #{@nome}"
	end

	def fala
		puts "Ola... Estou falando"
	end

	def troca(roupa, lugar='banheiro')
		"trocando de #{roupa} na #{lugar}"
	end

end

p = Pessoa.new("Johni")

def p.nome()
	puts "Eu sou uma pessoa"
end

puts p.class

p.nome()

ps = Pessoa.new("Douglas")
ps.muda_nome "Johni"
puts ps.diz_nome	
