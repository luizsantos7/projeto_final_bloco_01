package projeto_final_bloco_01.repository;

import projeto_final_bloco_01.model.Produto;

public interface ProdutoRepository {
	
	public void cadastrarProduto(Produto produto);
	
	public void consultarProdutoId(int num);
	
	public void deletar(int num);
	
	public void atualizar(Produto produto);
	
	public void listarTudo();
	
	
	
}
