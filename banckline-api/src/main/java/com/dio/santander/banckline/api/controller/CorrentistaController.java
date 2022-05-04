package com.dio.santander.banckline.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dio.santander.banckline.api.dto.NovoCorrentistaDTO;
import com.dio.santander.banckline.api.model.Correntista;
import com.dio.santander.banckline.api.repositoy.CorrentistaRepository;
import com.dio.santander.banckline.api.service.CorrentistaService;

@RestController
@RequestMapping("/correntistas")
public class CorrentistaController {
	
	@Autowired
	private CorrentistaRepository repository;
	
	@Autowired
	private CorrentistaService service;
	
	@GetMapping
	public List<Correntista> findAll(){
		return repository.findAll();
	}
	
	@PostMapping
	public void save(@RequestBody NovoCorrentistaDTO correntista) {
		service.save(correntista);
	}

}
