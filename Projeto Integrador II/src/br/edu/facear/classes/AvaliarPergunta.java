/*FACEAR
DISCIPLINA: PROJETO INTEGRADOR
NOME: ALISON VIEIRA MARTINS / MARLON BIELA MENDES
DATA:08.09.2017*/

package br.edu.facear.classes;

public class AvaliarPergunta {
	//ATRIBUTOS
	private String jogador;
	private int idpergunta;
	private boolean avaliacao;
	//GETS.SETS
	public String getJogador() {
		return this.jogador;
	}
	public void setJogador(String jogador) {
		this.jogador=jogador;
	}
	public int getIdPergunta() {
		return this.idpergunta;
	}
	public void setIdPergunta(int idpergunta) {
		this.idpergunta=idpergunta;
	}
	public boolean setAvaliacao() {
		return this.avaliacao;
	}
	public void setAvaliacao(boolean avaliacao) {
		this.avaliacao=avaliacao;
	}
	//CONSTRUTORES
	public AvaliarPergunta() {}
	public AvaliarPergunta(String jogador, int idpergunta, boolean avaliacao) {
		setJogador(jogador);
		setIdPergunta(idpergunta);
		setAvaliacao(avaliacao);
	}
	
	//METODOS
	public void Salvar() {
		System.out.println("SALVOU");
	}
	public void Exibir() {
		System.out.println("Jogador: "+this.jogador+"ID Pergunta: "+this.idpergunta);
		if(this.avaliacao==true) {
			System.out.println("Avaliação: Você deu LIKE nesta pergunta!");
		}else {
			System.out.println("Avaliação: Você deu DESLIKE nesta pergunta!");
		}
	}
}
