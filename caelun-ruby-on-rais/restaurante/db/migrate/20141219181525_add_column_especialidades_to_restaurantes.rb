class AddColumnEspecialidadesToRestaurantes < ActiveRecord::Migration

	def self.up
		add_column :restaurantes, :especialidade, :string, :limit =>  40 
	end

	def self.down
		remove_column :restaurantes, :especialidade 
	end

end
