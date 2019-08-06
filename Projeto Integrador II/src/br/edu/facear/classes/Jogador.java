/*FACEAR
DISCIPLINA: PROJETO INTEGRADOR
NOME: ALISON VIEIRA MARTINS / MARLON BIELA MENDES
DATA:08.09.2017*/

package br.edu.facear.classes;

public class Jogador {
	//atributos
	private String login;
	private String senha;
	private int pontuacaohorcrux;
	private int nivel;
	
	//gets.sets
	public String getLogin() {
		return this.login;
	}
	public void setLogin(String login) {
		this.login=login;
	}
	public String getSenha() {
		return this.senha;
	}
	public void setSenha(String senha) {
		this.senha=senha;
	}
	public int getPontuacaoHorcrux() {
		return this.pontuacaohorcrux;
	}
	public void setPontuacaoHorcrux(int pontuacaohorcrux) {
		this.pontuacaohorcrux=pontuacaohorcrux;
	}
	public int getNivel() {
		return this.nivel;
	}
	public void setNivel(int nivel) {
		this.nivel=nivel;
	}
	//construtores
	public Jogador() {}
	public Jogador(String login,String senha,int pontuacaohorcrux, int nivel) {
		setLogin(login);
		setSenha(senha);
		setPontuacaoHorcrux(pontuacaohorcrux);
		setNivel(nivel);
	}
	//metodos
	public void Salvar() {
		System.out.println("SALVOU");
	}
	public void Exibir() {
		System.out.println("Login: "+this.login+
						   " Senha: "+this.senha+
						   " Pontuacao Horcrux: "+this.pontuacaohorcrux+
						   " Nivel: "+this.nivel);
	}
	public void Jogar() {
		System.out.println("JOGOU");
	}
	public void Cadastrar() {
		System.out.println("Cadastro Realizado com Sucesso!!");
	}
}
