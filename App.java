import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
/* Calculadora de Desconto:
Peça ao usuário para inserir o preço de um produto e um valor de desconto.
Calcule e mostre o preço com o desconto aplicado. */  
    System.out.println("Digite o valor do produto: ");
    double preco = sc.nextDouble();
    System.out.println("Digite o valor com  desconto");
    double desconto = sc.nextDouble();
    double precoFinal = preco - (preco * desconto /100);
    System.out.println("O preço final com desconto é: " +precoFinal);
    }
}
