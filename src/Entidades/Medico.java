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
@Table(name = "medico")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Medico.findAll", query = "SELECT m FROM Medico m"),
    @NamedQuery(name = "Medico.findByIdMedico", query = "SELECT m FROM Medico m WHERE m.idMedico = :idMedico"),
    @NamedQuery(name = "Medico.findByNombre", query = "SELECT m FROM Medico m WHERE m.nombre = :nombre"),
    @NamedQuery(name = "Medico.findByApellido", query = "SELECT m FROM Medico m WHERE m.apellido = :apellido"),
    @NamedQuery(name = "Medico.findByDni", query = "SELECT m FROM Medico m WHERE m.dni = :dni"),
    @NamedQuery(name = "Medico.findByTelefono", query = "SELECT m FROM Medico m WHERE m.telefono = :telefono"),
    @NamedQuery(name = "Medico.findByMail", query = "SELECT m FROM Medico m WHERE m.mail = :mail"),
    @NamedQuery(name = "Medico.findByIdMedMatr", query = "SELECT m FROM Medico m WHERE m.idMedMatr = :idMedMatr"),
    @NamedQuery(name = "Medico.findByIdAgendaMedica", query = "SELECT m FROM Medico m WHERE m.idAgendaMedica = :idAgendaMedica")})
public class Medico implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_medico")
    private Long idMedico;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "apellido")
    private String apellido;
    @Basic(optional = false)
    @Column(name = "dni")
    private long dni;
    @Basic(optional = false)
    @Column(name = "telefono")
    private String telefono;
    @Basic(optional = false)
    @Column(name = "mail")
    private String mail;
    @Basic(optional = false)
    @Column(name = "id_med_matr")
    private long idMedMatr;
    @Basic(optional = false)
    @Column(name = "id_agenda_medica")
    private long idAgendaMedica;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMedico", fetch = FetchType.LAZY)
    private List<RelMedPlan> relMedPlanList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMedico", fetch = FetchType.LAZY)
    private List<RelMedEsp> relMedEspList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idMatricula", fetch = FetchType.LAZY)
    private List<AgendaMedica> agendaMedicaList;

    public Medico() {
    }

    public Medico(Long idMedico) {
        this.idMedico = idMedico;
    }

    public Medico(Long idMedico, String nombre, String apellido, long dni, String telefono, String mail, long idMedMatr, long idAgendaMedica) {
        this.idMedico = idMedico;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.mail = mail;
        this.idMedMatr = idMedMatr;
        this.idAgendaMedica = idAgendaMedica;
    }

    public Long getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(Long idMedico) {
        this.idMedico = idMedico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public long getIdMedMatr() {
        return idMedMatr;
    }

    public void setIdMedMatr(long idMedMatr) {
        this.idMedMatr = idMedMatr;
    }

    public long getIdAgendaMedica() {
        return idAgendaMedica;
    }

    public void setIdAgendaMedica(long idAgendaMedica) {
        this.idAgendaMedica = idAgendaMedica;
    }

    @XmlTransient
    public List<RelMedPlan> getRelMedPlanList() {
        return relMedPlanList;
    }

    public void setRelMedPlanList(List<RelMedPlan> relMedPlanList) {
        this.relMedPlanList = relMedPlanList;
    }

    @XmlTransient
    public List<RelMedEsp> getRelMedEspList() {
        return relMedEspList;
    }

    public void setRelMedEspList(List<RelMedEsp> relMedEspList) {
        this.relMedEspList = relMedEspList;
    }

    @XmlTransient
    public List<AgendaMedica> getAgendaMedicaList() {
        return agendaMedicaList;
    }

    public void setAgendaMedicaList(List<AgendaMedica> agendaMedicaList) {
        this.agendaMedicaList = agendaMedicaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMedico != null ? idMedico.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Medico)) {
            return false;
        }
        Medico other = (Medico) object;
        if ((this.idMedico == null && other.idMedico != null) || (this.idMedico != null && !this.idMedico.equals(other.idMedico))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Medico[ idMedico=" + idMedico + " ]";
    }
    
}
