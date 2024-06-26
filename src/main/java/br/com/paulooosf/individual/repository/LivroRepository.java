package br.com.paulooosf.individual.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.paulooosf.individual.model.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {
	
}
