package st.evora.engenharia.model;


import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name = "cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idcliente;

	@Column(nullable = false)
	private String nome;
	
	private String email;
	private String telefone;
	
	@Column(nullable = false)
	private String endereco;
	
	@Column(nullable = false)
	private String nip;
	
	private String energia;
	private String descricao;

	public Cliente(){	
	}
	
	public Cliente(Integer idcliente, 
			String nome, 
			String email, 
			String telefone, 
			String endereco, 
			String nip, 
			String energia,
			String descricao
			) {
		super();
		this.idcliente = idcliente;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.endereco = endereco;
		this.nip = nip;
		this.energia = energia;
		this.descricao = descricao;
		
	}

	public Integer getIdcliente() {
		return idcliente;
	}

	public void setIdcliente(Integer idcliente) {
		this.idcliente = idcliente;
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

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNip() {
		return nip;
	}

	public void setNip(String nip) {
		this.nip = nip;
	}
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getEnergia() {
		return energia;
	}
	public void setEnergia(String energia) {
		this.energia = energia;
	}

	@Override
	public String toString() {
		return "Cliente [idcliente=" + idcliente + ", nome=" + nome + ", email=" + email + ", telefone=" + telefone
				+ ", endereco=" + endereco + ", nip=" + nip + ", energia=" + energia + ", descricao=" + descricao + "]";
	}
	
	
}