package tn.fruits.fruits.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity  

@Table 
public class Fruit {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column 
	private int id;  
	@Column  
	private String name; 
	@Column  
	private int quantity; 
	@Column  
	private float price;
	@ManyToOne(optional=false)
	@JoinColumn(name="idfruitcategory", referencedColumnName="id")
	private FruitCategory fruitcategory;
	
	public FruitCategory getFruitcategory() {
		return fruitcategory;
	}
	public void setFruitcategory(FruitCategory fruitcategory) {
		this.fruitcategory = fruitcategory;
	}
	
	
	@Override
	public String toString() {
		return "Fruit [id=" + id + ", name=" + name + ", quantity=" + quantity + ", price=" + price + ", fruitcategory="
				+ fruitcategory + "]";
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}

}