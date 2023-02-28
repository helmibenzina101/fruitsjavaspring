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

public class FruitCategoryController {

	//Attire the ArticlesService class  
	@Autowired  
	FruitCategoryService cs;  

	//creating a get mapping that retrieves all the books detail from the database   
	@GetMapping("/FruitCategory")
	
	private List<FruitCategory> getAllFruitCategorys()   
	{  
		return cs.getAllFruitCategorys();
	}  

	//creating a get mapping that retrieves the detail of a specific book  
	@GetMapping("/FruitCategory/{id}")  
	private FruitCategory getFruitCategorys(@PathVariable("id") int id)   
	{  
		return cs.getFruitCategorysById(id)  ;
	}  


	//creating a delete mapping that deletes a specified book  
	@DeleteMapping("/FruitCategory/{FruitCategoryid}")  
	private void deleteFruitCategory(@PathVariable("FruitCategoryid") int FruitCategoryid)   
	{  
		cs.delete(FruitCategoryid);  
	} 

	@PostMapping("/FruitCategory")  
	private int saveFruitCategory(@RequestBody FruitCategory c)   
	{  
		cs.saveOrUpdate(c);  
		return c.getId();  
	} 

	//creating put mapping that updates the book detail
	//@CrossOrigin(origins = "*")
	@PutMapping("/FruitCategory")  
	private FruitCategory update(@RequestBody  FruitCategory c)   
	{  
		cs.saveOrUpdate(c);  
		return c;  
	}  
}