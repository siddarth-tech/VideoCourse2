package com.slokam.vc.user.entity; 
 import java.io.Serializable; 
 import javax.persistence.*; 
 import java.util.*; 
@Entity 
public class State implements Serializable { 

@Id 
 @GeneratedValue 
  private Integer  id;
  private String  name;
   @ManyToOne() 
@JoinColumn(name="fkid30") 
   private Country  country;
public Integer getId() {
		return id;
	}
public void setId(Integer id) {
		this.id = id;
	}
public String getName() {
		return name;
	}
public void setName(String name) {
		this.name = name;
	}
public Country getCountry() {
		return country;
	}
public void setCountry(Country country) {
		this.country = country;
	}
}