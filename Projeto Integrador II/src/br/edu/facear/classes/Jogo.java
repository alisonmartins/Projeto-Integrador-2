/*FACEAR
DISCIPLINA: PROJETO INTEGRADOR
NOME: ALISON VIEIRA MARTINS / MARLON BIELA MENDES
DATA:08.09.2017*/

package br.edu.facear.classes;

public class Jogo {
	//Atributos
	private int pontuacao;
	private int ranking;
	private String jogador1;
	private String jogador2;
	private int tempo;

	//Gets//sets
	public int getPontuacao() {
		return this.pontuacao;
	}
	public void setPontuacao(int pontuacao) {
		this.pontuacao=pontuacao;
	}
	public int getRanking() {
		return this.ranking;
	}
	public void setRanking(int ranking) {
		this.ranking=ranking;
	}
	public String getJogador1() {
		return this.jogador1;
	}
	public void setJogador1(String jogador1) {
		this.jogador1=jogador1;
	}
	public String getJogador2() {
		return this.jogador2;
	}
	public void setJogador2(String jogador2) {
		this.jogador2=jogador2;
	}
	public int getTempo() {
		return this.tempo;
	}
	public void setTempo(int tempo) {
		this.tempo=tempo;
	}
	
	// CONSTRUTOR
	
	public Jogo() {}
	public Jogo(int pontuacao, int ranking, String jogador1, String jogador2, int tempo) {
		setPontuacao(pontuacao);
		setRanking(ranking);
		setJogador1(jogador1);
		setJogador2(jogador2);
		setTempo(tempo);
	}
	// metodos
	public void Salvar() {
		System.out.println("SALVOU");
	}
	public void Exibir() {
		System.out.println("Pontuacao: "+this.pontuacao+
				           " Ranking: "+this.ranking+
				           " Jogador1: "+this.jogador1+
				           " Jogador2: "+this.jogador2+
				           " Tempo: "+this.tempo);
	}
	
}