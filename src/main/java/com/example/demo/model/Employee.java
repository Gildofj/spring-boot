package com.example.demo.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
@AllArgsConstructor
@Getter @Setter
//employee will be the name of table in mongodb
@Document(collection = "Employee")
public class Employee {
 @Id 
 private @NonNull String id;
 private @NonNull String firstName;
 private @NonNull String lastName;
 private @NonNull String email;
public Employee(String id2, Object firstName2, Object lastName2, Object email2) {
	// TODO Auto-generated constructor stub
}
public Object getFirstName() {
	// TODO Auto-generated method stub
	return null;
}
public Object getLastName() {
	// TODO Auto-generated method stub
	return null;
}
public Object getEmail() {
	// TODO Auto-generated method stub
	return null;
}
public void setFirstName(Object firstName) {
	// TODO Auto-generated method stub
	
}
public void setLastName(Object lastName) {
	// TODO Auto-generated method stub
	
}
public void setEmail(Object email) {
	// TODO Auto-generated method stub
	
}
}