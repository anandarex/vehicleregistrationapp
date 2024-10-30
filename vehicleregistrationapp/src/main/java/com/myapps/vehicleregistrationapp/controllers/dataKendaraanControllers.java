package com.myapps.vehicleregistrationapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.myapps.vehicleregistrationapp.models.dataKendaraan;
import com.myapps.vehicleregistrationapp.models.dataKendaraanDto;
import com.myapps.vehicleregistrationapp.services.dataKendaraanRepo;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/dataKendaraan")
public class dataKendaraanControllers {

    @Autowired
    private dataKendaraanRepo repo;

    @GetMapping({ "", "/" })
    public String showDataKendaraan(Model model) {
        List<dataKendaraan> dataKendaraan = repo.findAll();
        model.addAttribute("dataKendaraan", dataKendaraan);
        return "dataKendaraan/index";
    }

    @GetMapping("/TambahDataKendaraan")
    public String showTambahData(Model model) {
        dataKendaraanDto dataKendaraanDto = new dataKendaraanDto();
        model.addAttribute("dataKendaraanDto", dataKendaraanDto);
        return "dataKendaraan/TambahDataKendaraan";
    }

    @PostMapping("/TambahDataKendaraan")
    public String tambahData(
            @Valid @ModelAttribute dataKendaraanDto dataKendaraanDto,
            BindingResult result) {

        if (result.hasErrors()) {
            return "dataKendaraan/TambahDataKendaraan";
        }

        dataKendaraan dataKendaraan = new dataKendaraan();
        dataKendaraan.setNoRegistrasi(dataKendaraanDto.getNoRegistrasi());
        dataKendaraan.setNamaPemilikKendaraan(dataKendaraanDto.getNamaPemilikKendaraan());
        dataKendaraan.setMerkKendaraan(dataKendaraanDto.getMerkKendaraan());
        dataKendaraan.setAlamatPemilikKendaraan(dataKendaraanDto.getAlamatPemilikKendaraan());
        // dataKendaraan.setTahunPembuatan(dataKendaraanDto.getTahunPembuatan());
        // dataKendaraan.setKapasitasSilinder(dataKendaraanDto.getKapasitasSilinder());
        dataKendaraan.setWarnaKendaraan(dataKendaraanDto.getWarnaKendaraan());
        dataKendaraan.setJenisBahanBakar(dataKendaraanDto.getJenisBahanBakar());

        repo.save(dataKendaraan);

        return "redirect:/dataKendaraan";
    }

    @GetMapping("/editDataKendaraan")
    public String showeditDataKendaraan(
            Model model,
            @RequestParam int id) {

        try {
            dataKendaraan dataKendaraan = repo.findById(id).get();
            model.addAttribute("dataKendaraan", dataKendaraan);

            dataKendaraanDto dataKendaraanDto = new dataKendaraanDto();
            dataKendaraanDto.setNoRegistrasi(dataKendaraan.getNoRegistrasi());
            dataKendaraanDto.setNamaPemilikKendaraan(dataKendaraan.getNamaPemilikKendaraan());
            dataKendaraanDto.setMerkKendaraan(dataKendaraan.getMerkKendaraan());
            dataKendaraanDto.setAlamatPemilikKendaraan(dataKendaraan.getAlamatPemilikKendaraan());
            // dataKendaraanDto.setTahunPembuatan(dataKendaraan.getTahunPembuatan());
            // dataKendaraanDto.setKapasitasSilinder(dataKendaraan.getKapasitasSilinder());
            dataKendaraanDto.setWarnaKendaraan(dataKendaraan.getWarnaKendaraan());
            dataKendaraanDto.setJenisBahanBakar(dataKendaraan.getJenisBahanBakar());

        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
            return "redirect:/dataKendaraan";
        }

        return "dataKendaraan/editDataKendaraan";

    }
}
