package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * Veiculo
 * @author Jerffeson Sousa
 * Classe que conterá os atributos que define um veiculo
 */
 

@Entity
@Table(name = "veiculos")
@PrimaryKeyJoinColumn(name="VEICULOID")
public class Veiculo {
	@Id
	@Column(name="veiculoid")
	@GeneratedValue
	private int veiculoID;
	/**
	 * atributo que representa o registro nacional do veiculo.
	 */
	@Column(name = "renevam")
	private int RENAVAM;
	/**
	 * atributo que especifica o modelo do veiculo.
	 */
	private String modelo;
	/**
	 * atributo que define qual a marca do veiculo.
	 */
	private String marca;
	/**
	 * atributo que define a potência do veiculo em HP(cavalo de potência).
	 */
	private String potencia;
	/**
	 * atributo que define o ano de fabricação do veiculo.
	 */
	private int ano;
	/**
	 * atributo que define a cor do veiculo
	 */
	private String cor;
	/**
	 * atributo que define que tipo de combustível o veiculo usa.
	 */
	private String tipo_combustivel;
	/**
	 * atributo que define a data da aquisição do veiculo pela agência.
	 */
	private String data_aquisicao;
	/**
	 * atributo que define em que agência o veiculo está localizado.
	 */
	private String localizacao;
	/**
	 * atributo que define quanto de combustivel tinha no tanque do veiculo no momento da locação.
	 */
	private String nivel_combustivel;
	
	public Veiculo(){}
	
	/**
	 * 
	 * @param veiculoID
	 * @param rENAVAM
	 * @param modelo
	 * @param marca
	 * @param potencia
	 * @param ano
	 * @param cor
	 * @param tipo_combustivel
	 * @param data_aquisicao
	 * @param localizacao
	 * @param nivel_combustivel
	 */
	
	
	public Veiculo(int veiculoID, int rENAVAM, String modelo, String marca,
			String potencia, int ano, String cor, String tipo_combustivel,
			String data_aquisicao, String localizacao, String nivel_combustivel) {
		super();
		this.veiculoID = veiculoID;
		RENAVAM = rENAVAM;
		this.modelo = modelo;
		this.marca = marca;
		this.potencia = potencia;
		this.ano = ano;
		this.cor = cor;
		this.tipo_combustivel = tipo_combustivel;
		this.data_aquisicao = data_aquisicao;
		this.localizacao = localizacao;
		this.nivel_combustivel = nivel_combustivel;
	}
	
	
	public int getVeiculoID() {
		return veiculoID;
	}
	public void setVeiculoID(int veiculoID) {
		this.veiculoID = veiculoID;
	}
	public int getRENAVAM() {
		return RENAVAM;
	}
	public void setRENAVAM(int rENAVAM) {
		RENAVAM = rENAVAM;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getPotencia() {
		return potencia;
	}
	public void setPotencia(String potencia) {
		this.potencia = potencia;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getTipo_combustivel() {
		return tipo_combustivel;
	}
	public void setTipo_combustivel(String tipo_combustivel) {
		this.tipo_combustivel = tipo_combustivel;
	}
	public String getData_aquisicao() {
		return data_aquisicao;
	}
	public void setData_aquisicao(String data_aquisicao) {
		this.data_aquisicao = data_aquisicao;
	}
	public String getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	public String getNivel_combustivel() {
		return nivel_combustivel;
	}
	public void setNivel_combustivel(String nivel_combustivel) {
		this.nivel_combustivel = nivel_combustivel;
	}

}
