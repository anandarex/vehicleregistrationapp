package com.myapps.vehicleregistrationapp.models;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class dataKendaraanDto {

    @NotEmpty(message = "Masukkan Nomor Registrasi Kendaraan")
    private String noRegistrasi;

    @NotEmpty(message = "Masukkan Nama Pemilik Kendaraan")
    private String namaPemilikKendaraan;

    @NotEmpty(message = "Masukkan Merk Kendaraan")
    private String merkKendaraan;

    @NotEmpty(message = "Masukkan Alamat")
    private String alamatPemilikKendaraan;

    @NotEmpty(message = "Masukkan Tahun Pembuatan")
    @Size(max = 4, message = "Tidak bisa melebihi 4 Angka")
    private String tahunPembuatan;

    @NotEmpty(message = "Masukkan Kapasitas Silinder Kendaraan")
    private String kapasitasSilinder;

    @NotEmpty(message = "Masukkan Warna Kendaraan")
    private String warnaKendaraan;

    @NotEmpty(message = "Masukkan Jenis Bahan Bakar")
    private String jenisBahanBakar;

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

    public String getMerkKendaraan() {
        return merkKendaraan;
    }

    public void setMerkKendaraan(String merkKendaraan) {
        this.merkKendaraan = merkKendaraan;
    }

    public String getAlamatPemilikKendaraan() {
        return alamatPemilikKendaraan;
    }

    public void setAlamatPemilikKendaraan(String alamatPemilikKendaraan) {
        this.alamatPemilikKendaraan = alamatPemilikKendaraan;
    }

    public String getTahunPembuatan() {
        return tahunPembuatan;
    }

    public void setTahunPembuatan(String tahunPembuatan) {
        this.tahunPembuatan = tahunPembuatan;
    }

    public String getKapasitasSilinder() {
        return kapasitasSilinder;
    }

    public void setKapasitasSilinder(String kapasitasSilinder) {
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
