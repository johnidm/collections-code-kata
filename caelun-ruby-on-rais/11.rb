class Aluno
end

class Professor
	def ensina(aluno)
		def aluno.escreve
			"sei escrever"
		end			
	end
end

juca = Aluno.new

professor = Professor.new
professor.ensina juca
puts juca.escreve
