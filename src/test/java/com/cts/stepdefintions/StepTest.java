package com.cts.stepdefintions;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;

public class StepTest {
	
	@Given("I have browser with magentopage123")
	public void i_have_browser_with_magentopage123(DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	     List<String> ttt= dataTable.asList();
		
		List<Map<String, String>> test = dataTable.asMaps();
		
		for(int i=0;i<test.size();i++)
		{
			System.out.println(test.get(i).get("username"));
			System.out.println(test.get(i).get("password"));
			System.out.println(test.get(i).get("id"));
		}
		
		
		
	}

}
