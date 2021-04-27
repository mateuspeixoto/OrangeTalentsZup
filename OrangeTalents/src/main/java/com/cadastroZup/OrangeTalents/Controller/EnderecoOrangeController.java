package com.cadastroZup.OrangeTalents.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cadastroZup.OrangeTalents.Model.EnderecoOrange;
import com.cadastroZup.OrangeTalents.Repository.EnderecoOrangeRepository;

@RestController
@RequestMapping("/enderecos")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class EnderecoOrangeController {
	
	@Autowired
	private EnderecoOrangeRepository repository;
	
	@PostMapping
	public ResponseEntity<EnderecoOrange> post (@Valid @RequestBody EnderecoOrange endereco){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(endereco));
		
	}
	

}
