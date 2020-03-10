package resource.model;

import com.fasterxml.jackson.annotation.JsonProperty;
public class OrderResource {
	@JsonProperty("ID_Produto")
	private String idProduto;
	@JsonProperty("Endereco")
	private String endereco;
	@JsonProperty("ID_Cliente")
	private String idCliente;
	@JsonProperty("Valor")
	private String valor;
	
	public OrderResource(String idProduto, String endereco, String idCliente, String valor) {
		this.idProduto = idProduto;
		this.endereco = endereco;
		this.idCliente = idCliente;
		this.valor = valor;
	}

	public String getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(String idProduto) {
		this.idProduto = idProduto;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}
	
	
	
	
}
