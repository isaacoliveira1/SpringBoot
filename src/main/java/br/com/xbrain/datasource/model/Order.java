package datasource.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="Order")
public class Order {
	@Id
	private long idProduto;
	@Column(name="ID_Cliente")
	private long idCliente;
	@Column(name="Endereço: ")
	private String endereco;
	@Column(name="Valor")
	private double valor;
	
	public Order(long idProduto, long idCliente, String endereco, double valor) {
		super();
		this.idProduto = idProduto;
		this.idCliente = idCliente;
		this.endereco = endereco;
		this.valor = valor;
	}
	
	public long getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(long idProduto) {
		this.idProduto = idProduto;
	}
	public long getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
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
	
	
}
