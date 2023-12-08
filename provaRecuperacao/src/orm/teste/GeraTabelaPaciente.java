package orm.teste;


import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class GeraTabelaPaciente {

//classe responsável pelo DDL no banco
//relativo a classe Tarefa

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Paciente");
		factory.close();
	}

}
