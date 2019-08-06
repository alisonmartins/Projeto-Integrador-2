/*FACEAR
DISCIPLINA: PROJETO INTEGRADOR
NOME: ALISON VIEIRA MARTINS / MARLON BIELA MENDES
DATA:08.09.2017*/

package br.edu.facear.tela;

import br.edu.facear.classes.*;

public class Principal {

	public static void main(String[] args) {
		//INSTÂNCIA JOGO
		Jogo jog = new Jogo();
		//ATRIBUIÇÃO JOGO
		jog.setPontuacao(3);
		jog.setRanking(0);
		jog.setJogador1("Alison");
		jog.setJogador2("Marcos");
		jog.setTempo(20);
		//METODOS JOGO
		jog.Salvar();
		jog.Exibir();
	
		//INSTÂNCIA JOGADOR
		Jogador jogad = new Jogador();
		//ATRIBUIÇÃO JOGADOR
		jogad.setLogin("Alison");
		jogad.setSenha("Alison123");
		jogad.setPontuacaoHorcrux(3);
		jogad.setNivel(9);
		//METODOS JOGADOR
		jogad.Salvar();
		jogad.Exibir();
		jogad.Jogar();
		jogad.Cadastrar();
		
		//INSTÂNCIA RODADA
		Rodada rodada = new Rodada();
		//ATRIBUIÇÃO RODADA
		rodada.getCategoria();
		rodada.getJogador();
		rodada.getPergunta();
		rodada.getNumeroRodada();
		rodada.getTempo();
		//METODOS RODADA
		rodada.Salvar();
		
		//INSTÂNCIA CATEGORIA1
		Categoria cat1 = new Categoria();
		//ATRIBUIÇÃO CATEGORIA1
		cat1.setId(1);
		cat1.setNome("Geografia");		
		//METODOS CATEGORIA1
		cat1.Salvar();
		cat1.Exibir();
		//INSTÂNCIA CATEGORIA2
		Categoria cat2 = new Categoria();
		//ATRIBUIÇÃO CATEGORIA2
		cat2.setId(2);
		cat2.setNome("História");		
		//METODOS CATEGORIA2
		cat2.Salvar();
		cat2.Exibir();
		//INSTÂNCIA CATEGORIA3
		Categoria cat3 = new Categoria();
		//ATRIBUIÇÃO CATEGORIA3
		cat3.setId(3);
		cat3.setNome("Ciência");		
		//METODOS CATEGORIA3
		cat3.Salvar();
		cat3.Exibir();
		//INSTÂNCIA CATEGORIA4
		Categoria cat4 = new Categoria();
		//ATRIBUIÇÃO CATEGORIA4
		cat4.setId(4);
		cat4.setNome("Programação");		
		//METODOS CATEGORIA4
		cat4.Salvar();
		cat4.Exibir();
		//INSTÂNCIA CATEGORIA5
		Categoria cat5 = new Categoria();
		//ATRIBUIÇÃO CATEGORIA5
		cat5.setId(5);
		cat5.setNome("Game");		
		//METODOS CATEGORIA5
		cat5.Salvar();
		cat5.Exibir();
		//INSTÂNCIA CATEGORIA6
		Categoria cat6 = new Categoria();
		//ATRIBUIÇÃO CATEGORIA6
		cat6.setId(6);
		cat6.setNome("Atualidade");		
		//METODOS CATEGORIA
		cat6.Salvar();
		cat6.Exibir();
		
		//INSTÂNCIA PERGUNTA
		Pergunta pergunta = new Pergunta();
		//ATRIBUIÇÃO PERGUNTA
		pergunta.setIdPergunta(0);
		pergunta.setQtdeAvaliacao(0);
		//METODOS PERGUNTA
		pergunta.Salvar();
		pergunta.Sortear();
		pergunta.ControlarPerguntaCerta();
		
		//INSTÂNCIA ALTERNATIVA
		Alternativa alternativa = new Alternativa();
		//ATRIBUIÇÃO ALTERNATIVA
		alternativa.setOpcaoA(null);
		alternativa.setOpcaoB(null);
		alternativa.setOpcaoC(null);
		alternativa.setOpcaoD(null);
		alternativa.setResposta("Alison");
		alternativa.setEscolha("Alison");
		//METODOS ALTERNATIVA
		alternativa.Salvar();
		alternativa.ConferirResposta();
		
		//INSTÂNCIA QUANTIDADE DE AVALIAÇÃO
		AvaliarPergunta avaperg = new AvaliarPergunta();
		//ATRIBUIÇÃO QUANTIDADE DE AVALIAÇÃO
		avaperg.setJogador("Alison");
		avaperg.setIdPergunta(23);
		avaperg.setAvaliacao(true);
		//METODOS QUANTIDADE DE AVALIAÇÃO
		avaperg.Salvar();
		avaperg.Exibir();
		
		//INSTÂNCIA QUANTIDADE DE PERGUNTA CORRETA
		QuantidadePerguntaCorreta qtdepergcorr = new QuantidadePerguntaCorreta();
		//ATRIBUIÇÃO QUANTIDADE DE PERGUNTA CORRETA
		qtdepergcorr.setJogador("Alison");
		qtdepergcorr.setPerguntaSemana(23);
		qtdepergcorr.setPerguntaMes(210);
		//METODOS QUANTIDADE DE PERGUNTA CORRETA
		qtdepergcorr.Salvar();
		qtdepergcorr.Exibir();
		
	}
}
