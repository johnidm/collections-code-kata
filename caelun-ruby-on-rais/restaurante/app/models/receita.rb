class Receita < ActiveRecord::Base

	belongs :prato

	

	validates_presence_of :conteudo, :message => " - deve ser preenchido"

	validates_presence_of :prato_id
	validates_associated :prato
end
