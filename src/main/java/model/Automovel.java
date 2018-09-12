package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Automovel
 * @author jerff
 * Essa classe define as caracteristicas de um automovel
 */

@Entity
@Table(name="veiculos")
public class Automovel extends Veiculo {
	
	@Id
	@Column(name="automovelid")
	@GeneratedValue
	private int automovelId;
	
	@Column(name="opcionais")
	private String opcionais;

	/**
	 * 
	 */
	public Automovel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
