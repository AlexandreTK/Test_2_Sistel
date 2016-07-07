package br.gov.cultura.DitelAdm.modelo;
// Generated 05/07/2016 12:36:15 by Hibernate Tools 4.3.1.Final

import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Planos generated by hbm2java
 */
@Entity
@Table(name = "planos", catalog = "diteladmdev")
public class Planos implements java.io.Serializable {

	private PlanosId id;
	private Categoriaplano categoriaplano;
	private Resumo resumo;
	private Date dataFimCiclo;
	private String tipo;
	private float consumoMedido;
	private float consumoFranqueado;
	private String codPlano;
	private String descricaoPlano;
	private String planoscol;
	private float valComImp;
	private float valSemImp;
	private int tipoNf;
	private String numNf;
	private String campoLivreOp;

	public Planos() {
	}

	public Planos(PlanosId id, Categoriaplano categoriaplano, Resumo resumo, Date dataFimCiclo, String tipo,
			float consumoMedido, float consumoFranqueado, float valComImp, float valSemImp, int tipoNf, String numNf) {
		this.id = id;
		this.categoriaplano = categoriaplano;
		this.resumo = resumo;
		this.dataFimCiclo = dataFimCiclo;
		this.tipo = tipo;
		this.consumoMedido = consumoMedido;
		this.consumoFranqueado = consumoFranqueado;
		this.valComImp = valComImp;
		this.valSemImp = valSemImp;
		this.tipoNf = tipoNf;
		this.numNf = numNf;
	}

	public Planos(PlanosId id, Categoriaplano categoriaplano, Resumo resumo, Date dataFimCiclo, String tipo,
			float consumoMedido, float consumoFranqueado, String codPlano, String descricaoPlano, String planoscol,
			float valComImp, float valSemImp, int tipoNf, String numNf, String campoLivreOp) {
		this.id = id;
		this.categoriaplano = categoriaplano;
		this.resumo = resumo;
		this.dataFimCiclo = dataFimCiclo;
		this.tipo = tipo;
		this.consumoMedido = consumoMedido;
		this.consumoFranqueado = consumoFranqueado;
		this.codPlano = codPlano;
		this.descricaoPlano = descricaoPlano;
		this.planoscol = planoscol;
		this.valComImp = valComImp;
		this.valSemImp = valSemImp;
		this.tipoNf = tipoNf;
		this.numNf = numNf;
		this.campoLivreOp = campoLivreOp;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "idPlanos", column = @Column(name = "idPlanos", nullable = false)),
			@AttributeOverride(name = "dataIniCiclo", column = @Column(name = "dataIniCiclo", nullable = false, length = 10)),
			@AttributeOverride(name = "categoriaPlanoCodCatPlano", column = @Column(name = "categoriaPlano_codCatPlano", nullable = false)),
			@AttributeOverride(name = "resumoId", column = @Column(name = "resumo_id", nullable = false)),
			@AttributeOverride(name = "resumoNumRecurso", column = @Column(name = "resumo_numRecurso", nullable = false, length = 20)),
			@AttributeOverride(name = "resumoFaturaNumFatura", column = @Column(name = "resumo_fatura_numFatura", nullable = false)),
			@AttributeOverride(name = "resumoFaturaClienteCodCliente", column = @Column(name = "resumo_fatura_cliente_codCliente", nullable = false, length = 15)),
			@AttributeOverride(name = "resumoFaturaClienteOperadoraCodOperadora", column = @Column(name = "resumo_fatura_cliente_operadora_codOperadora", nullable = false)),
			@AttributeOverride(name = "resumoFaturaDataEmissao", column = @Column(name = "resumo_fatura_dataEmissao", nullable = false, length = 10)) })
	public PlanosId getId() {
		return this.id;
	}

	public void setId(PlanosId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "categoriaPlano_codCatPlano", nullable = false, insertable = false, updatable = false)
	public Categoriaplano getCategoriaplano() {
		return this.categoriaplano;
	}

	public void setCategoriaplano(Categoriaplano categoriaplano) {
		this.categoriaplano = categoriaplano;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "resumo_id", referencedColumnName = "id", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "resumo_numRecurso", referencedColumnName = "numRecurso", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "resumo_fatura_numFatura", referencedColumnName = "fatura_numFatura", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "resumo_fatura_cliente_codCliente", referencedColumnName = "fatura_cliente_codCliente", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "resumo_fatura_cliente_operadora_codOperadora", referencedColumnName = "fatura_cliente_operadora_codOperadora", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "resumo_fatura_dataEmissao", referencedColumnName = "fatura_dataEmissao", nullable = false, insertable = false, updatable = false) })
	public Resumo getResumo() {
		return this.resumo;
	}

	public void setResumo(Resumo resumo) {
		this.resumo = resumo;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "dataFimCiclo", nullable = false, length = 10)
	public Date getDataFimCiclo() {
		return this.dataFimCiclo;
	}

	public void setDataFimCiclo(Date dataFimCiclo) {
		this.dataFimCiclo = dataFimCiclo;
	}

	@Column(name = "tipo", nullable = false, length = 1)
	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Column(name = "consumoMedido", nullable = false, precision = 12, scale = 0)
	public float getConsumoMedido() {
		return this.consumoMedido;
	}

	public void setConsumoMedido(float consumoMedido) {
		this.consumoMedido = consumoMedido;
	}

	@Column(name = "consumoFranqueado", nullable = false, precision = 12, scale = 0)
	public float getConsumoFranqueado() {
		return this.consumoFranqueado;
	}

	public void setConsumoFranqueado(float consumoFranqueado) {
		this.consumoFranqueado = consumoFranqueado;
	}

	@Column(name = "codPlano", length = 5)
	public String getCodPlano() {
		return this.codPlano;
	}

	public void setCodPlano(String codPlano) {
		this.codPlano = codPlano;
	}

	@Column(name = "descricaoPlano", length = 25)
	public String getDescricaoPlano() {
		return this.descricaoPlano;
	}

	public void setDescricaoPlano(String descricaoPlano) {
		this.descricaoPlano = descricaoPlano;
	}

	@Column(name = "planoscol", length = 45)
	public String getPlanoscol() {
		return this.planoscol;
	}

	public void setPlanoscol(String planoscol) {
		this.planoscol = planoscol;
	}

	@Column(name = "valComImp", nullable = false, precision = 12, scale = 0)
	public float getValComImp() {
		return this.valComImp;
	}

	public void setValComImp(float valComImp) {
		this.valComImp = valComImp;
	}

	@Column(name = "valSemImp", nullable = false, precision = 12, scale = 0)
	public float getValSemImp() {
		return this.valSemImp;
	}

	public void setValSemImp(float valSemImp) {
		this.valSemImp = valSemImp;
	}

	@Column(name = "tipoNF", nullable = false)
	public int getTipoNf() {
		return this.tipoNf;
	}

	public void setTipoNf(int tipoNf) {
		this.tipoNf = tipoNf;
	}

	@Column(name = "numNF", nullable = false, length = 12)
	public String getNumNf() {
		return this.numNf;
	}

	public void setNumNf(String numNf) {
		this.numNf = numNf;
	}

	@Column(name = "campoLivreOp", length = 25)
	public String getCampoLivreOp() {
		return this.campoLivreOp;
	}

	public void setCampoLivreOp(String campoLivreOp) {
		this.campoLivreOp = campoLivreOp;
	}

}