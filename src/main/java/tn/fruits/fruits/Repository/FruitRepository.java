package tn.fruits.fruits.Repository;


import org.springframework.data.repository.CrudRepository;

import tn.fruits.fruits.Model.*;


public interface FruitRepository extends CrudRepository<Fruit, Integer> 
{  
	
}