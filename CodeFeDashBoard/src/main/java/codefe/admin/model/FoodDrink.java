package codefe.admin.model;

import java.text.NumberFormat;
import java.util.Locale;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="fooddrink")
public class FoodDrink {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	private String name;
	private double price;
	private String category;
	private int status;
	public FoodDrink() {
		super();
		id = 0;
		name = "";
		price = 0;
		category ="";
		status = 0;
	}
	
	public FoodDrink(int id, String name, double price, String category,int status) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
		this.status = status;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public double getPrice() {
		return this.price;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	public int getStatus() {
		return this.status;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	
	public String getCategory() {
		return this.category;
	}
}

