package tp1;
import java.util.Scanner;
public class Tp1 {

	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		String[] arrayClientes = {"null1","null2","null3"};
		
		System.out.println("Digite a quantidade de clientes a serem cadastrados.");
		int quantidadeDeClientes = ler.nextInt();
		
		for (int i = 1; i <= quantidadeDeClientes; i++ ) {
			System.out.println("Digite o nome do cliente.");
			arrayClientes[0] = ler.next();
			
			System.out.println("Digite o endereco do cliente.");
			arrayClientes[1] = ler.next();
			
			System.out.println("Digite o telefone do cliente");
			arrayClientes[2] = ler.next();
			
			
			
		}
		
		
		for(int j = 1; j <= quantidadeDeClientes + 1; j++) {
			
			System.out.println(arrayClientes[j]);
			
		}
		
		
		
		
		
	
		
		
	}
		
		
}