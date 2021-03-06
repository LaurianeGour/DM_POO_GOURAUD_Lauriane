package com.Ensim.Tp2.TP5.model;

import java.util.Date;
import javax.persistence.*;

@Entity	//Permet de savoir que cette classe va correspondre à une table
public class Adress {
	
    @Id
    @GeneratedValue
    private Long id;
	private Date creation;
    private String content;
    private String author;
     
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getCreation() {
		return creation;
	}
	public void setCreation(Date creation) {
		this.creation = creation;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
    public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

}
