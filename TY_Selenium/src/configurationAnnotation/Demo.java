package configurationAnnotation;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo extends base_Script{
	@Test
	public void login() {
		Reporter.log("Login with credentials////////",true);
	}

}
