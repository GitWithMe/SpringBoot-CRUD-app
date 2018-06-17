package io.namitproject.springbootquickstart.movielist;

public class Lists {
	
	private String id;
	private String name;
	private String desc;
	
	public Lists() { 
		
	}
	
	
	public Lists(String id, String name, String desc) { //Constructors
		super();
		this.id = id;
		this.name = name;
		this.desc = desc;
	}


	public String getId() { //Getters & Setters
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDesc() {
		return desc;
	}


	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	
	
	
}
