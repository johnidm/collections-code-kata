class CreatePratosRestaurantesJoinTable < ActiveRecord::Migration
  def change

  	create_table :pratos_restaurantes do |t|
  		t.integer :prato_id
  		t.integer :restaurante_id
  	end 	

  end
end
