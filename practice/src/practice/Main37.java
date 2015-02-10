package practice;

import org.apache.commons.lang3.builder.EqualsBuilder;

public class Main37 {
	String name;
	String address;


	public boolean equals(Object o){
		return EqualsBuilder.reflectionEquals(this,o);
	}



}

