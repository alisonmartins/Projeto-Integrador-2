/*FACEAR
DISCIPLINA: PROJETO INTEGRADOR
NOME: ALISON VIEIRA MARTINS / MARLON BIELA MENDES
DATA:08.09.2017*/

package br.edu.facear.classes;

public class Categoria {
	//ATRIBUTOS
		private int id;
		private String nome;
		
		//GETS SETS
		public int getId() {
			return this.id;
		}
		public void setId(int id) {
			this.id=id;
		}
		public String getNome() {
			return this.nome;
		}
		public void setNome(String nome) {
			this.nome=nome;
		}
		
		//CONSTRUTORES
		public Categoria() {
			System.out.println("Chamou o construtor vazio!");
		}
		public Categoria(int id, String nome) {
			setId(id);
			setNome(nome);
			System.out.println("Chamou o construtor cheio!");
		}
		
		//METODOS
		public void Salvar() {
			System.out.println("SALVOU");
		}
		public void Exibir() {
			System.out.println("ID:"+this.id+"- NOME: "+this.nome);
		}
		
		
		
		

}
