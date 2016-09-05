package br.gov.cultura.DitelAdm.model;
// Generated 05/09/2016 11:00:27 by Hibernate Tools 4.3.4.Final

import static javax.persistence.GenerationType.IDENTITY;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Categoria generated by hbm2java
 */
@Entity
@Table(name = "categoria", catalog = "diteladmdev", uniqueConstraints = @UniqueConstraint(columnNames = "descricao_categoria"))
public class Categoria implements java.io.Serializable {

	private Integer idCategoria;
	private String descricaoCategoria;
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private Set<AlocacaoLinhaCategoria> alocacaoLinhaCategorias = new HashSet(0);

	public Categoria() {
	}

	public Categoria(String descricaoCategoria) {
		this.descricaoCategoria = descricaoCategoria;
	}

	public Categoria(String descricaoCategoria, Set<AlocacaoLinhaCategoria> alocacaoLinhaCategorias) {
		this.descricaoCategoria = descricaoCategoria;
		this.alocacaoLinhaCategorias = alocacaoLinhaCategorias;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_categoria", unique = true, nullable = false)
	public Integer getIdCategoria() {
		return this.idCategoria;
	}

	public void setIdCategoria(Integer idCategoria) {
		this.idCategoria = idCategoria;
	}

	@Column(name = "descricao_categoria", unique = true, nullable = false)
	public String getDescricaoCategoria() {
		return this.descricaoCategoria;
	}

	public void setDescricaoCategoria(String descricaoCategoria) {
		this.descricaoCategoria = descricaoCategoria;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "categoria")
	public Set<AlocacaoLinhaCategoria> getAlocacaoLinhaCategorias() {
		return this.alocacaoLinhaCategorias;
	}

	public void setAlocacaoLinhaCategorias(Set<AlocacaoLinhaCategoria> alocacaoLinhaCategorias) {
		this.alocacaoLinhaCategorias = alocacaoLinhaCategorias;
	}

}