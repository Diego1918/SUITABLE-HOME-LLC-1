package com.app.web.repositoriogiron;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.web.entidad.Giron;

@Repository
public interface GironRepositorio extends JpaRepository<Giron, Long> {

}