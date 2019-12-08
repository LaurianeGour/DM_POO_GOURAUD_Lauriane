package com.Ensim.Tp2.TP5.model;

import java.util.Date;
import javax.persistence.*;

@Entity	//Permet de savoir que cette classe va correspondre à une table
public class Address {
	
    @Id
    @GeneratedValue
    private Long id;
	private Date creation;
    private String content;
    private String nomPersonne;
     
    
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
    public String getNomPersonne() {
		return nomPersonne;
	}
	public void setNomPersonne(String nomPersonne) {
		this.nomPersonne = nomPersonne;
	}

}
