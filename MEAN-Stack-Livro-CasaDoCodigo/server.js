var http = require('http')

http.createServer(function(req, res) {
	res.writeHead(200, {'Content-Type' : 'text/plain'});
	res.end('Sou um servidor create pelo Node.js\n');

}).listen(3000, '127.0.0.1');

