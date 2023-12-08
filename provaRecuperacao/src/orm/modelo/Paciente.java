package orm.modelo;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/** 
 * Crie um projeto que represente um sistema para gerenciar as informações do objeto do
negócio (do mundo real) Paciente, que deverá ter os atributos Id, Nome, e-mail, CPF, Data de
Nascimento, Naturalidade, Endereço, Diagnóstico.

 * @author 36124872022.2N
 *
 */


@Entity
@Table(name = "Paciente")

public class Paciente {
	
	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	private String email;
	private Long CPF;
	private String endereco;
	private String diagnostico;
	
	@Temporal(TemporalType.DATE)
	private Calendar dataNascimento;
	
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getCPF() {
		return CPF;
	}

	public void setCPF(Long cPF) {
		CPF = cPF;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}


	

}
