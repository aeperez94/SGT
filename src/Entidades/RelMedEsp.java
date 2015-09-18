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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "rel_med_esp")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RelMedEsp.findAll", query = "SELECT r FROM RelMedEsp r"),
    @NamedQuery(name = "RelMedEsp.findByIdRelMedEsp", query = "SELECT r FROM RelMedEsp r WHERE r.idRelMedEsp = :idRelMedEsp")})
public class RelMedEsp implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_rel_med_esp")
    private Long idRelMedEsp;
    @JoinColumn(name = "id_especialidad", referencedColumnName = "id_especialidad")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Especialidad idEspecialidad;
    @JoinColumn(name = "id_medico", referencedColumnName = "id_medico")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Medico idMedico;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idRelMedEsp", fetch = FetchType.LAZY)
    private List<Turno> turnoList;

    public RelMedEsp() {
    }

    public RelMedEsp(Long idRelMedEsp) {
        this.idRelMedEsp = idRelMedEsp;
    }

    public Long getIdRelMedEsp() {
        return idRelMedEsp;
    }

    public void setIdRelMedEsp(Long idRelMedEsp) {
        this.idRelMedEsp = idRelMedEsp;
    }

    public Especialidad getIdEspecialidad() {
        return idEspecialidad;
    }

    public void setIdEspecialidad(Especialidad idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
    }

    public Medico getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(Medico idMedico) {
        this.idMedico = idMedico;
    }

    @XmlTransient
    public List<Turno> getTurnoList() {
        return turnoList;
    }

    public void setTurnoList(List<Turno> turnoList) {
        this.turnoList = turnoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRelMedEsp != null ? idRelMedEsp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RelMedEsp)) {
            return false;
        }
        RelMedEsp other = (RelMedEsp) object;
        if ((this.idRelMedEsp == null && other.idRelMedEsp != null) || (this.idRelMedEsp != null && !this.idRelMedEsp.equals(other.idRelMedEsp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.RelMedEsp[ idRelMedEsp=" + idRelMedEsp + " ]";
    }
    
}
