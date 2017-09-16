# Aplicativo Gerenciador Financeiro
Aplicativo para gerenciamento e controle financeiro.

# CURL (Login)
curl -H "Content-Type: application/json" -X POST -d '{"usuario":"rafael","senha":"123456"}' http://localhost:8080/GerenciadorFinanceiro/rest/login/autenticacao

# CURL (Cadastro Categoria)
curl -H "Content-Type: application/json" -X POST -d '{"nomeCategoria":"Alimentacao"}' http://localhost:8080/GerenciadorFinanceiro/rest/cadastro/categoria

# CURL (Cadastro de Receita)
curl -H "Content-Type: application/json" -X POST -d '{"data":"15/09/2017","descricao":"balada com amigos", "valor":"150,00"}' http://localhost:8080/GerenciadorFinanceiro/rest/cadastro/receita

