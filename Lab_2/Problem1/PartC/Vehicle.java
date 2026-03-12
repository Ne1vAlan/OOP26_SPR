package Lab_2.Problem1.PartC;

import java.util.Objects;

public class Vehicle {
	private String brand;
	private int year;
	
	public Vehicle(String brand, int year) {
		this.brand = brand;
		this.year = year;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public boolean equals(Object o) {
		if(this == o) return true;
		if(!(o instanceof Vehicle)) return false;
		
		Vehicle v = (Vehicle) o;
		return year == v.year && brand.equals(v.brand);	
	}
	
	public int hashCode() {
		return Objects.hash(brand, year);
	}
}
