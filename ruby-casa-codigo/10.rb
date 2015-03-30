multiplicador = lambda {|x, y| x * y}.curry
dobro = multiplicador.call 2

#p multiplicador.call 2, 3
p dobro.call 13