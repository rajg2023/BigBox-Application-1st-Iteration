
public class Facility {
			
			private int id;
			private String name;
			private String address;
			private String city;
			private String state;
			private String zipCode;
			
			public Facility(){
				id     = 0;
			   name    ="";
			   address = "";
			   city    = "";
			   state   = "";
			   zipCode = "";
				   
			}
			
public Facility(int fid, String fname, String faddr, String fcity, String fst, String fzip ){
	id      = fid;
	name    = fname;
	address = faddr;
	city    = fcity;
	state   = fst;
	zipCode = fzip;
	
}

public int getId() {
	return id;
}

public void setId(int fid) {
	this.id = fid;
}

public String getName() {
	return name;
}

public void setName(String fname) {
	this.name = fname;
}

public String getAddress() {
	return address;
}

public void setAddress(String faddr) {
	this.address = faddr;
}

public String getCity() {
	return city;
}

public void setCity(String fcity) {
	this.city = fcity;
}

public String getState() {
	return state;
}

public void setState(String fst) {
	this.state = fst;
}

public String getZipCode() {
	return zipCode;
}

public void setZipCode(String fzip) {
	this.zipCode = fzip;
}
public void print(String varName){
	String printString = "Facilty:  " +"id: "+getId()+ "name: "+getName()+"address: "+getAddress()+"city: "+getCity()+"state: "+getState()+"zip: "+getZipCode();
	System.out.println(printString);
}

@Override

public String toString(){
	String s ="Facilty:  " +"id: "+id+ "name: "+name+"address: "+address+"city: "+city+"state: "+state+"zip: "+zipCode;
return s;
}

}
