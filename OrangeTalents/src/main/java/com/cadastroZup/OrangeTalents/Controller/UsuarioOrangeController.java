package com.cadastroZup.OrangeTalents.Controller;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.cadastroZup.OrangeTalents.Model.UsuarioOrange;
import com.cadastroZup.OrangeTalents.Repository.UsuarioOrangeRepository;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UsuarioOrangeController {
	
	@Autowired
	private UsuarioOrangeRepository repository;
	
	@GetMapping("/{id}")
	public ResponseEntity<UsuarioOrange> GetById(@PathVariable Long id){
		return repository.findById(id)
				.map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
		
	}
	
	@PostMapping
	public ResponseEntity<UsuarioOrange> post (@Valid @RequestBody UsuarioOrange usuario){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(usuario));
		
	}

}
