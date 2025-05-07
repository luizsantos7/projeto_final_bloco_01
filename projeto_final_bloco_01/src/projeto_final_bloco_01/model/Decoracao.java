package projeto_final_bloco_01.model;

public class Decoracao extends Produto {

	public Decoracao(int id, String nome, int categoria, float preco, int estoque) {
		super(id, nome, categoria, preco, estoque);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void visualizar () {
		super.visualizar();
		System.out.println("═══════════════════════════════════════════");
	}
	

}
