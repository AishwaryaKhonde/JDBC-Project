package com.thbs.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.thbs.model.Trains;
import com.thbs.repository.TrainRepository;

@RestController
@RequestMapping("/trains")
public class TrainController {
	@Autowired
	TrainRepository tr;
	@PostMapping("/train")
	public ResponseEntity<Trains>save(@RequestBody Trains train)
	{
		Trains t=tr.save(train);
		return new ResponseEntity<Trains>(t,HttpStatus.OK);
		
	}
	@GetMapping("/getAllTrains")
	public ResponseEntity<List<Trains>> getAllTrains()
	{
		List<Trains> tlist=tr.findAll();
		return new ResponseEntity<List<Trains>>(tlist,HttpStatus.OK);
	}
	@GetMapping("/getATrain/{id}")
	public ResponseEntity<Trains> getATrain(@PathVariable int id)
	{
		Optional<Trains> tk=tr.findById(id);
		if(tk.isPresent())
		{
			Trains t=tk.get();
			return new ResponseEntity<Trains>(t,HttpStatus.OK);
			
		}
		return new ResponseEntity<Trains>(HttpStatus.NOT_FOUND);
	}
	@DeleteMapping("/deleteATrain/{id}")
	public ResponseEntity<Trains> deleteTrainsById(@PathVariable int id)
	{
		if(tr.existsById(id))
		{
			tr.deleteById(id);
			return new ResponseEntity<Trains>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<Trains>(HttpStatus.NOT_FOUND);
	}

}
