#function parse_json()
#{
#    echo $1 | sed -e 's/[{}]/''/g' | awk -F=':' -v RS=',' "\$1~/\"$2\"/ {print}" | sed -e "s/\"$2\"://" | tr -d "\n\t" | sed -e 's/\\"/"/g' | sed -e 's/\\\\/\\/g' | sed -e 's/^[ \t]*//g' | sed -e 's/^"//'  -e 's/"$//'	
#}

#json='{"code":200,"lang":"pt-en","text":["Hello"]}'

#parse_json $json code
#parse_json $json text

#echo '{"code":200,"lang":"pt-en","text":["Hello"]}' | jshon -e code 

echo '{"code":200,"lang":"pt-en","text":["Hello"]}' | jshon -e text -e 0
