require File.expand_path("livro")

# encoding: utf-8

biblioteca = []

teste_e_design = Livro.new "Mauricio Aniche", 247, "123465", 100.32
web_design = Livro.new "Tárcio Zemel", 189, 25

biblioteca << teste_e_design
biblioteca << web_design


puts biblioteca


#puts teste_e_design.instance_variable_get "@preco" 
#teste_e_design.instance_variable_set "@preco", 75.2
#puts teste_e_design.instance_variable_get "@preco" 

#p teste_e_design
#p web_design

#puts teste_e_design
#puts teste_e_design.preco
#teste_e_design.preco=(85)
#puts teste_e_design.preco

=begin
class Book
	def initialize(a = "a", m = "m", p)
		puts "p = #{p} => a = #{a} => m = #{m}"
	end
end

book = Book.new(1, 2)
=end

