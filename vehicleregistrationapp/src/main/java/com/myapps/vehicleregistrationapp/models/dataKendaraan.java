package com.myapps.vehicleregistrationapp.models;

import jakarta.persistence.*;

@Entity
@Table(name = "dataKendaraan")
public class dataKendaraan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String noRegistrasi;
    private String namaPemilikKendaraan;
    private String alamatPemilikKendaraan;
    private String merkKendaraan;
    private int tahunPembuatan;
    private int kapasitasSilinder;
    private String warnaKendaraan;
    private String jenisBahanBakar;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNoRegistrasi() {
        return noRegistrasi;
    }

    public void setNoRegistrasi(String noRegistrasi) {
        this.noRegistrasi = noRegistrasi;
    }

    public String getNamaPemilikKendaraan() {
        return namaPemilikKendaraan;
    }

    public void setNamaPemilikKendaraan(String namaPemilikKendaraan) {
        this.namaPemilikKendaraan = namaPemilikKendaraan;
    }

    public String getAlamatPemilikKendaraan() {
        return alamatPemilikKendaraan;
    }

    public void setAlamatPemilikKendaraan(String alamatPemilikKendaraan) {
        this.alamatPemilikKendaraan = alamatPemilikKendaraan;
    }

    public String getMerkKendaraan() {
        return merkKendaraan;
    }

    public void setMerkKendaraan(String merkKendaraan) {
        this.merkKendaraan = merkKendaraan;
    }

    public int getTahunPembuatan() {
        return tahunPembuatan;
    }

    public void setTahunPembuatan(int tahunPembuatan) {
        this.tahunPembuatan = tahunPembuatan;
    }

    public int getKapasitasSilinder() {
        return kapasitasSilinder;
    }

    public void setKapasitasSilinder(int kapasitasSilinder) {
        this.kapasitasSilinder = kapasitasSilinder;
    }

    public String getWarnaKendaraan() {
        return warnaKendaraan;
    }

    public void setWarnaKendaraan(String warnaKendaraan) {
        this.warnaKendaraan = warnaKendaraan;
    }

    public String getJenisBahanBakar() {
        return jenisBahanBakar;
    }

    public void setJenisBahanBakar(String jenisBahanBakar) {
        this.jenisBahanBakar = jenisBahanBakar;
    }

}
