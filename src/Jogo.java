
import java.util.Scanner;

public class Jogo {
    private Tabuleiro tabuleiro;
    private int rodada=1, vez=1;
    private Humano jogador1;
    private Humano jogador2;
    public Scanner entrada = new Scanner(System.in);

    
    public Jogo(){
        tabuleiro = new Tabuleiro();
        jogador1 = new Humano(1);
        jogador2 = new Humano(2);
     
    }
    
    public Humano getJogador1() {
		return jogador1;
	}

	public void setJogador1(Humano jogador1) {
		this.jogador1 = jogador1;
	}

	public Humano getJogador2() {
		return jogador2;
	}

	public void setJogador2(Humano jogador2) {
		this.jogador2 = jogador2;
	}

	public boolean Jogar(){
        if(ganhou() == 0 ){
            System.out.println("----------------------");
            System.out.println("\nRodada "+rodada);
            System.out.println("É a Vez do Jogador " + vez() );
            
            if(vez()==1)
                jogador1.jogar(tabuleiro);
            else
                jogador2.jogar(tabuleiro);
            
            
            if(tabuleiro.tabuleiroCompleto()){
                System.out.println("Tabuleiro Completo, Jogo Empatado");
                return false;
            }
            vez++;
            rodada++;

            return true;
        } else{
            if(ganhou() == -1) {
                System.out.println("Jogador 1 Ganhou!");
            	jogador1.maisPonto();
            }
            else {
                System.out.println("Jogador 2 Ganhou!");
            	jogador2.maisPonto();
            }
            return false;
        }
            
    }
    
    public int vez(){
        if(vez%2 == 1)
            return 1;
        else
            return 2;
    }
    
    public int ganhou(){
        if(tabuleiro.checaLinhas() == 1)
            return 1;
        if(tabuleiro.checaColunas() == 1)
            return 1;
        if(tabuleiro.checaDiagonais() == 1)
            return 1;
        
        if(tabuleiro.checaLinhas() == -1)
            return -1;
        if(tabuleiro.checaColunas() == -1)
            return -1;
        if(tabuleiro.checaDiagonais() == -1)
            return -1;
        
        return 0;
    }
    
    
}

