package com.sg.rentcar.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sg.rentcar.models.TipoCombustibles;
import com.sg.rentcar.repositories.TipoCombustibleRepository;

@Service
public class TipoCombustiblesService {
	@Autowired
	private TipoCombustibleRepository TipoCombustibleRepository;

	public List<TipoCombustibles> getTipoCombustibles() {

		return TipoCombustibleRepository.findAll();

	}

}

