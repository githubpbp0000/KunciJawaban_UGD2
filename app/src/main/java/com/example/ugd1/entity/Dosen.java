package com.example.ugd1.entity;

public class Dosen {
    private String name;
    private String nomorDosen;
    private Integer masaKerja;
    private String photoDosen;

    public Dosen(String name, String nomorDosen, Integer masaKerja, String photoDosen) {
        this.name = name;
        this.nomorDosen = nomorDosen;
        this.masaKerja = masaKerja;
        this.photoDosen = photoDosen;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNomorDosen() {
        return nomorDosen;
    }

    public void setNomorDosen(String nomorDosen) {
        this.nomorDosen = nomorDosen;
    }

    public Integer getMasaKerja() {
        return masaKerja;
    }

    public void setMasaKerja(Integer masaKerja) {
        this.masaKerja = masaKerja;
    }

    public String getPhotoDosen() {
        return photoDosen;
    }

    public void setPhotoDosen(String photoDosen) {
        this.photoDosen = photoDosen;
    }

    public static Dosen[] listOfDosen = {
            new Dosen("Dosen 1", "100002302", 3, "https://images.unsplash.com/photo-1502823403499-6ccfcf4fb453?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=334&q=80"),
            new Dosen("Dosen 2", "100004502", 4, "https://images.unsplash.com/photo-1502823403499-6ccfcf4fb453?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=334&q=80"),
            new Dosen("Dosen 3", "100002502", 5, "https://images.unsplash.com/photo-1502823403499-6ccfcf4fb453?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=334&q=80"),
            new Dosen("Dosen 4", "100008502", 2, "https://images.unsplash.com/photo-1502823403499-6ccfcf4fb453?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=334&q=80"),
            new Dosen("Dosen 5", "100002302", 7, "https://images.unsplash.com/photo-1502823403499-6ccfcf4fb453?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=334&q=80"),
            new Dosen("Dosen 6", "100001202", 10, "https://images.unsplash.com/photo-1502823403499-6ccfcf4fb453?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=334&q=80"),
    };

}
