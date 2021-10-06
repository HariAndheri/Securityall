package com.Neosoft.Security.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.Neosoft.Security.Entity.Student;
import com.Neosoft.Security.Repositry.SecurityRepositry;

@RestController
public class Controller {

	@Autowired
	private SecurityRepositry repositry;

	@PostMapping("insert")
	public ResponseEntity<Student> insertdata(@RequestBody Student stnd) {
		repositry.save(stnd);
		return new ResponseEntity<Student>(stnd, HttpStatus.CREATED);

	}

	@GetMapping("getall")
	public ResponseEntity<List<Student>> getall() {
		List<Student> findAll = repositry.findAll();
		return new ResponseEntity<List<Student>>(findAll, HttpStatus.ACCEPTED);

	}
	
	@GetMapping("getbyid/{id}")
	public ResponseEntity<Optional<Student>> findbyid(@PathVariable Integer id){
		 Optional<Student> findById = repositry.findById(id);
		return new ResponseEntity<Optional<Student>>(findById,HttpStatus.ACCEPTED);
	}
}
