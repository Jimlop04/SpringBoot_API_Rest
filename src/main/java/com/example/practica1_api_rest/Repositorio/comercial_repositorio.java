package com.example.practica1_api_rest.Repositorio;

import com.example.practica1_api_rest.Modelo.ventas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface comercial_repositorio extends JpaRepository<ventas, Long> {

}
