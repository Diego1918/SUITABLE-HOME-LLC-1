package com.app.web.repositoriomanizales;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.web.entidad.Manizales;
import com.app.web.entidad.Propiedades;

@Repository
public interface ManizalesRepositorio extends JpaRepository<Manizales, Long> {

}