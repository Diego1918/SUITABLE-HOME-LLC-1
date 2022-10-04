package com.app.web.repositoriobogota;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.web.entidad.Bogota;

@Repository
public interface BogotaRepositorio extends JpaRepository<Bogota, Long> {

}