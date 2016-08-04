package br.gov.cultura.DitelAdm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.cultura.DitelAdm.modelo.Fatura;



public interface Faturas extends JpaRepository<Fatura, Long>{

	public List<Fatura> findByCodBarraContaining(String codBarra);
}