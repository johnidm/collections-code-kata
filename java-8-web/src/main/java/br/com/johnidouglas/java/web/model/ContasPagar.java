package br.com.johnidouglas.java.web.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table(name = "contas_pagar")
public class ContasPagar implements Serializable {

    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Size(max = 45)
    @Column(name = "DESCRICAO")
    private String descricao;
    @Column(name = "DATA_VENC")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataVenc;
    @Column(name = "VALOR")
    private Double valor;
    @JoinColumn(name = "FORNECEDOR_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Fornecedor fornecedor;
    @JoinColumn(name = "TP_DOC_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private TipoDocumento tpDoc;

    public ContasPagar() {
    }

    public ContasPagar(Integer id) {
        this.id = id;
    }
    
    

}
