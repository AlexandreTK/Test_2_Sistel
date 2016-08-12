package br.gov.cultura.DitelAdm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.cultura.DitelAdm.model.faturasV3.Notafiscal;



public interface NotasFiscais extends JpaRepository<Notafiscal, Long>{

	public List<Notafiscal> findById(String id);
}