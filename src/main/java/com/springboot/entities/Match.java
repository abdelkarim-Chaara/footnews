/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springboot.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author karim
 */
@Entity
@Table(name = "match")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Match.findAll", query = "SELECT m FROM Match m")
    , @NamedQuery(name = "Match.findById", query = "SELECT m FROM Match m WHERE m.id = :id")
    , @NamedQuery(name = "Match.findByEquipe1", query = "SELECT m FROM Match m WHERE m.equipe1 = :equipe1")
    , @NamedQuery(name = "Match.findByEquipe2", query = "SELECT m FROM Match m WHERE m.equipe2 = :equipe2")
    , @NamedQuery(name = "Match.findByResultatEQ1", query = "SELECT m FROM Match m WHERE m.resultatEQ1 = :resultatEQ1")
    , @NamedQuery(name = "Match.findByResultatEQ2", query = "SELECT m FROM Match m WHERE m.resultatEQ2 = :resultatEQ2")})
public class Match implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "equipe1")
    private String equipe1;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "equipe2")
    private String equipe2;
    @Basic(optional = false)
    @NotNull
    @Column(name = "resultatEQ1")
    private int resultatEQ1;
    @Basic(optional = false)
    @NotNull
    @Column(name = "resultatEQ2")
    private int resultatEQ2;

    public Match() {
    }

    public Match(Integer id) {
        this.id = id;
    }

    public Match(Integer id, String equipe1, String equipe2, int resultatEQ1, int resultatEQ2) {
        this.id = id;
        this.equipe1 = equipe1;
        this.equipe2 = equipe2;
        this.resultatEQ1 = resultatEQ1;
        this.resultatEQ2 = resultatEQ2;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEquipe1() {
        return equipe1;
    }

    public void setEquipe1(String equipe1) {
        this.equipe1 = equipe1;
    }

    public String getEquipe2() {
        return equipe2;
    }

    public void setEquipe2(String equipe2) {
        this.equipe2 = equipe2;
    }

    public int getResultatEQ1() {
        return resultatEQ1;
    }

    public void setResultatEQ1(int resultatEQ1) {
        this.resultatEQ1 = resultatEQ1;
    }

    public int getResultatEQ2() {
        return resultatEQ2;
    }

    public void setResultatEQ2(int resultatEQ2) {
        this.resultatEQ2 = resultatEQ2;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Match)) {
            return false;
        }
        Match other = (Match) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.springboot.entities.Match[ id=" + id + " ]";
    }
    
}
