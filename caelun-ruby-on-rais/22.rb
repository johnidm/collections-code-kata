caelum = [
	{ :ruby => 'rr-71', :java => 'fj-11' },
	{ :ruby => 'rr-75', :java => 'fj-21' }
]

caelum.sort_by { |curso| curso[:ruby] }.each do |curso|
	puts "Curso do RoR na Caelum #{ curso[:ruby] }"
end

caelum.sort_by { |curso| curso[:ruby] }.each do |curso|
	next if curso[:ruby] == 'rr-71'
	puts "Curso do RoR na Caelum #{ curso[:ruby] }"
end


