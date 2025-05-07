package projeto_final_bloco_01;

import java.io.IOException;
import java.util.Scanner;

import projeto_final_bloco_01.util.Cores;

public class Menu {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int opcao=0;
		
		do {
			System.out.println(Cores.ANSI_BLACK_BACKGROUND+Cores.TEXT_RED_BOLD_BRIGHT+"╔════════════════════════════════════╗");
	        System.out.println("║            GeekFacts               ║");
	        System.out.println("╠════════════════════════════════════╣");
	        System.out.println("║  1 - Criar Produto                 ║");
	        System.out.println("║  2 - Analisar Anúncios             ║");
	        System.out.println("║  3 - Buscar Anúncio por ID         ║");
	        System.out.println("║  4 - Deletar Anúncio               ║");
	        System.out.println("║  0 - Finalizar Compra              ║");
	        System.out.println("╚════════════════════════════════════╝");
	        System.out.print("Escolha uma opção: ");
	        opcao = leia.nextInt();
	        
	        if (opcao == 0)
	        	finalizar();
	        	System.exit(0);
	 
	        	
	        switch(opcao) {
		        case 1:
		        case 2:
		        case 3:
		        case 4:
		        default:
	        }
			
		} while(true);

	}
	
	public static void keyPress() {
		 
		try {
 
			System.out.println("\n\nPressione Enter para Continuar...");
			System.in.read();
 
		} catch (IOException e) {
 
			System.err.println("Ocorreu um erro ao tentar ler o teclado");
 
		}
	}
	
	public static void finalizar() {
		System.out.println(Cores.TEXT_WHITE+"===========================================");
		System.out.println("                                           ");
		System.out.println("Obrigado por testar o meu projeto.\nDesenvolvedor: Luiz Henrique dos Santos.\nGithub: https://github.com/luizsantos7");
		System.out.println("                                           ");
		System.out.println("===========================================");
		System.exit(0);
	}

}
