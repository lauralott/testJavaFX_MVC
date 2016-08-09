package app.test.javafx.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Person {
	
	private final StringProperty firstName;
	private final StringProperty lastName;
	private final StringProperty city;

	public Person() {
		// TODO Auto-generated constructor stub
		this(null, null);
	}
	
	public Person(String firstName,String lastName){
		this.firstName = new SimpleStringProperty(firstName);
		this.lastName = new SimpleStringProperty(lastName);
		this.city = new SimpleStringProperty("my city");
	}

	public String getFirstName(){
		return firstName.get();
	}
	
    public void setFirstName(String firstName) {
        this.firstName.set(firstName);
    }
	
   public StringProperty firstNameProperty() {
        return firstName;
    }
   
   public String getLastName() {
       return lastName.get();
   }

   public void setLastName(String lastName) {
       this.lastName.set(lastName);
   }

   public StringProperty lastNameProperty() {
       return lastName;
   }
   
   public String getCity() {
       return city.get();
   }

   public void setCity(String city) {
       this.city.set(city);
   }

   public StringProperty cityProperty() {
       return city;
   }
	
}
