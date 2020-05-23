package com.athiya.hybernatecachelevel1.HybernateCacheLevel1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Developer")
public class Model {

	
	@Id
	private int id;
	private String name;
	private String favcolor;
	
	
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
	public String getFavcolor() {
		return favcolor;
	}
	public void setFavcolor(String favcolor) {
		this.favcolor = favcolor;
	}
	
	@Override
	public String toString() {
		return "Model [id=" + id + ", name=" + name + ", favcolor=" + favcolor + "]";
	}
	
	
}
