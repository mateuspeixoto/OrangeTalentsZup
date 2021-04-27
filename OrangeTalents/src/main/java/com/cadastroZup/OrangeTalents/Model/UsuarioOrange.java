package com.cadastroZup.OrangeTalents.Model;


import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


import org.hibernate.validator.constraints.UniqueElements;
import org.hibernate.validator.constraints.br.CPF;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "usuario")
public class UsuarioOrange {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(nullable = false)
	@NotNull(message="Este campo não pode ser vazio")
	@Size(min = 3, max = 100)
	private String nome;

	@Column(unique = true, nullable = false)
	@Email
	@NotNull(message="Este campo não pode ser vazio")
	@Size(min = 3, max = 100)
	private String email;

	@Column(unique=true, nullable = false)
	@NotNull(message="Este campo não pode ser vazio")
	@Size(min = 11, max = 11)
	private String cpf;

	@Column(nullable = false)
	@NotNull(message="Este campo não pode ser vazio")
	@JsonFormat(pattern = "yyyy-MM-dd")
    private Date nascimento;

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}


	@OneToMany(cascade = CascadeType.ALL, mappedBy = "usuario")
	@JsonIgnoreProperties("usuario")
	private List<EnderecoOrange> endereco;

	
	public List<EnderecoOrange> getEndereco() {
		return endereco;
	}

	public void setEndereco(List<EnderecoOrange> endereco) {
		this.endereco = endereco;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


}
