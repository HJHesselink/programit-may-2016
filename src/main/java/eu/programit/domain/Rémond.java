package eu.programit.domain;

import java.util.ArrayList;
import java.util.List;

public class R�mond extends Person {

	@Override
	public String getFirstName() {
		return "R�mond";
	}

	@Override
	public List<String> getHobbies() {
		
		List<String> result = new ArrayList<>();
		result.add("Cooking");
		///
		
		return result;	
	
	}

}
