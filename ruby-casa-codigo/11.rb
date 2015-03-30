

arquivo = File.new("file.txt")
p arquivo.size

File.open("file.txt", "r") do |arquivo|
	
	arquivo.each do |linha|
		p linha
	end


end

=begin
File.open("file.txt", "w") do |arquivo|
	arquivo.puts "Ola"
end
=end
