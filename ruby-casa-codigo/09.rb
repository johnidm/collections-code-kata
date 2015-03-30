def proc_com_return
	Proc.new { return "retornando algo em uma proc" }.call

	"Proc finalizada"
end

def lambda_com_return 
	lambda { return "retornado algo de uma lambda"}.call

	"Lambda finalizada"
end

puts proc_com_return
puts lambda_com_return

