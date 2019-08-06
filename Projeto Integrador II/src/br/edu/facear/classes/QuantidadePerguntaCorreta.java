/*FACEAR
DISCIPLINA: PROJETO INTEGRADOR
NOME: ALISON VIEIRA MARTINS / MARLON BIELA MENDES
DATA:08.09.2017*/

package br.edu.facear.classes;

public class QuantidadePerguntaCorreta {
	//ATRIBUTOS
	private String jogador;
	private int perguntames;
	private int perguntasemana;
	//GETS.SETS
	public String getJogador() {
		return this.jogador;
	}
	public void setJogador(String jogador) {
		this.jogador=jogador;
	}
	public int getPerguntaMes() {
		return this.perguntames;
	}
	public void setPerguntaMes(int perguntames) {
		this.perguntames=perguntames;
	}
	public int getPerguntaSemana() {
		return this.perguntasemana;
	}
	public void setPerguntaSemana(int perguntasemana) {
		this.perguntasemana=perguntasemana;
	}
	//CONSTRUTORES
	public QuantidadePerguntaCorreta() {}
	public QuantidadePerguntaCorreta(String jogador, int perguntames, int perguntasemana) {
		setJogador(jogador);
		setPerguntaMes(perguntames);
		setPerguntaSemana(perguntasemana);
	}
	//METODOS
	public void Salvar() {
		System.out.println("SALVOU");
	}
	public void Exibir() {
		System.out.println("Jogador: "+this.jogador+" - Perguntas certas na semana: "+this.perguntasemana+"- Perguntas certas no mês: "+this.perguntames);
	}

}
