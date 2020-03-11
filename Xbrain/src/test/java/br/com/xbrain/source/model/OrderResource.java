package source.model;


public class OrderResource {
//	@JsonProperty("ID Produto: ");
	private String idProduto;
//	@JsonProperty("ID Cliente: ");
	private String idCliente;
//	@JsonProperty("Endereço: ");
	private String endereco;
//	@JsonProperty("Valor: ");
	private String valor;
	
	public OrderResource(String idProduto, String idCliente, String endereco, String valor) {
		super();
		this.idProduto = idProduto;
		this.idCliente = idCliente;
		this.endereco = endereco;
		this.valor = valor;
		// TODO Auto-generated constructor stub
	}

	public String getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(String idProduto) {
		this.idProduto = idProduto;
	}
	
	public String getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}
	
	
	
}
