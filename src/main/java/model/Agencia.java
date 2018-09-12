package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * Agencia
 * @author Jerffeson Sousa
 * Classe que contém os atributos que define uma agencia.
 */

@Entity
@Table(name="agencia")
@PrimaryKeyJoinColumn(name="agenciaId")
public class Agencia {
	
	@Id
	@GeneratedValue
	@Column(name="agenciaId")
	private int agenciaId;
	
	/**
	 * atributo que define o cnpj da agencia
	 */
	@Column(name="cnpj")
	private int cnpj;
	
	/**
	 * atributo que define a inscrição estadual da agencia.
	 */
	@Column(name="inscEstadual")
	private int inscEstadual;
	
	/**
	 * atribute que defina o endereço da agencia.
	 */
	@Column(name="endereco")
	private String endereco;
	
	/**
	 * atributo que define o telefone para contato da agencia.
	 */
	@Column(name="telefone")
	private String telefone;
	
	/**
	 * atribute que define o gerente responsavel pela agencia.
	 */
	@Column(name="gerente")
	private Funcionario gerente;
	
	

	/**
	 * @param agenciaId
	 * @param cnpj
	 * @param inscEstadual
	 * @param endereco
	 * @param telefone
	 * @param gerente
	 */
	public Agencia(int agenciaId, int cnpj, int inscEstadual, String endereco,
			String telefone, Funcionario gerente) {
		super();
		this.agenciaId = agenciaId;
		this.cnpj = cnpj;
		this.inscEstadual = inscEstadual;
		this.endereco = endereco;
		this.telefone = telefone;
		this.gerente = gerente;
	}

	public int getAgenciaId() {
		return agenciaId;
	}

	public void setAgenciaId(int agenciaId) {
		this.agenciaId = agenciaId;
	}

	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}

	public int getInscEstadual() {
		return inscEstadual;
	}

	public void setInscEstadual(int inscEstadual) {
		this.inscEstadual = inscEstadual;
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

	public Funcionario getGerente() {
		return gerente;
	}

	public void setGerente(Funcionario gerente) {
		this.gerente = gerente;
	}
	
	
}
