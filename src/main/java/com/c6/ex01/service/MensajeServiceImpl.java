package com.c6.ex01.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.c6.ex01.dao.IMensajeDAO;
import com.c6.ex01.dto.Mensaje;

@Service
public class MensajeServiceImpl implements IMensajeService{
	
	@Autowired
	IMensajeDAO iMensajeDAO;

	@Override
	public List<Mensaje> listMensajes() {
		// TODO Auto-generated method stub
		return iMensajeDAO.findAll();
	}

	@Override
	public Mensaje saveMensaje(Mensaje mensaje) {
		// TODO Auto-generated method stub
		return iMensajeDAO.save(mensaje);
	}
	
//	@Override
//	public List<Mensaje> findByIdGroup(Long id) {
//		// TODO Auto-generated method stub
//		return iMensajeDAO.findByIdGroup(id);
//	}

	@Override
	public Mensaje mensajeXID(Long id) {
		// TODO Auto-generated method stub
		return iMensajeDAO.findById(id).get();
	}
	
	@Override
	public Mensaje updateMensaje(Mensaje mensaje) {
		// TODO Auto-generated method stub
		return iMensajeDAO.save(mensaje);
	}

	@Override
	public void deleteMensaje(Long id) {
		// TODO Auto-generated method stub
		iMensajeDAO.deleteById(id);
	}
}
