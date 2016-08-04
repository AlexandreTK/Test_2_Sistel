package br.gov.cultura.DitelAdm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.cultura.DitelAdm.modelo.Enderecos;



public interface Enderecosas extends JpaRepository<Enderecos, Long>{

	public List<Enderecos> findByIdContaining(String id);
}