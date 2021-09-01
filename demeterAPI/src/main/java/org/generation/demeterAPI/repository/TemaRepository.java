package org.generation.demeterAPI.repository;

import java.util.List;

import org.generation.demeterAPI.model.Tema;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TemaRepository extends JpaRepository<Tema, Long>{
	public List<Tema> findAllByCategoriaContainingIgnoreCase(String categoria);
	public List<Tema> findAllByFiltroContainingIgnoreCase(String filtro);
	public List<Tema> findAllByLocalidadeContainingIgnoreCase(String localidade);
}
