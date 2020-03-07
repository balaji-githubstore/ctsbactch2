package com.cts.stepdefintions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.core.gherkin.vintage.internal.gherkin.ast.Tag;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleStepDefn {
	@Given("I have browser with googlemap page")
	public void i_have_browser_with_googlemap_page() {
		System.out.println("given");
	}

	
	
	@When("I enter multiple cities")
	public void i_enter_multiple_cities(DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    
//		List<String> cities = dataTable.asList();
//		
//		for(int i=1;i<cities.size();i++)
//		{
//			System.out.println(cities.get(i));
//		}	
		
		List<Map<String, String>> listsOfMap= dataTable.asMaps();
		
		for(int i=0;i<listsOfMap.size();i++)
		{
			String city = listsOfMap.get(i).get("cities");
			System.out.println(city);
			city = listsOfMap.get(i).get("country");
			System.out.println(city);
		}
		//print all cities and country
	}

	
	
	
	
	
	@Then("I should get the result with all cities connected with km as {string}")
	public void i_should_get_the_result_with_all_cities_connected_with_km_as(String km) {
	  System.out.println(km);
	    
	}
}
