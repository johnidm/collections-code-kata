class Prato < ActiveRecord::Base

	has_and_belongs_to_many :restaurantes

	has_one :receita

	validates_presence_of :nome, :message => " - deve ser preenchido"

	validades_uniquiness_of :nome, :message => " - nome já cadastrado"

	validate :validate_presence_of_more_than_one_restaurante

	private
	def validate_presence_of_more_than_one_restaurante
		errors.add("restaurantes", "deve aver ao menos um restaurante") if restaurantes.empty?
	end

end
