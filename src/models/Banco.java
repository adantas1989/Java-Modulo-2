package models;

import javax.persistence.*;

@Entity
@Table(name = "banco")
public class Banco {

	@Id
	@GeneratedValue(generator = "sequence_banco", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "sequence_banco", sequenceName = "sequence_banco", initialValue = 1, allocationSize = 1)
	private Integer id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "endereco")
	private String endereco;
	
	@Column(name = "telefone")
	private String telefone;
	
	@Column(name = "tipo_banco", nullable = false)
	private TipoBanco tipo;

	public Banco(int id, String nome, String endereco, String telefone, TipoBanco tipo) {

		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.tipo = tipo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	   @Override
	    public String toString() {
	        return "Banco{" +
	                "id=" + id +
	                ", nome='" + nome + '\'' +
	                ", endereco='" + endereco + '\'' +
	                ", telefone='" + telefone + '\'' +
	                ", tipo=" + tipo +
	                '}';
	    }
}
