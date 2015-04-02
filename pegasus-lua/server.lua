local pegasus = require 'pegasus'
local template = require "resty.template"

local server = pegasus:new('9090')

server:start(function (req, rep)

	local view = template.new"view.html"
	view.message  = "Hello, World!"
	view:render()

	local result = tostring(view)

	rep.writeHead(200).finish(result)

end)
