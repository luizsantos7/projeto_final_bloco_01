package projeto_final_bloco_01.model;

public class Comics extends Produto {
	private String estado;
	private int anoLancamento;
	
	public Comics(int id, String nome, int categoria, float preco, int estoque, String estado, int anoLancamento) {
		super(id, nome, categoria, preco, estoque);
		this.estado = estado;
		this.anoLancamento = anoLancamento;
	}
	
	@Override
	public void visualizar () {
		super.visualizar();
		System.out.println("      Estado de Conservação: "+this.estado);
		System.out.println("      Ano de lançamento: "+this.anoLancamento);
		System.out.println("═══════════════════════════════════════════");
	}

  	
}
