json.array!(@comentarios) do |comentario|
  json.extract! comentario, :id, :conteudo, :author
  json.url comentario_url(comentario, format: :json)
end
