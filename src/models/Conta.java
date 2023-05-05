package models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name = "conta")
@DynamicInsert
@DynamicUpdate
public class Conta {

	@Id
	@GeneratedValue(generator = "sequence_conta", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "sequence_conta", sequenceName = "sequence_conta", initialValue = 1, allocationSize = 1)
	@Column(name = "id_conta")
	private Integer id;

	@Column(name = "n_conta", nullable = false)
	private String nConta;

	@Column(name = "saldo")
	private double saldo;

	@Column(name = "tipo_conta", nullable = false)
	private TipoConta tipo;

	@ManyToOne(fetch = FetchType.LAZY, cascade = { CascadeType.DETACH, CascadeType.REFRESH })
	@JoinColumn(name = "id_usuario")
	private Usuario conta;

	public Conta(Integer id, String nConta, double saldo, TipoConta tipo, Usuario conta) {
		super();
		this.id = id;
		this.nConta = nConta;
		this.saldo = saldo;
		this.tipo = tipo;
		this.conta = conta;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getnConta() {
		return nConta;
	}

	public void setnConta(String nConta) {
		this.nConta = nConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public TipoConta getTipo() {
		return tipo;
	}

	public void setTipo(TipoConta tipo) {
		this.tipo = tipo;
	}

	public Usuario getConta() {
		return conta;
	}

	public void setConta(Usuario conta) {
		this.conta = conta;
	}

}
