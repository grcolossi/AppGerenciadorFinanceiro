# Aplicativo Gerenciador Financeiro
Aplicativo para gerenciamento e controle financeiro.

# CURL (Login)
► POST: curl -H "Content-Type: application/json" -X POST -d '{"usuario":"rafael","senha":"123456"}' http://localhost:8080/GerenciadorFinanceiro/rest/login/autenticacao

# CURL (Cadastro Categoria)
► POST: curl -H "Content-Type: application/json" -X POST -d '{"nomeCategoria":"Alimentacao"}' http://localhost:8080/GerenciadorFinanceiro/rest/cadastro/categoria

► GET: http://localhost:8080/GerenciadorFinanceiro/rest/cadastro/listarCategorias

# CURL (Cadastro de Receita)
► POST: curl -H "Content-Type: application/json" -X POST -d '{"data":"15/09/2017","descricao":"balada com amigos", "valor":"150,00"}' http://localhost:8080/GerenciadorFinanceiro/rest/cadastro/receita

# CURL (Cadastro de Cartão)
► POST: curl -H "Content-Type: application/json" -X POST -d '{"id":"1", "numero":"12345678","dataValidade":"18/09/2017","codigoSeguranca":"321","nomeTitular":"Rafael Santos"}' http://localhost:8080/GerenciadorFinanceiro/rest/cadastro/cartao
