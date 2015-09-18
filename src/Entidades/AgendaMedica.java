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
@Table(name = "agenda_medica")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AgendaMedica.findAll", query = "SELECT a FROM AgendaMedica a"),
    @NamedQuery(name = "AgendaMedica.findByIdAgendaMedica", query = "SELECT a FROM AgendaMedica a WHERE a.idAgendaMedica = :idAgendaMedica"),
    @NamedQuery(name = "AgendaMedica.findByDia", query = "SELECT a FROM AgendaMedica a WHERE a.dia = :dia"),
    @NamedQuery(name = "AgendaMedica.findByHorarioDesde", query = "SELECT a FROM AgendaMedica a WHERE a.horarioDesde = :horarioDesde"),
    @NamedQuery(name = "AgendaMedica.findByHorarioHasta", query = "SELECT a FROM AgendaMedica a WHERE a.horarioHasta = :horarioHasta")})
public class AgendaMedica implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_agenda_medica")
    private Long idAgendaMedica;
    @Basic(optional = false)
    @Column(name = "dia")
    private String dia;
    @Basic(optional = false)
    @Column(name = "horario_desde")
    private String horarioDesde;
    @Basic(optional = false)
    @Column(name = "horario_hasta")
    private String horarioHasta;
    @JoinColumn(name = "id_matricula", referencedColumnName = "id_med_matr")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Medico idMatricula;

    public AgendaMedica() {
    }

    public AgendaMedica(Long idAgendaMedica) {
        this.idAgendaMedica = idAgendaMedica;
    }

    public AgendaMedica(Long idAgendaMedica, String dia, String horarioDesde, String horarioHasta) {
        this.idAgendaMedica = idAgendaMedica;
        this.dia = dia;
        this.horarioDesde = horarioDesde;
        this.horarioHasta = horarioHasta;
    }

    public Long getIdAgendaMedica() {
        return idAgendaMedica;
    }

    public void setIdAgendaMedica(Long idAgendaMedica) {
        this.idAgendaMedica = idAgendaMedica;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHorarioDesde() {
        return horarioDesde;
    }

    public void setHorarioDesde(String horarioDesde) {
        this.horarioDesde = horarioDesde;
    }

    public String getHorarioHasta() {
        return horarioHasta;
    }

    public void setHorarioHasta(String horarioHasta) {
        this.horarioHasta = horarioHasta;
    }

    public Medico getIdMatricula() {
        return idMatricula;
    }

    public void setIdMatricula(Medico idMatricula) {
        this.idMatricula = idMatricula;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAgendaMedica != null ? idAgendaMedica.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AgendaMedica)) {
            return false;
        }
        AgendaMedica other = (AgendaMedica) object;
        if ((this.idAgendaMedica == null && other.idAgendaMedica != null) || (this.idAgendaMedica != null && !this.idAgendaMedica.equals(other.idAgendaMedica))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.AgendaMedica[ idAgendaMedica=" + idAgendaMedica + " ]";
    }
    
}
