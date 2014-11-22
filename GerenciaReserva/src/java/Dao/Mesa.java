/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Dao;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ildevana
 */
@Entity
@Table(name = "MESA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mesa.findAll", query = "SELECT m FROM Mesa m"),
    @NamedQuery(name = "Mesa.findByIdmesa", query = "SELECT m FROM Mesa m WHERE m.idmesa = :idmesa"),
    @NamedQuery(name = "Mesa.findByQtdpessoas", query = "SELECT m FROM Mesa m WHERE m.qtdpessoas = :qtdpessoas")})
public class Mesa implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDMESA")
    private Integer idmesa;
    @Column(name = "QTDPESSOAS")
    private Integer qtdpessoas;

    public Mesa() {
    }

    public Mesa(Integer idmesa) {
        this.idmesa = idmesa;
    }

    public Integer getIdmesa() {
        return idmesa;
    }

    public void setIdmesa(Integer idmesa) {
        this.idmesa = idmesa;
    }

    public Integer getQtdpessoas() {
        return qtdpessoas;
    }

    public void setQtdpessoas(Integer qtdpessoas) {
        this.qtdpessoas = qtdpessoas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmesa != null ? idmesa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mesa)) {
            return false;
        }
        Mesa other = (Mesa) object;
        if ((this.idmesa == null && other.idmesa != null) || (this.idmesa != null && !this.idmesa.equals(other.idmesa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Models.Mesa[ idmesa=" + idmesa + " ]";
    }
    
}
