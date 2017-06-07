package com.pagination.CachingLevel2;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name="laptop_details")
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
public class Laptop {
	@Id
	private int laptopid;
	private String seriesno;
	private String name;
	private float price;
	private String specs;
	public Laptop(){
		
	}
	
	public Laptop(int laptopid, String seriesno, String name, float price, String specs) {
		super();
		this.laptopid = laptopid;
		this.seriesno = seriesno;
		this.name = name;
		this.price = price;
		this.specs = specs;
	}

	public int getLaptopid() {
		return laptopid;
	}
	public void setLaptopid(int laptopid) {
		this.laptopid = laptopid;
	}
	public String getSeriesno() {
		return seriesno;
	}
	public void setSeriesno(String seriesno) {
		this.seriesno = seriesno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getSpecs() {
		return specs;
	}
	public void setSpecs(String specs) {
		this.specs = specs;
	}
	
}
