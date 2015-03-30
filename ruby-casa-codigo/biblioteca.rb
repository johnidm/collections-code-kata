require File.expand_path("banco_de_arquivos")

module VendaFacil

	class Set 

		#attr_reader :livros

		def initialize 
			@banco_de_arquivos = BancoDeArquivos.new
		end

		def adiciona(livro)
			salva livro do			
				@livros << livro
			end
		end
		
		def livros_por_categoria(categoria)		
			@livros.select { | livro | livro.categoria == categoria}		
		end

		def livros 
			@livros ||= carrega
		end

		private 

		def salva(livro)

			File.open("livros.yaml", "a") do |arquivo|
				arquivo.puts YAML.dump(livro)
				arquivo.puts ""
			end

		end

		def carrega 
			$/ = "\n\n"
			File.open("livros.yaml", "r").map do |livro_serializado|
				YAML.load livro_serializado
			end
		end

	end

end