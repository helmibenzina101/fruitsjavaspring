package tn.fruits.fruits.Controller;
import java.security.Provider.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tn.fruits.fruits.*;
import tn.fruits.fruits.Model.*;
import tn.fruits.fruits.Service.*;
@RestController
@CrossOrigin(origins = "*")

public class FruitController {

	//Attire the ArticlesService class  
	@Autowired  
	FruitService cs;  

	//creating a get mapping that retrieves all the books detail from the database   
	@GetMapping("/Fruit")
	
	private List<Fruit> getAllFruits()   
	{  
		return cs.getAllFruits();
	}  

	//creating a get mapping that retrieves the detail of a specific book  
	@GetMapping("/Fruit/{id}")  
	private Fruit getFruits(@PathVariable("id") int id)   
	{  
		return cs.getFruitsById(id)  ;
	}  


	//creating a delete mapping that deletes a specified book  
	@DeleteMapping("/Fruit/{Fruitid}")  
	private void deleteFruit(@PathVariable("Fruitid") int Fruitid)   
	{  
		cs.delete(Fruitid);  
	} 

	@PostMapping("/Fruit")  
	private int saveFruit(@RequestBody Fruit c)   
	{  
		cs.saveOrUpdate(c);  
		return c.getId();  
	} 

	//creating put mapping that updates the book detail
	//@CrossOrigin(origins = "*")
	@PutMapping("/Fruit")  
	private Fruit update(@RequestBody  Fruit c)   
	{  
		cs.saveOrUpdate(c);  
		return c;  
	}  
}