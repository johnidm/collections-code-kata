function average(first, ...)		
		follows = {...}
        
        for k,v in ipairs(follows) do
        	print(follows[k])       
        end 

        print(arg.n)

        for i = 1, #arg do
        	print(tostring(arg[i]))	
        end      
    end

average(11,14,23)


-- parametro implicíto arg não funciona
function listar_um (...)
  for i,v in ipairs(arg) do
    print("usando args " .. arg[i])  
  end
end
listar_um("Olá", 1, "Dois")



function listar_um (...)
  lista = {...}
  
  for i,v in ipairs(lista) do
    print("não usando args " .. lista[i])  
  end
end
listar_um("Olá", 1, "Dois")