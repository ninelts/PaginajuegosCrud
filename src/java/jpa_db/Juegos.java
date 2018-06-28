/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa_db;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author lalo
 */
@Entity
@Table(name = "JUEGOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Juegos.findAll", query = "SELECT j FROM Juegos j")
    , @NamedQuery(name = "Juegos.findByCodJuegos", query = "SELECT j FROM Juegos j WHERE j.codJuegos = :codJuegos")
    , @NamedQuery(name = "Juegos.findByNombreJuegos", query = "SELECT j FROM Juegos j WHERE j.nombreJuegos = :nombreJuegos")
    , @NamedQuery(name = "Juegos.findByDescripcionJuegos", query = "SELECT j FROM Juegos j WHERE j.descripcionJuegos = :descripcionJuegos")
    , @NamedQuery(name = "Juegos.findByValorJuegos", query = "SELECT j FROM Juegos j WHERE j.valorJuegos = :valorJuegos")
    , @NamedQuery(name = "Juegos.findByRequisitosMin", query = "SELECT j FROM Juegos j WHERE j.requisitosMin = :requisitosMin")
    , @NamedQuery(name = "Juegos.findByRequistosMax", query = "SELECT j FROM Juegos j WHERE j.requistosMax = :requistosMax")
    , @NamedQuery(name = "Juegos.findByImagenJuego", query = "SELECT j FROM Juegos j WHERE j.imagenJuego = :imagenJuego")
    , @NamedQuery(name = "Juegos.findByVideoJuegos", query = "SELECT j FROM Juegos j WHERE j.videoJuegos = :videoJuegos")})
public class Juegos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "COD_JUEGOS")
    private Integer codJuegos;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NOMBRE_JUEGOS")
    private String nombreJuegos;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "DESCRIPCION_JUEGOS")
    private String descripcionJuegos;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "VALOR_JUEGOS")
    private String valorJuegos;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "REQUISITOS_MIN")
    private String requisitosMin;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "REQUISTOS_MAX")
    private String requistosMax;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "IMAGEN_JUEGO")
    private String imagenJuego;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "VIDEO_JUEGOS")
    private String videoJuegos;

    public Juegos() {
    }

    public Juegos(Integer codJuegos) {
        this.codJuegos = codJuegos;
    }

    public Juegos(Integer codJuegos, String nombreJuegos, String descripcionJuegos, String valorJuegos, String requisitosMin, String requistosMax, String imagenJuego, String videoJuegos) {
        this.codJuegos = codJuegos;
        this.nombreJuegos = nombreJuegos;
        this.descripcionJuegos = descripcionJuegos;
        this.valorJuegos = valorJuegos;
        this.requisitosMin = requisitosMin;
        this.requistosMax = requistosMax;
        this.imagenJuego = imagenJuego;
        this.videoJuegos = videoJuegos;
    }

    public Juegos(String juego_cod) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Integer getCodJuegos() {
        return codJuegos;
    }

    public void setCodJuegos(Integer codJuegos) {
        this.codJuegos = codJuegos;
    }

    public String getNombreJuegos() {
        return nombreJuegos;
    }

    public void setNombreJuegos(String nombreJuegos) {
        this.nombreJuegos = nombreJuegos;
    }

    public String getDescripcionJuegos() {
        return descripcionJuegos;
    }

    public void setDescripcionJuegos(String descripcionJuegos) {
        this.descripcionJuegos = descripcionJuegos;
    }

    public String getValorJuegos() {
        return valorJuegos;
    }

    public void setValorJuegos(String valorJuegos) {
        this.valorJuegos = valorJuegos;
    }

    public String getRequisitosMin() {
        return requisitosMin;
    }

    public void setRequisitosMin(String requisitosMin) {
        this.requisitosMin = requisitosMin;
    }

    public String getRequistosMax() {
        return requistosMax;
    }

    public void setRequistosMax(String requistosMax) {
        this.requistosMax = requistosMax;
    }

    public String getImagenJuego() {
        return imagenJuego;
    }

    public void setImagenJuego(String imagenJuego) {
        this.imagenJuego = imagenJuego;
    }

    public String getVideoJuegos() {
        return videoJuegos;
    }

    public void setVideoJuegos(String videoJuegos) {
        this.videoJuegos = videoJuegos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codJuegos != null ? codJuegos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Juegos)) {
            return false;
        }
        Juegos other = (Juegos) object;
        if ((this.codJuegos == null && other.codJuegos != null) || (this.codJuegos != null && !this.codJuegos.equals(other.codJuegos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa_db.Juegos[ codJuegos=" + codJuegos + " ]";
    }
    
}
