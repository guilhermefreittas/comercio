package com.itb.inf2em.comercio.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itb.inf2em.comercio.model.Produto;

@Controller
@RequestMapping("/comercio/produto")
public class LojaController {

	List<Produto>  listaDeProdutos = new ArrayList<Produto>();
	
	@GetMapping("/listar")
	public String litarProduto(Model model) {
		
		Produto produto;
		
		produto = new Produto();
		
		produto.setId(20l);
		produto.setNome("Televisor Samsung 75'");
		produto.setDescricao("Televisor Tela Plana de Plasma FullHD");
		produto.setPreco(5467.99);
		produto.setCodigoBarras("ASDFGHJKL123");
		
		Produto produto2 = new Produto();
		
		produto.setId(21l);
		produto.setNome("geladeira inteligente electrolux'");
		produto.setDescricao("geladeira com assistente virtual integrada");
		produto.setPreco(3450.99);
		produto.setCodigoBarras("QWERTYUUIIO0");
		
		listaDeProdutos.add(produto);
		listaDeProdutos.add(produto2);
		
		model.addAttribute("listaDeProdutos",listaDeProdutos);
		return "produtos";
		
	}
	
	@GetMapping("/novo-produto")
	public String novoProduto() {
		
		return "novo-prod";
		
	}
}
