package br.gov.cultura.DitelAdm.model;
// Generated 24/08/2016 15:08:19 by Hibernate Tools 4.3.4.Final

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
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.NumberFormat;

import com.fasterxml.jackson.annotation.JsonManagedReference;

/**
 * LimiteAtesto MODEL
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "limite_atesto", catalog = "dbditel")
public class LimiteAtesto implements java.io.Serializable {

	private Integer idLimiteAtesto;
	private String dasAtesto;
	private float valorLimite;
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@JsonManagedReference
	private Set<Usuario> usuarios = new HashSet(0);
	public LimiteAtesto() {
	}

	public LimiteAtesto(Integer idLimiteAtesto, String dasAtesto, float valorLimite) {
		this.idLimiteAtesto = idLimiteAtesto;
		this.dasAtesto = dasAtesto;
		this.valorLimite = valorLimite;
	}

	public LimiteAtesto(Integer idLimiteAtesto, String dasAtesto, float valorLimite, Set<Usuario> usuarios) {
		this.idLimiteAtesto = idLimiteAtesto;
		this.dasAtesto = dasAtesto;
		this.valorLimite = valorLimite;
		this.usuarios = usuarios;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_limite_atesto", unique = true, nullable = false)
	public Integer getIdLimiteAtesto() {
		return this.idLimiteAtesto;
	}

	public void setIdLimiteAtesto(Integer idLimiteAtesto) {
		this.idLimiteAtesto = idLimiteAtesto;
	}

	@Column(name = "das_atesto", nullable = false)
	@Size(max=200,message="Maximo de caracteres para DAS Atesto excedido!")
	@NotEmpty(message="Das Atesto e obrigatório!")
	public String getDasAtesto() {
		return this.dasAtesto;
	}

	public void setDasAtesto(String dasAtesto) {
		this.dasAtesto = dasAtesto;
	}

	@Column(name = "valor_limite", nullable = false, precision = 10, scale = 0)
	@NotNull(message="Valor e obrigatorio!")
	@DecimalMin(value = "0.01", message = "Valor minimo de R$0,01!" )
	@DecimalMax(value = "9999999.99", message ="Valor ultrapassa valor maximo!")
	@NumberFormat(pattern="#,##0.00")
	public float getValorLimite() {
		return this.valorLimite;
	}

	public void setValorLimite(float valorLimite) {
		this.valorLimite = valorLimite;
	}

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "limiteAtesto")
	public Set<Usuario> getUsuarios() {
		return this.usuarios;
	}

	public void setUsuarios(Set<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

}
