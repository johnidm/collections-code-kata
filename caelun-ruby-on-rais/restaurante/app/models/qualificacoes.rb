class Qualificacoes < ActiveRecord::Base


	belongs_to :cliente

	belongs_to :restaurantes

	validates_presence_of :nota, :message => " - deve ser preenchido"

	validates_presence_of :cliente_id, :restaurante_id

	validates_presence_of :valor_gasto, :message => " - deve ser preenchido"

	validades_numericality_of :nota,
								:greater_than_or_equal_to => 0
								:less_than_or_equal_to => 10,
								:message => " - deve ser um número entre 0 e 10"	

	validades_numericality_of :valor_gasto,
								:greater_than => 0
								
								:message => " - deve ser um número maior que 0"							

	validates_associated :cliente_id, :restaurante_id

end
