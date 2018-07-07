
import java.util.Scanner;

public class Menu {
	private Jogo jogo;
	public void menu() {
		int op1 = 1;
		jogo = new Jogo();
		Scanner sc = new Scanner(System.in);{
		
		while (op1 != 0) {
			System.out.println("Jogo da Velha\n");
			System.out.println("[1] - Jogar");
			System.out.println("[2] - Score");
			System.out.println("[0] - Sair");
			op1 = sc.nextInt();
			switch (op1) {
			case 1: {
				System.out.println("Jogo da Velha");
				while(jogo.Jogar());
				break;
			}
			case 2: {
				System.out.println("Score:");
				System.out.println("Jogador 1:");
				System.out.println(jogo.getJogador1().getPontos());
				System.out.println("Jogador 2:");
				System.out.println(jogo.getJogador2().getPontos());
				
				break;
			}
			
			case 0: {
				System.exit(0);
				continue;
			}
			default:
				System.out.println("Número digitado é Inválido");
			}
		}
	}	
}
}	