package POJOS;
// Generated Aug 10, 2020 11:54:03 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Cinema generated by hbm2java
 */
public class Cinema  implements java.io.Serializable {


     private String name;
     private Manager manager;
     private String province;
     private String location;
     private String number;
     private Set bookingses = new HashSet(0);

    public Cinema() {
    }

	
    public Cinema(String name, Manager manager, String province, String location, String number) {
        this.name = name;
        this.manager = manager;
        this.province = province;
        this.location = location;
        this.number = number;
    }
    public Cinema(String name, Manager manager, String province, String location, String number, Set bookingses) {
       this.name = name;
       this.manager = manager;
       this.province = province;
       this.location = location;
       this.number = number;
       this.bookingses = bookingses;
    }
   
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public Manager getManager() {
        return this.manager;
    }
    
    public void setManager(Manager manager) {
        this.manager = manager;
    }
    public String getProvince() {
        return this.province;
    }
    
    public void setProvince(String province) {
        this.province = province;
    }
    public String getLocation() {
        return this.location;
    }
    
    public void setLocation(String location) {
        this.location = location;
    }
    public String getNumber() {
        return this.number;
    }
    
    public void setNumber(String number) {
        this.number = number;
    }
    public Set getBookingses() {
        return this.bookingses;
    }
    
    public void setBookingses(Set bookingses) {
        this.bookingses = bookingses;
    }




}


