package br.com.alura.loja.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import br.com.alura.loja.dao.CarrinhoDAO;
import br.com.alura.loja.modelo.Carrinho;

@Path("carrinhos")
public class CarrinhoResource {

 @GET
 @Produces
  public String busca()	{
	 Carrinho carrinho = new CarrinhoDAO().busca(1L);
	 return carrinho.toXML();
 }

}
