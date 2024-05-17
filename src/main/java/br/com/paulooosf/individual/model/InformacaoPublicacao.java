package br.com.paulooosf.individual.model;

import java.time.LocalDate;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Embeddable
public class InformacaoPublicacao {
	
	@NotBlank(message = "Preencha o autor!")
	private String autor;
	
	@NotNull(message = "Preencha a data!")
	private LocalDate data;
	
	@NotBlank(message = "Preencha a editora!")
	private String editora;

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}
}
