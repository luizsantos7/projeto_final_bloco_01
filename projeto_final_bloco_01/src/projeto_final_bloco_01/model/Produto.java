package projeto_final_bloco_01.model;

import projeto_final_bloco_01.util.Cores;

public abstract class Produto {
	private int id;
	private String nome;
	private int categoria;
	private float preco;
	private int estoque;
	

	public Produto(int id, String nome, int categoria, float preco, int estoque) {
		super();
		this.id = id;
		this.nome = nome;
		this.categoria = categoria;
		this.preco = preco;
		this.estoque = estoque;
	}
	
	public void visualizar() {
		String catego = "";
		
		switch(this.categoria) {
		case 1 -> catego = "Action Figure";
		case 2 -> catego = "Decoração";
		case 3 -> catego = "HQ // Comic";
		}
		
		System.out.println(Cores.TEXT_RESET+"═══════════════════════════════════════════");
		System.out.println("      Nome: "+ this.nome);
		System.out.println("      Categoria: "+catego);
		System.out.println("      ID: "+this.id);
		System.out.println("      Preço: "+this.preco);
		System.out.println("      Quantidade em estoque: "+ this.estoque);
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
}
