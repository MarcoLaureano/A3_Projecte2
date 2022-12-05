package com.m13.reprojecteFinal.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Modul {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    String nom;
    int horestotal;
    int dilluns,dimarts,dimecres,dijous,divendres;

    public Modul() {
    }

    public Modul(long id, String nom, int horestotal, int dilluns, int dimarts, int dimecres, int dijous, int divendres) {
        this.id = id;
        this.nom = nom;
        this.horestotal = horestotal;
        this.dilluns = dilluns;
        this.dimarts = dimarts;
        this.dimecres = dimecres;
        this.dijous = dijous;
        this.divendres = divendres;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getHorestotal() {
        return horestotal;
    }

    public void setHorestotal(int horestotal) {
        this.horestotal = horestotal;
    }

    public int getDilluns() {
        return dilluns;
    }

    public void setDilluns(int dilluns) {
        this.dilluns = dilluns;
    }

    public int getDimarts() {
        return dimarts;
    }

    public void setDimarts(int dimarts) {
        this.dimarts = dimarts;
    }

    public int getDimecres() {
        return dimecres;
    }

    public void setDimecres(int dimecres) {
        this.dimecres = dimecres;
    }

    public int getDijous() {
        return dijous;
    }

    public void setDijous(int dijous) {
        this.dijous = dijous;
    }

    public int getDivendres() {
        return divendres;
    }

    public void setDivendres(int divendres) {
        this.divendres = divendres;
    }
}
