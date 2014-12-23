require 'hpricot'


doc = Hpricot(open('http://twitter.com/johnidouglas'))

items = doc / ".hentry .entry-contend"

items.each do |item|
  puts item.inner_text
end


