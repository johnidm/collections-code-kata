def passa_parametro
	yield("Algum", "Texto")
end

#passa_parametro{ |m1, m2| puts "#{m1}, #{m2}" }

passa_parametro do |m1, m2|
	puts "m1: #{m1}"
	puts "m2: #{m2}"
end


