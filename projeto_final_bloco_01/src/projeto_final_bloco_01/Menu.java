package projeto_final_bloco_01;

import java.io.IOException;
import java.util.Optional;
import java.util.Scanner;

import projeto_final_bloco_01.controller.ProdutoController;
import projeto_final_bloco_01.model.ActionFigure;
import projeto_final_bloco_01.model.Comics;
import projeto_final_bloco_01.model.Decoracao;
import projeto_final_bloco_01.model.Produto;
import projeto_final_bloco_01.util.Cores;

public class Menu {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int opcao=0, opcaoMenu=0, categoria=0, estoque=0, anoLancamento=0;
		String nome,seriado,estado;
		float preco;
		
		
		ProdutoController prod = new ProdutoController();
		
		prod.cadastrarProduto(new ActionFigure(prod.gerarId(),"Luffy gear 5", 1, 165.45f,5,"One Piece"));
		prod.cadastrarProduto(new Comics(prod.gerarId(),"A vingança do robin", 3, 80.50f,10,"Novo", 1960));
		prod.cadastrarProduto(new Decoracao(prod.gerarId(),"Kitetsu Zoro Tamanho Real", 2, 780.45f,1));
		
		do {
			System.out.println(Cores.ANSI_BLACK_BACKGROUND+Cores.TEXT_CYAN_BOLD+"╔══════════════════════════════════════════════╗");
	        System.out.println("║                  Mercado Geek                ║");
	        System.out.println("╠══════════════════════════════════════════════╣");
	        System.out.println("║            1 - Criar Anúncio                 ║");
	        System.out.println("║                                              ║");
	        System.out.println("║            2 - Listar Anúncios Publicados    ║");
	        System.out.println("║                                              ║");
	        System.out.println("║            3 - Buscar Anúncio por ID         ║");
	        System.out.println("║                                              ║");
	        System.out.println("║            4 - Atualizar Anúncios            ║");
	        System.out.println("║                                              ║");
	        System.out.println("║            5 - "+Cores.ANSI_BLACK_BACKGROUND+Cores.TEXT_RED_BOLD+"Deletar Anúncio"+ Cores.ANSI_BLACK_BACKGROUND+Cores.TEXT_CYAN_BOLD +"               ║");
	        System.out.println("║                                              ║");
	        System.out.println("║            0 - Finalizar Compra              ║");
	        System.out.println("╚══════════════════════════════════════════════╝");
	        System.out.print("Escolha uma opção: ");
	        
	        opcao = leia.nextInt();
	        
	        if (opcao == 0) {
	        	finalizar();
	        	System.exit(0);
	        }
	 
	        	
	        switch(opcao) {
		        case 1:
		        	System.out.println(Cores.TEXT_RESET+Cores.TEXT_WHITE+"\n\nBem vindo a criação de anúncios do Mercado Geek :>");
		        	System.out.println("Para iniciar a publicação, por favor escolha alternativa correspondente a CATEGORIA desejada: \n");
		        	System.out.println("          1-ActionFigures\n          2-Decorações\n          3-Comics\n");
		        	System.out.println("Escolha:");
		       		categoria = leia.nextInt();
		       		switch(categoria) {
			       		case 1:
			       			System.out.println("Por favor, digite o nome descritivo para o anuncio: ");
		        			leia.skip("\\R");
		        			nome = leia.next();
		        			System.out.println("Informe o Seriado que esta action pertence: ");
			        		seriado = leia.next();
			        		System.out.println("Digite o valor desejado para venda: ");
			        		preco = leia.nextFloat();
			       			System.out.println("Escreva a quantidade em estoque: ");
			       			estoque = leia.nextInt();
			       			
			       			prod.cadastrarProduto(new ActionFigure(prod.gerarId(),nome,categoria,preco,estoque,seriado));
			       			
			       			System.out.println("Anuncio Criado!!");
			       			keyPress();
			       			break;
			        			
			        		case 2:
			        		System.out.println("Por favor, digite a descrição do anuncio: ");
			       			nome = leia.next();
			       			
			       			System.out.println("Digite o valor desejado para venda: ");
			       			preco = leia.nextFloat();
			       			
			       			System.out.println("Escreva a quantidade em estoque: ");
			       			estoque = leia.nextInt();
			       			
			       			prod.cadastrarProduto(new Decoracao(prod.gerarId(),nome,categoria,preco,estoque));
		        			
		        			System.out.println("Anuncio Criado!!");
			        		keyPress();
			        		break;
			       			
			        		case 3:
			       			System.out.println("Por favor, digite o nome descritivo para o anuncio: ");
			       			leia.skip("\\R");
			       			nome = leia.next();
			       			
			       			System.out.println("Informe o estado de conservação da HQ: ");
			       			System.out.println("        Novo");
			       			System.out.println("        Seminovo");
			       			System.out.println("        Usado (Possui Avarias)\n"); 
			       			
			       			leia.skip("\\R");
			       			estado = leia.next();
			       			
			        		System.out.println("Informe o ano de lançamento da HQ: ");
			        		anoLancamento = leia.nextInt();
			        		
			       			System.out.println("Digite o valor desejado para venda: ");
			       			preco = leia.nextFloat();
			       			
			       			System.out.println("Escreva a quantidade em estoque: ");
			       			estoque = leia.nextInt();
			        			
			       			prod.cadastrarProduto(new Comics(prod.gerarId(),nome,categoria,preco,estoque,estado,anoLancamento));
			       			
			       			System.out.println("Anuncio Criado!!");
			       			keyPress();
		        			break;
		        			
			       		default:
			       			System.out.println("Opção Invalida!");
			       			keyPress();
		        			break;
		        	}
		       
		        case 2:
		        	prod.listarTudo();
		        	keyPress();
		        	break;
		        case 3:
		        	System.out.println(Cores.TEXT_RESET+Cores.TEXT_WHITE+"Digite o ID do produto que você deseja consultar:");
		        	opcaoMenu = leia.nextInt();
		        	prod.consultarProdutoId(opcaoMenu);
		        	keyPress();
		        	break;
		        case 4:
		        	System.out.println(Cores.TEXT_RESET+Cores.TEXT_WHITE+"Digite o ID do produto que deseja Atualizar:");
					opcaoMenu = leia.nextInt();
					Optional<Produto> idprod = prod.buscarId(opcaoMenu);
					
					if(idprod.isPresent()) {
						
						System.out.println("\"Por favor, informe o nome desejado:");
						leia.skip("\\R");
						nome = leia.next();
						
						System.out.println("\"Por favor, informe o novo valor desejado:");
						preco = leia.nextFloat();
						
						System.out.println("Por favor, informe a nova quantidade em estoque:");
						estoque = leia.nextInt();
						
						categoria = idprod.get().getCategoria();
						
						switch(categoria) {
							case 1:
								System.out.println("Informe o seriado que a Action pertence: ");
								leia.skip("\\R");
								seriado = leia.next();
								
								prod.atualizar(new ActionFigure(opcaoMenu,nome,categoria,preco,estoque,seriado));
								keyPress();
								break;
							case 2:
								prod.atualizar(new Decoracao(opcaoMenu,nome,categoria,preco,estoque));
								keyPress();
								break;
							case 3:
								System.out.println("Informe o estado de conservação da HQ: ");
				       			System.out.println("        Novo");
				       			System.out.println("        Seminovo");
				       			System.out.println("        Usado (Possui Avarias)\n"); 
				       			
				       			leia.skip("\\R");
				       			estado = leia.next();
				       			
				        		System.out.println("Informe o ano de lançamento da HQ: ");
				        		anoLancamento = leia.nextInt();
								
								prod.atualizar(new Comics(opcaoMenu,nome,categoria,preco,estoque,estado,anoLancamento));
								keyPress();
								break;
							
						}
					}
					else
						System.out.printf(Cores.TEXT_RESET+Cores.TEXT_WHITE+"\n A conta numero %d não existe!\n", opcaoMenu);
					keyPress();
					break;
		        case 5:
		        	System.out.println(Cores.TEXT_RESET+Cores.TEXT_WHITE+"Digite o ID do produto que você deseja deletar:");
		        	opcaoMenu = leia.nextInt();
		        	prod.deletar(opcaoMenu);
		        	keyPress();
		        	break;
		        default:
		        	System.out.println(Cores.TEXT_RESET+Cores.TEXT_WHITE+"Opção inválida, por favor tente novamente.");
		        	keyPress();
		        	break;
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
		System.out.println("\n"+Cores.TEXT_RESET+Cores.TEXT_WHITE+"===========================================");
		System.out.println("                                           ");
		System.out.println("Obrigado por testar o meu projeto.\nDesenvolvedor: Luiz Henrique dos Santos.\nGithub: https://github.com/luizsantos7");
		System.out.println("                                           ");
		System.out.println("===========================================");
		System.exit(0);
	}

}
