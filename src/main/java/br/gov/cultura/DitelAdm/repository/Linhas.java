package br.gov.cultura.DitelAdm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.gov.cultura.DitelAdm.model.Linha;

public interface Linhas extends JpaRepository<Linha, Integer>{
	
	public Linha findByIdLinha(Integer idLinha);
	
	public Linha findByNumeroLinhaEquals (String numeroLinha);
	
	@Query("select l from Linha l inner join l.alocacaos al WHERE al.dtDevolucao IS NULL")
	public List<Linha> findByNumeroLinha();

	public List<Linha> findByNumeroLinhaContaining(String numeroLinha);
}
