package datasource.model;

//import javax.persistence.Column;
//import javax.persistence.Id;

//@Entity(name = "Produtos")
public class Order {
//	@Id
	private long idProduto;
	private String endereco;
//	@Column(name = "ID_Product");
	private double valor;
	//@Column(name = "ID_Cliente")
	private long idCliente;
	
	
	
	public Order(long idProduto, double valor, String endereco, long idCliente) {
		super();
		this.idProduto = idProduto;
		this.endereco = endereco;
		this.valor = valor;
		this.idCliente = idCliente;
		
	}
	
	public long getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(long idProduto) {
		this.idProduto = idProduto;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public long getIdCliente() {
		return idCliente;
	}
	public void setidCliente(long idCliente) {
		this.idCliente = idCliente;
	}
	
}
