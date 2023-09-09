package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import repository.MariaRepository;

@Service
public class UserService {
	@Autowired
	private MariaRepository repository;

	public MariaRepository getRepository() {
		return repository;
	}

}
