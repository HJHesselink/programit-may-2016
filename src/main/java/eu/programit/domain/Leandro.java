package eu.programit.domain;

import java.util.ArrayList;
import java.util.List;

public class Leandro extends Person{
	public String getFirstName(){
		return "Leandro";
	}
	
	public List<String> getHobbies(){
		List<String> a = new ArrayList<>();
		a.add("Programming JAVA");
		a.add("Eating Icecream");
		return a;
	}


}
