/*FACEAR
DISCIPLINA: PROJETO INTEGRADOR
NOME: ALISON VIEIRA MARTINS / MARLON BIELA MENDES
DATA:08.09.2017*/

package br.edu.facear.classes;

public class Rodada {
	//ATRIBUTOS
	private String categoria;
	private String jogador;
	private String pergunta;
	private int numerorodada;
	private int tempo;
	//gets.sets
	public String getCategoria() {
		return this.categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria=categoria;
	}
	public String getJogador() {
		return this.jogador;
	}
	public void setJogador(String jogador) {
		this.jogador=jogador;
	}
	public String getPergunta() {
		return this.pergunta;
	}
	public void setPergunta(String pergunta) {
		this.pergunta=pergunta;
	}
	public int getNumeroRodada() {
		return this.numerorodada;
	}
	public void setNumeroRodada(int numerorodada) {
		this.numerorodada=numerorodada;
	}
	public int getTempo() {
		return this.tempo;
	}
	public void setTempo(int tempo) {
		this.tempo=tempo;
	}
	//CONSTRUTORES
	public Rodada() {}
	public Rodada(String categoria,String jogador, String pergunta,int numerorodada, int tempo) {
		setCategoria(categoria);
		setJogador(jogador);
		setPergunta(pergunta);
		setNumeroRodada(numerorodada);
		setTempo(tempo);
	}
	//METODOS
	public void Salvar() {
		System.out.println("SALVOU");
	}
}
