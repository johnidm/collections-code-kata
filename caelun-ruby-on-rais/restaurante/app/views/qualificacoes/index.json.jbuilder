json.array!(@qualificacoes) do |qualificacao|
  json.extract! qualificacao, :id
  json.url qualificacao_url(qualificacao, format: :json)
end
