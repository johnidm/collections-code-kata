class CreateQualificacoes < ActiveRecord::Migration
  def change
    create_table :qualificacoes do |t|

      t.timestamps
    end
  end
end
