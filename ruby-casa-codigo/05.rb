require 'set'
require File.expand_path("library")

numero_sem_repeticao = Set.new [1, 2, 2, 3, 4 ,5]

for numero in numero_sem_repeticao do
	
	p numero

end


teste_e_design = Livro.new "Mauricio Aniche", 247, "123465", 100.32, :testes
web_design = Livro.new "Tárcio Zemel", 189, "857496", 25, :html



#livro = Livro.new "Tárcio Zemel", 189, "857496", 25, :html

#p livro.eql? web_design