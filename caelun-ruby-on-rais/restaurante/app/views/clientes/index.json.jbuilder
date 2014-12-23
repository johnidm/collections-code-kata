json.array!(@clientes) do |cliente|
  json.extract! cliente, :id
  json.url cliente_url(cliente, format: :json)
end
