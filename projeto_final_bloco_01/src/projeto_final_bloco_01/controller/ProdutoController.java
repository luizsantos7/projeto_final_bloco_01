package projeto_final_bloco_01.controller;

import java.util.ArrayList;
import java.util.Optional;

import projeto_final_bloco_01.model.Produto;
import projeto_final_bloco_01.repository.ProdutoRepository;

public class ProdutoController implements ProdutoRepository {
	
	ArrayList<Produto> listaProd = new ArrayList<Produto>();
	int numero=0;
	
	@Override
	public void cadastrarProduto(Produto produto) {
		
		listaProd.add(produto);
	}


	@Override
	public void deletar(int num) {
		
		Optional<Produto> prod = buscarId(num);
		if (prod.isPresent()) {
			if(listaProd.remove(prod.get())== true)
				System.out.printf("O produto com ID %d foi excluido com êxito!\n",num);
		}
		
	}

	@Override
	public void atualizar(Produto produto) {
			
		Optional<Produto> prod = buscarId(produto.getId());
		
		if (prod.isPresent()) {
			listaProd.set(listaProd.indexOf(prod.get()), produto);
			System.out.printf("o produto de ID %d foi atualizado com sucesso!!\n",produto.getId());
		}

			
	}

	@Override
	public void listarTudo() {

		for(var produtos : listaProd) {
			produtos.visualizar();
		}
		
	}
	
	@Override
	public void consultarProdutoId(int num) {
		
		Optional<Produto> prod = buscarId(num);
		if(prod.isPresent()) {
			prod.get().visualizar();
			}
		else {
			System.out.printf("O produto do ID %n não foi encontrado, por favor verifique novamente..", num);
		}
			
		
	}
	
	public int gerarId() {
		return ++numero;
	}
	
	public Optional<Produto> buscarId (int num) {
		for(var produtos : listaProd)
			if (produtos.getId() == num) {
				return Optional.of(produtos);
			}
		return Optional.empty();
	}

}
