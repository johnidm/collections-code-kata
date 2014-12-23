class HelloWorldController < ApplicationController

	def	index	
		#render :text => "Action Padrão"

		#redirect_to(:action => "hello")
		hello

	end

	def hello
		render :text => "Hello Word"
	end
	
end
