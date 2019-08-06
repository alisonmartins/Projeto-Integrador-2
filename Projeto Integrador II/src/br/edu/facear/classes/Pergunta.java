/*FACEAR
DISCIPLINA: PROJETO INTEGRADOR
NOME: ALISON VIEIRA MARTINS / MARLON BIELA MENDES
DATA:08.09.2017*/

package br.edu.facear.classes;

public class Pergunta {
	//ATRIBUTOS
	private int idpergunta;
	private int qtdeavaliacao;
	// gets sets
	public int getIdPergunta() {
		return this.idpergunta;
	}
	public void setIdPergunta(int idpergunta) {
		this.idpergunta=idpergunta;
	}
	public int getQtdeAvaliacao() {
		return this.qtdeavaliacao;
	}
	public void setQtdeAvaliacao(int qtdeavaliacao) {
		this.qtdeavaliacao=qtdeavaliacao;
	}
	public Pergunta() {}
	public Pergunta(int idpergunta, int qtdeavaliacao) {
		setIdPergunta(idpergunta);
		setQtdeAvaliacao(qtdeavaliacao);
	}
	//metodos
	public void Salvar() {
		System.out.println("SALVOU");
	}
	public void Sortear() {
		System.out.println("SORTEOU");
	}
	public void ControlarPerguntaCerta() {
		System.out.println("PERGUNTA JA SORTEADA, SORTEANDO NOVAMENTE...");
	}
	
	

}
