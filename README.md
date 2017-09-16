# Aplicativo Gerenciador Financeiro
Aplicativo para gerenciamento e controle financeiro.

# CURL (Login)
curl -H "Content-Type: application/json" -X POST -d '{"usuario":"rafael","senha":"123456"}' http://localhost:8080/GerenciadorFinanceiro/rest/login/loginSistema

# CURL (Cadastro Categoria)
curl -H "Content-Type: application/json" -X POST -d '{"nomeCategoria":"Alimentacao"}' http://localhost:8080/GerenciadorFinanceiro/rest/cadastro/categoria
