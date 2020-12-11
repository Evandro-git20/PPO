package controle;
import java.util.Scanner;
import dominio.Produto;


public class ControlaProduto {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		try {
			System.out.print("Código do produto: ");
			int codigo = leia.nextInt();
			
		System.out.print("Digite a quantidade:");
		int quantidade = leia.nextInt();
		
		
		System.out.print("Digite o valor unitário:");
		double valorUnitario = leia.nextDouble();
		
		
		System.out.print("Digite a forma de pagamento:");
		int formaPagamento = leia.nextInt();
		
		Produto produto = new Produto(codigo,quantidade,valorUnitario,formaPagamento);
		
		System.out.println("Valor de desconto  R$ " + produto.calcularDesconto());
		System.out.println("Valor a pagar R$ " + produto.valorFinal());
		}
		
		catch(Exception e){
			System.out.println("Houve um erro na entrada de dados ");
			}
	}
}
