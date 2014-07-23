package br.com.johnidouglas.java.web.model;


import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.AssertFalse.List;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "fornecedor")
public class Fornecedor implements Serializable {

    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Size(max = 45)
    @Column(name = "DESCRICAO")
    private String descricao;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fornecedor")
    
    private List<ContasPagar> contasPagarList;

    public Fornecedor() {
    }

    public Fornecedor(Integer id) {
        this.id = id;
    } 

}
