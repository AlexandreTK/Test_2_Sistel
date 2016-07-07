package br.gov.cultura.DitelAdm.modelo;
// Generated 05/07/2016 12:36:15 by Hibernate Tools 4.3.1.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Notafiscal generated by hbm2java
 */
@Entity
@Table(name = "notafiscal", catalog = "diteladmdev")
public class Notafiscal implements java.io.Serializable {

	private NotafiscalId id;
	private Fatura fatura;
	private float valorNfimp;
	private String tipoNf;
	private String campoLivreOp;

	public Notafiscal() {
	}

	public Notafiscal(NotafiscalId id, Fatura fatura, float valorNfimp, String tipoNf) {
		this.id = id;
		this.fatura = fatura;
		this.valorNfimp = valorNfimp;
		this.tipoNf = tipoNf;
	}

	public Notafiscal(NotafiscalId id, Fatura fatura, float valorNfimp, String tipoNf, String campoLivreOp) {
		this.id = id;
		this.fatura = fatura;
		this.valorNfimp = valorNfimp;
		this.tipoNf = tipoNf;
		this.campoLivreOp = campoLivreOp;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "numNf", column = @Column(name = "numNF", nullable = false, length = 12)),
			@AttributeOverride(name = "faturaNumFatura", column = @Column(name = "fatura_numFatura", nullable = false)),
			@AttributeOverride(name = "faturaClienteCodCliente", column = @Column(name = "fatura_cliente_codCliente", nullable = false, length = 15)),
			@AttributeOverride(name = "faturaClienteOperadoraCodOperadora", column = @Column(name = "fatura_cliente_operadora_codOperadora", nullable = false)),
			@AttributeOverride(name = "faturaDataEmissao", column = @Column(name = "fatura_dataEmissao", nullable = false, length = 10)) })
	public NotafiscalId getId() {
		return this.id;
	}

	public void setId(NotafiscalId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "fatura_numFatura", referencedColumnName = "numFatura", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "fatura_cliente_codCliente", referencedColumnName = "cliente_codCliente", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "fatura_cliente_operadora_codOperadora", referencedColumnName = "cliente_operadora_codOperadora", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "fatura_dataEmissao", referencedColumnName = "dataEmissao", nullable = false, insertable = false, updatable = false) })
	public Fatura getFatura() {
		return this.fatura;
	}

	public void setFatura(Fatura fatura) {
		this.fatura = fatura;
	}

	@Column(name = "valorNFImp", nullable = false, precision = 12, scale = 0)
	public float getValorNfimp() {
		return this.valorNfimp;
	}

	public void setValorNfimp(float valorNfimp) {
		this.valorNfimp = valorNfimp;
	}

	@Column(name = "tipoNF", nullable = false, length = 1)
	public String getTipoNf() {
		return this.tipoNf;
	}

	public void setTipoNf(String tipoNf) {
		this.tipoNf = tipoNf;
	}

	@Column(name = "campoLivreOp", length = 25)
	public String getCampoLivreOp() {
		return this.campoLivreOp;
	}

	public void setCampoLivreOp(String campoLivreOp) {
		this.campoLivreOp = campoLivreOp;
	}

}