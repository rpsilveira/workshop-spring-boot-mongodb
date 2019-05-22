package com.reinaldosilveira.workshopmongo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reinaldosilveira.workshopmongo.domain.Post;
import com.reinaldosilveira.workshopmongo.repository.PostRepository;
import com.reinaldosilveira.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repo;
	
	public Post findById(String id) {
		 Optional<Post> obj = repo.findById(id);
		 return obj.orElseThrow(() -> new ObjectNotFoundException("Usuário não encontrado")); 
	}
	
}