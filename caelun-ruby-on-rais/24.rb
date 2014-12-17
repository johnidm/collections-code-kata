class Animal
	def come
		"comento"
	end
end

class Pato < Animal
	def quack
		"Quack"
	end
end


pato = Pato.new
puts pato.come

