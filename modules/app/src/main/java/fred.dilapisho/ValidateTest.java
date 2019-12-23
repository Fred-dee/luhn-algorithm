package fred.dilapisho;

import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class ValidateTest{
	@Test
	public void test891(){
		assertFalse(Validate.validate("891"));
	}
}