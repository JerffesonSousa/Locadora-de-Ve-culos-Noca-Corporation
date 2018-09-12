package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import enums.CargoEnum;

/**
 * Funcionario
 * @author Jerffeson Sousa
 * classe que define os atributos de um funcionario
 */

@Entity
@Table(name="funcionario")
@PrimaryKeyJoinColumn(name="funcionarioId")
public class Funcionario {
	
	@Id
	@Column(name="funcionarioId")
	@GeneratedValue
	private int funcionarioId;
	
	/**
	 * atributo que define o cpf do funcionario.
	 */
	@Column(name="cpf")
	private int cpf;
	
	/**
	 * atributo que define o nome do funcionario.
	 */
	@Column(name="nome")
	private String nome;
	
	/**
	 * atributo que define o registro geral(RG) do funcionario.
	 */
	@Column(name="rg")
	private String rg;
	
	/**
	 * atributo que define a data de nascimento do funcionario.
	 */
	@Column(name="data_nascimento")
	private String dataNascimento;
	
	/**
	 * atributo que define a naturalidade do funcionario.
	 */
	@Column(name="naturalidade")
	private String naturalidade;
	
	/**
	 * atributo que define o endereço do funcionario.
	 */
	@Column(name="endereco")
	private String endereco;
	
	/**
	 * atributo que define o telefone para contato do funcionario.
	 */
	@Column(name="telefone")
	private String telefone;
	
	/**
	 * atributo que define o email para contato do funcionario.
	 */
	@Column(name="email")
	private String email;
	
	/**
	 * atributo que define o cargo do funcionario(gerente ou locador).
	 */
	@Column(name="cargo")
	@Enumerated(EnumType.STRING)
	private CargoEnum cargo;
	
	

	/**
	 * 
	 */
	public Funcionario() {
		super();
	}

	/**
	 * @param funcionarioId
	 * @param cpf
	 * @param nome
	 * @param rg
	 * @param dataNascimento
	 * @param naturalidade
	 * @param endereco
	 * @param telefone
	 * @param email
	 * @param cargo
	 */
	public Funcionario(int funcionarioId, int cpf, String nome, String rg,
			String dataNascimento, String naturalidade, String endereco,
			String telefone, String email, CargoEnum cargo) {
		super();
		this.funcionarioId = funcionarioId;
		this.cpf = cpf;
		this.nome = nome;
		this.rg = rg;
		this.dataNascimento = dataNascimento;
		this.naturalidade = naturalidade;
		this.endereco = endereco;
		this.telefone = telefone;
		this.email = email;
		this.cargo = cargo;
	}

	public int getFuncionarioId() {
		return funcionarioId;
	}

	public void setFuncionarioId(int funcionarioId) {
		this.funcionarioId = funcionarioId;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getNaturalidade() {
		return naturalidade;
	}

	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public CargoEnum getCargo() {
		return cargo;
	}

	public void setCargo(CargoEnum cargo) {
		this.cargo = cargo;
	}
	
	
}
