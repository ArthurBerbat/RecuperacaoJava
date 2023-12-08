package orm.actions;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import orm.modelo.Paciente;

public class BuscaPacientes {

    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("Paciente");
        EntityManager manager = factory.createEntityManager();

        // Query em JPQL para selecionar todos os pacientes
        Query query = manager.createQuery("SELECT p FROM Paciente p");
        List<Paciente> pacientes = query.getResultList();

        for (Paciente paciente : pacientes) {
            System.out.println("ID: " + paciente.getId() + ", Nome: " + paciente.getNome() + ", CPF: " + paciente.getCPF() + "Data de nascimento: "
            		+paciente.getDataNascimento() + "Diagnóstico: " + paciente.getDiagnostico() + "Endereço :" + paciente.getEndereco() +
            		"E-mail" + paciente.getEmail());
            
        }

        manager.close();
        factory.close();
    }
}