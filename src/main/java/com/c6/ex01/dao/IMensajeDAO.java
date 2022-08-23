package com.c6.ex01.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.c6.ex01.dto.Mensaje;

public interface IMensajeDAO extends JpaRepository<Mensaje, Long>{

}
