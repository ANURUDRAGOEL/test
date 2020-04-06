package com.service;

import java.util.ArrayList;
import java.util.List;

import com.myPojo.Person;

public class MyService {

	public static List<Person>  getAddress() {

		List<Person> lis = new ArrayList<Person>();

		Person person = new Person();
		person.setAge("37");
		person.setName("Anurudra Goel");
		Person person1 = new Person();
		person.setAge("34");
		person.setName("Neha Goel");

		lis.add(person);
		lis.add(person1);

		return lis;

	}

}
