package br.com.fean.jersey.services;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/cadastro")
public class CadastroController {
	@POST
	@Path("/categoria")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public String cadastrarCategoria(CadastroCategoria cd) {
		return "Categoria salva com sucesso";
	}
	
	@POST
	@Path("/cartao")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public String cadastrarCartao(Cartao cartao) {
		return "Cartão salvo com sucesso";
	}
	
	@GET
	@Path("/listarCartoes")
	@Produces(MediaType.APPLICATION_JSON)
	public List getListarCartoes() {
		List cartoes = new ArrayList();
		Cartao cartao1 = new Cartao();
		cartao1.setId(1);
		cartao1.setNomeTitular("Rafael Santos");
		cartao1.setNumero("123456789");
		cartao1.setCodigoSeguranca("234");
		cartao1.setDataValidade("20/09/2017");
		Cartao cartao2 = new Cartao();
		cartao2.setId(2);
		cartao2.setNomeTitular("Guilherme");
		cartao2.setNumero("3254682534");
		cartao2.setCodigoSeguranca("834");
		cartao2.setDataValidade("25/09/2018");
		cartoes.add(cartao1);
		cartoes.add(cartao2);
		return cartoes;
	}
	
	@GET
	@Path("/listarCategorias")
	@Produces(MediaType.APPLICATION_JSON)
	public List getCategorias() {
		List categorias = new ArrayList();
		CadastroCategoria c1 = new CadastroCategoria();
		c1.setNomeCategoria("Alimentação");
		CadastroCategoria c2 = new CadastroCategoria();
		c2.setNomeCategoria("Combustivel");
		categorias.add(c1);
		categorias.add(c2);
		return categorias;
	}
	
	@POST
	@Path("/receita")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public String receitaDespesa(ReceitaDespesa rd) {
		return "Receita salva com sucesso";
	}
}
