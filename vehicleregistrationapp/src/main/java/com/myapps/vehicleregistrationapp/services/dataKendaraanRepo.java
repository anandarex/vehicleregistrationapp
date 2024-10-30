package com.myapps.vehicleregistrationapp.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myapps.vehicleregistrationapp.models.dataKendaraan;

public interface dataKendaraanRepo extends JpaRepository<dataKendaraan, Integer> {

}
