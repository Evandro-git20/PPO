package dominio;

//Fa�a um programa que leia o c�digo, a quantidade, o pre�o unit�rio e a forma de
//pagamento (1 � Dinheiro, 2 � Cart�o d�bito, 3 � Cart�o cr�dito) de um produto.
//Pagamentos em dinheiro recebem um desconto de 10%, em cart�o de cr�dito 5% e em
//cart�o de d�bito 2%. O programa deve informar o valor do desconto e o valor final a
//pagar. Utilize uma classe de nome produto, um m�todo para calcular o desconto e um
//m�todo para informar o valor final a pagar. O programa deve utilizar tratamento de
//exce��es.

public class Produto {
	
	private int codigo;
	private int quantidade;
	private double valorUnitario;
	private int formaPagamento;
	
	public Produto(int codigo, int quantidade, double valorUnitario, int formaPagamento) {
		super();
		this.codigo = codigo;
		this.quantidade = quantidade;
		this.valorUnitario = valorUnitario;
		this.formaPagamento = formaPagamento;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public int getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(int formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	
	public double calcularDesconto() {
		double desconto = 0;
		if (formaPagamento == 1)
			desconto = (valorUnitario * quantidade) * 10/100;
		else
			if (formaPagamento == 2)
				desconto = (valorUnitario * quantidade) * 5/100;
		else
			if (formaPagamento == 3)
				desconto = (valorUnitario * quantidade) * 2/100;
		return desconto;
	}
	
	public double valorFinal() {
		return quantidade * valorUnitario - calcularDesconto();
	}
}
