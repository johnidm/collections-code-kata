package br.com.johnidouglas.pratica;

import java.math.BigDecimal;
import java.nio.file.Path;

public class Product {

	 
	private String name; 
	private Path file; 
	private BigDecimal price;
	
	public Product(String name, Path file, BigDecimal price) {
		this.name = name;
		this.file = file; 
		this.price = price;	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Path getFile() {
		return file;
	}

	public void setFile(Path file) {
		this.file = file;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
	
		return this.name;
	}
	
	
}
