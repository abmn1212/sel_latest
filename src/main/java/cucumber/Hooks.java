package cucumber;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	@Before
	public void before(Scenario sc)
	{
		System.out.println("Name is " + sc.getName());
		System.out.println("ID is " + sc.getId());
	}
	
	@After
	public void after(Scenario sc)
	{
		System.out.println("Status of test result is " + sc.getStatus());
		System.out.println("final status is " + sc.isFailed());
	}

}
