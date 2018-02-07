package com.umbrella.Amazon.utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

//This class contains all methods Related to new features of Java 8 and Java 9
public class Java8andJava9 {

	public void printusingLambda() {
		List<String> list = new ArrayList<String>();
		list.add("Red");
		list.add("Yellow");
		list.add("Green");
		list.forEach(item -> System.out.println(item));
	}

	public void selectOption(WebElement element) {
		Select select = new Select(element);
		select.getOptions().stream().anyMatch(item -> item.getText().equals("option 1"));
	}

}
