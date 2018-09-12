package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * Veiculo
 * 
 * @author Jerffeson Sousa Classe que conterá os atributos que define um veiculo
 */

@Entity
@Table(name = "veiculos")
@PrimaryKeyJoinColumn(name = "veiculoId")
public abstract class Veiculo {
	@Id
	@Column(name = "veiculoId")
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
	@Column(name = "modelo")
	private String modelo;
	/**
	 * atributo que define qual a marca do veiculo.
	 */
	@Column(name = "marca")
	private String marca;
	/**
	 * atributo que define a potência do veiculo em HP(cavalo de potência).
	 */
	@Column(name = "potencia")
	private String potencia;
	/**
	 * atributo que define o ano de fabricação do veiculo.
	 */
	@Column(name = "ano")
	private int ano;
	/**
	 * atributo que define a cor do veiculo
	 */
	@Column(name = "cor")
	private String cor;
	/**
	 * atributo que define que tipo de combustível o veiculo usa.
	 */
	@Column(name = "tipo_combustivel")
	private String tipoCombustivel;
	/**
	 * atributo que define a data da aquisição do veiculo pela agência.
	 */
	@Column(name = "data_aquisicao")
	private String dataAquisicao;
	/**
	 * atributo que define em que agência o veiculo está localizado.
	 */
	@Column(name = "localizacao")
	private String localizacao;
	/**
	 * atributo que define quanto de combustivel tinha no tanque do veiculo no
	 * momento da locação.
	 */
	@Column(name = "nivel_combustivel")
	private String nivelCombustivel;

	public Veiculo() {
	}

	

	/**
	 * @param veiculoID
	 * @param rENAVAM
	 * @param modelo
	 * @param marca
	 * @param potencia
	 * @param ano
	 * @param cor
	 * @param tipoCombustivel
	 * @param dataAquisicao
	 * @param localizacao
	 * @param nivelCombustivel
	 */
	public Veiculo(int veiculoID, int rENAVAM, String modelo, String marca,
			String potencia, int ano, String cor, String tipoCombustivel,
			String dataAquisicao, String localizacao, String nivelCombustivel) {
		super();
		this.veiculoID = veiculoID;
		RENAVAM = rENAVAM;
		this.modelo = modelo;
		this.marca = marca;
		this.potencia = potencia;
		this.ano = ano;
		this.cor = cor;
		this.tipoCombustivel = tipoCombustivel;
		this.dataAquisicao = dataAquisicao;
		this.localizacao = localizacao;
		this.nivelCombustivel = nivelCombustivel;
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

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public String getTipoCombustivel() {
		return tipoCombustivel;
	}

	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}

	public String getDataAquisicao() {
		return dataAquisicao;
	}

	public void setDataAquisicao(String dataAquisicao) {
		this.dataAquisicao = dataAquisicao;
	}

	public String getNivelCombustivel() {
		return nivelCombustivel;
	}

	public void setNivelCombustivel(String nivelCombustivel) {
		this.nivelCombustivel = nivelCombustivel;
	}

}
