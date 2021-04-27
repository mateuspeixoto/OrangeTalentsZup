package com.cadastroZup.OrangeTalents.Model;




import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="endereco")
public class EnderecoOrange {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(nullable = false)
	@NotNull
	@Size(min=3, max=100)
	private String logradouro;
	
	@Column(nullable = false)
	@NotNull
	@Size(min=1, max=100)
	private String numero;
	
	@Column(nullable = false)
	@NotNull
	@Size(min=2, max=100)
	private String complemento;
	
	@Column(nullable = false)
	@NotNull
	@Size(min=2, max=100)
	private String bairro;
	
	@Column(nullable = false)
	@NotNull
	@Size(min=2, max=100)
	private String cidade;
	
	@Column(nullable = false)
	@NotNull
	@Size(min=3, max=100)
	private String estado;
	
	@Column(nullable = false)
	@NotNull
	@Size(min=3, max=20)
	private String cep;
	
	@ManyToOne
	@JsonIgnoreProperties("endereco")
	private UsuarioOrange usuario;

	
	public UsuarioOrange getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioOrange usuario) {
		this.usuario = usuario;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
	

}
