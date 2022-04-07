package com.example.aula3;

import java.util.List;

import com.example.aula3.entity.CategoriaProduto;
import com.example.aula3.entity.Perfil;
import com.example.aula3.entity.Produto;
import com.example.aula3.entity.Usuario;
import com.example.aula3.repository.CategoriaProdutoRepository;
import com.example.aula3.repository.PerfilRepository;
import com.example.aula3.repository.ProdutoRepository;
import com.example.aula3.repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Aula3Application {

	@Bean
	public CommandLineRunner 
	init (@Autowired CategoriaProdutoRepository catProdutoRepository,
			@Autowired ProdutoRepository produtoRepository){
		return args ->{
			//int idCategoria, String nome, String catDescricao
			CategoriaProduto catProduto1 = new CategoriaProduto(0, "Ensino", 
																"Categoria dedicados a ensino");

			catProdutoRepository.inserir(catProduto1);

			//int id, String nome, int qtdProduto, int idCategoria
			Produto prod1 = new Produto(0, "Livro", 1);
			Produto prod2 = new Produto(0, "Livro", 1);

			prod1.setIdCategoria(catProduto1);
			produtoRepository.inserir(prod1);
			//produtoRepository.inserir(prod2);
			//produtoRepository.excluir(prod1);

			System.out.println(produtoRepository.obterPorId(2));
			//System.out.println(listaProdutos);
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(Aula3Application.class, args);
	}

}