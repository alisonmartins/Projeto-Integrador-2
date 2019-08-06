/*FACEAR
DISCIPLINA: PROJETO INTEGRADOR
NOME: ALISON VIEIRA MARTINS / MARLON BIELA MENDES
DATA:08.09.2017*/

package br.edu.facear.classes;

public class Alternativa {
	//ATRIBUTOS
	private String opcaoa;
	private String opcaob;
	private String opcaoc;
	private String opcaod;
	private String resposta;
	private String escolha;
	//GETS.SETS
	public String getOpcaoA() {
		return this.opcaoa;
	}
	public void setOpcaoA(String opcaoa) {
		this.opcaoa=opcaoa;
	}
	public String getOpcaoB() {
		return this.opcaob;
	}
	public void setOpcaoB(String opcaob) {
		this.opcaob=opcaob;
	}
	public String getOpcaoC() {
		return this.opcaoc;
	}
	public void setOpcaoC(String opcaoc) {
		this.opcaoc=opcaoc;
	}
	public String getOpcaoD() {
		return this.opcaod;
	}
	public void setOpcaoD(String opcaod) {
		this.opcaod=opcaod;
	}
	public String getResposta() {
		return this.resposta;
	}
	public void setResposta(String resposta) {
		this.resposta=resposta;
	}
	public String getEscolha() {
		return this.escolha;
	}
	public void setEscolha(String escolha) {
		this.escolha=escolha;
	}
	//CONSTRUTORES
	public Alternativa() {}
	public Alternativa(String opcaoa, String opcaob, String opcaoc, String opcaod, String resposta, String escolha) {
		setOpcaoA(opcaoa);
		setOpcaoB(opcaob);
		setOpcaoC(opcaoc);
		setOpcaoD(opcaod);
		setResposta(resposta);
		setEscolha(escolha);
	}
	public void Salvar() {
		System.out.println("SALVOU");	
	}
	public void ConferirResposta() {
		if(this.resposta==this.escolha) {
			System.out.println("Parabéns, você acertou a pergunta!");
	} else {
        System.out.println("Você errou a pergunta :(");
		}	
	}
}