package com.slokam.vc.user.entity; 
 import java.io.Serializable; 
 import javax.persistence.*; 
 import java.util.*; 
@Entity 
public class AddressDetails implements Serializable { 

@Id 
 @GeneratedValue 
  private Integer  id;
  private String  houseNo;
  private String  street;
  private String  area;
  private String  landMark;
  private Long  pincode;
   @ManyToOne() 
@JoinColumn(name="fkid25") 
   private City  city;
   @ManyToOne() 
@JoinColumn(name="fkid26") 
   private State  state;
   @ManyToOne() 
@JoinColumn(name="fkid27") 
   private AddType  type;
   @ManyToOne() 
@JoinColumn(name="fkid28") 
   private User  user;
public Integer getId() {
		return id;
	}
public void setId(Integer id) {
		this.id = id;
	}
public String getHouseNo() {
		return houseNo;
	}
public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
public String getStreet() {
		return street;
	}
public void setStreet(String street) {
		this.street = street;
	}
public String getArea() {
		return area;
	}
public void setArea(String area) {
		this.area = area;
	}
public String getLandMark() {
		return landMark;
	}
public void setLandMark(String landMark) {
		this.landMark = landMark;
	}
public Long getPincode() {
		return pincode;
	}
public void setPincode(Long pincode) {
		this.pincode = pincode;
	}
public City getCity() {
		return city;
	}
public void setCity(City city) {
		this.city = city;
	}
public State getState() {
		return state;
	}
public void setState(State state) {
		this.state = state;
	}
public AddType getType() {
		return type;
	}
public void setType(AddType type) {
		this.type = type;
	}
public User getUser() {
		return user;
	}
public void setUser(User user) {
		this.user = user;
	}
}