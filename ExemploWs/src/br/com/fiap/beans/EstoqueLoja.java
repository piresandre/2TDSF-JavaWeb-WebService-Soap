package br.com.fiap.beans;

public class EstoqueLoja {

	private int codProduto;
	private int quantidade;
	private String descricao;
	private double preco;
	
	
	
	
	
	public EstoqueLoja(int codProduto, int quantidade, String descricao, double preco) {
		super();
		this.codProduto = codProduto;
		this.quantidade = quantidade;
		this.descricao = descricao;
		this.preco = preco;
	}
	public int getCodProduto() {
		return codProduto;
	}
	public void setCodProduto(int codProduto) {
		this.codProduto = codProduto;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
}
