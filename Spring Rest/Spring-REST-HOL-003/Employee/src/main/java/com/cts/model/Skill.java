package com.cts.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

public class Skill {

	private int id;
	private String name;
	public Skill() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Skill(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	@Override
	public String toString() {
		return "Skill [id=" + id + ", name=" + name + "]";
	}
	
}
