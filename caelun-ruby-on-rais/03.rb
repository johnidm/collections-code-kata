require "net/http"

Net::HTTP.start("www.caelum.com.br", 80) do |http|
	print(http.get('/').body)
end

