package com.java.generic_Java_Code;

import java.util.HashMap;
import java.util.Map;

class User {
  int id;
  String name;
  Address address;
  int age;

  // Constructor to initialize user object during creation
  public User(int id, String name, Address address, int age) {
    this.id = id;
    this.name = name;
    this.address = address;
    this.age = age;
  }

  // (Optional) Getter and setter methods for each field
  // ...
}

class Address {
  String state;
  String country;
  Phone phone;
  int pinCode;

  // Constructor to initialize address object during creation
  public Address(String state, String country, Phone phone, int pinCode) {
    this.state = state;
    this.country = country;
    this.phone = phone;
    this.pinCode = pinCode;
  }

  // (Optional) Getter and setter methods for each field
  // ...
}

class Phone {
  String number;
  String countryCode;

  // Constructor to initialize phone object during creation
  public Phone(String number, String countryCode) {
    this.number = number;
    this.countryCode = countryCode;
  }
  public static Map<String, Object> flattenObject(Map<String, Object> obj) {
	  Map<String, Object> flattenedObject = new HashMap<>();
	  //flattenObjectHelper(obj, flattenedObject, "");
	  return flattenedObject;
	}

	/*private static void flattenObjectHelper(Map<String, Object> obj, Map<String, Object> flattenedObject, String prefix) {
	  for (Map.Entry<String, Object> entry : obj.entrySet()) {
	    String key = entry.getKey();
	    Object value = entry.getValue();
	    String newPrefix = prefix.isEmpty() ? key : prefix + "_" + key;
	    if (value != null && value instanceof Map) {
	      flattenObjectHelper((Map<String, Object>) value, flattenedObject, newPrefix);
	    } //else {
	      //flattenedObject.put(newPrefix, value);
	     // flattenObject(newPrefix, value);
	    }
	  }*/
	
  // (Optional) Getter and setter methods for each field
  // ...
  public static void main(String[] args) {
	  Phone userPhone = new Phone("1234567890", "+91");
	  Address userAddress = new Address("Bangalore", "INDIA", userPhone, 563131);
	  User user = new User(2433, "Manikanta", userAddress, 28);

	  
	  
}
}
