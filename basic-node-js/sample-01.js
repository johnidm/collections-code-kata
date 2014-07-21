var http = require("http"),
    onRequest = function (request, response) {
        console.log("Request received.");
        response.writeHead(200, { "Content-Type": "text/plain" });
        response.write("Hello World");
        response.end();
    };
 
http.createServer(onRequest).listen(666);