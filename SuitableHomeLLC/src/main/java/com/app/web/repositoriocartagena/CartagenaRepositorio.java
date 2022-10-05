package com.app.web.repositoriocartagena;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.web.entidad.Cartagena;
import com.app.web.entidad.Propiedades;

@Repository
public interface CartagenaRepositorio extends JpaRepository<Cartagena, Long> {

}