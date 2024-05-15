package br.com.paulooosf.individual.model;

import java.time.LocalDateTime;

import jakarta.persistence.Embeddable;

@Embeddable
public class InformacaoPublicacao {
	
	private Long id;
	
	private String autor;
	
	private LocalDateTime data;
	
	private String editora;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}
}
