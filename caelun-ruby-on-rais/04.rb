print "Escreva um texto"

texto = gets

File::open("file.txt", "w") do |f|
	f << texto
end

Dir['file.txt'].each do |file_name|
	idea = File.read(file_name)
	puts idea
end

