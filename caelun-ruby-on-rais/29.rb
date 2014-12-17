class MinhaException < Exception
end


begin
	puts "Lançado MinhaException"
	raise MinhaException 
rescue MinhaException => e
	puts "Foi lançado a exception #{e}"
end
