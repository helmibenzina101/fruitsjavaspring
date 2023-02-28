package tn.fruits.fruits.Service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.fruits.fruits.Model.*;
import tn.fruits.fruits.Repository.*;


@Service
public class FruitCategoryService {

	@Autowired  
	FruitCategoryRepository fruitcategoryRepository;  
	//getting all articles record by using the method findaAll() of CrudRepository  

	//getting all articles record by using the method findaAll() of CrudRepository  
	public List<FruitCategory> getAllFruitCategorys()   
	{
		List<FruitCategory> fruitcategorys = new ArrayList<FruitCategory>();  
	  fruitcategoryRepository.findAll().forEach(a -> fruitcategorys.add(a));  
		return fruitcategorys;  	
	}  

	//getting a specific record by using the method findById() of CrudRepository  
	public FruitCategory getFruitCategorysById(int id)   
	{  
		return fruitcategoryRepository.findById(id).get();  
	}  


	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(tn.fruits.fruits.Model.FruitCategory c)   
	{  
		fruitcategoryRepository.save(c);  
	} 

	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		fruitcategoryRepository.deleteById(id);  
	} 
  
}