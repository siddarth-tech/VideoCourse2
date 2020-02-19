package com.slokam.vc.user.entity; 
 import java.io.Serializable; 
 import javax.persistence.*; 
 import java.util.*; 
@Entity 
public class User implements Serializable { 

@Id 
 @GeneratedValue 
  private Integer  id;
  private String  name;
  private String  password;
  private Date  dob;
   @ManyToOne() 
@JoinColumn(name="fkid21") 
   private Gender  gender;
   @ManyToOne() 
@JoinColumn(name="fkid22") 
   private MaritalStatus  maritalStatus;
  private Date  marriageDate;
   @ManyToOne() 
@JoinColumn(name="fkid23") 
   private Religion  religion;
   @ManyToOne() 
@JoinColumn(name="fkid24") 
   private Country  nationality;
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
public String getPassword() {
		return password;
	}
public void setPassword(String password) {
		this.password = password;
	}
public Date getDob() {
		return dob;
	}
public void setDob(Date dob) {
		this.dob = dob;
	}
public Gender getGender() {
		return gender;
	}
public void setGender(Gender gender) {
		this.gender = gender;
	}
public MaritalStatus getMaritalStatus() {
		return maritalStatus;
	}
public void setMaritalStatus(MaritalStatus maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
public Date getMarriageDate() {
		return marriageDate;
	}
public void setMarriageDate(Date marriageDate) {
		this.marriageDate = marriageDate;
	}
public Religion getReligion() {
		return religion;
	}
public void setReligion(Religion religion) {
		this.religion = religion;
	}
public Country getNationality() {
		return nationality;
	}
public void setNationality(Country nationality) {
		this.nationality = nationality;
	}
}