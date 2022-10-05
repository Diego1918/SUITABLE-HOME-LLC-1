package com.app.web.repositorioarmenia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.web.entidad.Armenia;
import com.app.web.entidad.Propiedades;

@Repository
public interface ArmeniaRepositorio extends JpaRepository<Armenia, Long> {

}