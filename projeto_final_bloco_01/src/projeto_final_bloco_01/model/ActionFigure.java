package projeto_final_bloco_01.model;

public class ActionFigure extends Produto {
	private String seriado;

	public ActionFigure(int id, String nomeprod, int categoria, float preco, int estoque, String seriado) {
		super(id, nomeprod, categoria, preco, estoque);
		this.seriado = seriado;
	}
	
	@Override
	public void visualizar () {
		super.visualizar();
		System.out.println("      Seriado da Action: "+ this.seriado);
		System.out.println("═══════════════════════════════════════════");
	}

}
