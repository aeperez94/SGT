/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Agustin
 */
@Entity
@Table(name = "rel_med_plan")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RelMedPlan.findAll", query = "SELECT r FROM RelMedPlan r"),
    @NamedQuery(name = "RelMedPlan.findByIdRedPlan", query = "SELECT r FROM RelMedPlan r WHERE r.idRedPlan = :idRedPlan")})
public class RelMedPlan implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_red_plan")
    private Long idRedPlan;
    @JoinColumn(name = "id_medico", referencedColumnName = "id_medico")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Medico idMedico;
    @JoinColumn(name = "id_plan", referencedColumnName = "id_plan")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Plan idPlan;

    public RelMedPlan() {
    }

    public RelMedPlan(Long idRedPlan) {
        this.idRedPlan = idRedPlan;
    }

    public Long getIdRedPlan() {
        return idRedPlan;
    }

    public void setIdRedPlan(Long idRedPlan) {
        this.idRedPlan = idRedPlan;
    }

    public Medico getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(Medico idMedico) {
        this.idMedico = idMedico;
    }

    public Plan getIdPlan() {
        return idPlan;
    }

    public void setIdPlan(Plan idPlan) {
        this.idPlan = idPlan;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRedPlan != null ? idRedPlan.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RelMedPlan)) {
            return false;
        }
        RelMedPlan other = (RelMedPlan) object;
        if ((this.idRedPlan == null && other.idRedPlan != null) || (this.idRedPlan != null && !this.idRedPlan.equals(other.idRedPlan))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.RelMedPlan[ idRedPlan=" + idRedPlan + " ]";
    }
    
}
