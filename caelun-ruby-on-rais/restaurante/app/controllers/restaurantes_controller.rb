class RestaurantesController < ApplicationController

  	def index
  		@restaurantes = Restaurantes.order(:nome)
  	end

  	def show   		
  		#@restaurante = david = Restaurantes.find_by(id: params[:id])
  		@restaurante = Restaurantes.find(params[:id])
  	end

  	def new 
  		@restaurante = Restaurantes.new
  	end

	def create 
		#nome = params['nome']

 		#params.permit!
		#@ad = Ad.new(params[:ad].permit(:title, :price, :description))
		#def message_params
	    #  parmas.require(:message).permit(:your, :message, :params)
	    #end

		@restaurante = Restaurantes.new(params[:restaurante].permit(:nome, :endereco, :especialidade))

		if @restaurante.save
			redirect_to(:action => "show", :id => @restaurante)
		else
			#render :action => "new"

			redirect_to(:action => "index")

		end
		
	end

  	def edit
  		@restaurante = Restaurantes.find(params[:id])
  	end



  	def update 
  		params.permit!
  		@restaurante = Restaurantes.find(params[:id])
		if @restaurante.update_attributes(params['restaurante'])
			redirect_to(:action => "show", :id => @restaurante)
		else
			render :action => "edit"
		end
  	end

  	def destroy 

		#@restaurante = Restaurantes.find(params[:id])
  		#@restaurante.destroy

  		#Restaurantes.find(params[:id]).destroy
  		#Restaurantes.destroy(params[:id]);

  		render :action => "inxex"

  		#redirect_to(:action => "show", :id => @restaurante)

  	end

end
