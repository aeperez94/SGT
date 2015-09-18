/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Agustin
 */
@Entity
@Table(name = "plan")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Plan.findAll", query = "SELECT p FROM Plan p"),
    @NamedQuery(name = "Plan.findByIdPlan", query = "SELECT p FROM Plan p WHERE p.idPlan = :idPlan"),
    @NamedQuery(name = "Plan.findByNombre", query = "SELECT p FROM Plan p WHERE p.nombre = :nombre"),
    @NamedQuery(name = "Plan.findByCobertura", query = "SELECT p FROM Plan p WHERE p.cobertura = :cobertura")})
public class Plan implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_plan")
    private Long idPlan;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "cobertura")
    private long cobertura;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPlan", fetch = FetchType.LAZY)
    private List<RelMedPlan> relMedPlanList;

    public Plan() {
    }

    public Plan(Long idPlan) {
        this.idPlan = idPlan;
    }

    public Plan(Long idPlan, String nombre, long cobertura) {
        this.idPlan = idPlan;
        this.nombre = nombre;
        this.cobertura = cobertura;
    }

    public Long getIdPlan() {
        return idPlan;
    }

    public void setIdPlan(Long idPlan) {
        this.idPlan = idPlan;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getCobertura() {
        return cobertura;
    }

    public void setCobertura(long cobertura) {
        this.cobertura = cobertura;
    }

    @XmlTransient
    public List<RelMedPlan> getRelMedPlanList() {
        return relMedPlanList;
    }

    public void setRelMedPlanList(List<RelMedPlan> relMedPlanList) {
        this.relMedPlanList = relMedPlanList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPlan != null ? idPlan.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Plan)) {
            return false;
        }
        Plan other = (Plan) object;
        if ((this.idPlan == null && other.idPlan != null) || (this.idPlan != null && !this.idPlan.equals(other.idPlan))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Plan[ idPlan=" + idPlan + " ]";
    }
    
}
