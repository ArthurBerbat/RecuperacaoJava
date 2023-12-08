package orm.actions;

import java.util.Calendar;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.mysql.fabric.xmlrpc.base.Data;

import orm.modelo.Paciente;

public class InserirPacientes {
	public static void main(String[] args) {
		
		
		/**
		 * Scanner sc = new Scanner(System.in);
	System.out.println("Please enter your name");
	String name = sc.next();
	System.out.println("Hello " + name);
	sc.close();
		 */
		Scanner sc = new Scanner(System.in);
		
		Paciente paciente1 = new Paciente();
		
		paciente1.setDataNascimento(Calendar.getInstance());
		
		System.out.println("Insira o nome do paciente");
		String nome = sc.next();
		paciente1.setNome(nome);
		
		System.out.println("Insira o CPF do paciente");
		Long CPF = sc.nextLong();
		paciente1.setCPF(CPF);
		
		System.out.println("Insira o endereço do paciente");
		String endereco = sc.next();
		paciente1.setEndereco(endereco);
		
		System.out.println("Insira o email do paciente");
		String email = sc.next();
		paciente1.setEmail(email);
		
		System.out.println("Insira o diagnostico do paciente");
		String diag = sc.next();
		paciente1.setEmail(diag);
		
		
		
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Paciente");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin(); //inicializar a transação
		manager.persist(paciente1); //linha que faz o hibernate inserir um objeto no banco
		manager.getTransaction().commit(); //Encerramento da transação
		
		manager.close();
		factory.close();
		sc.close();
		
		}

}
