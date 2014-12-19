module Comentavel
	def comentarios
		@comentarios ||= []
	end

	def recebe_comentario(comentario)
		self.comentarios << comentario
	end
end

class Revista 
	include Comentavel
end


revista = Revista.new
revista.recebe_comentario("muito ruim")
puts revista.comentarios

	
