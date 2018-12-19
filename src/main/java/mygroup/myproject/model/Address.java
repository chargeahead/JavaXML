package mygroup.myproject.model;

public class Address {
  String street;
  String city;
  String zip;
public Address() {}
public Address(String street, String city, String zip) {
	super();
	this.street = street;
	this.city = city;
	this.zip = zip;
}
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getZip() {
	return zip;
}
public void setZip(String zip) {
	this.zip = zip;
}

  
}
