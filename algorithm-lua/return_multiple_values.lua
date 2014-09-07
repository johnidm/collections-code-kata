#!/usr/local/bin/lua

print("Init program")

function calc_values(a)

	local sum = 0

	for val in ipairs(a) do
		sum = sum + val
	end

	return math.min( unpack(a) ), math.max( unpack(a) ), sum

end

local min, max, avg

min, max, avg = calc_values({1,2,3,4})

print("Min value " .. min, "Max value " .. max, "Sum values " .. avg)

print("Finish program")
