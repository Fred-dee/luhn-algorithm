package fred.dilapisho;

import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class ValidateTest{
	@Test
	public void test891(){
		assertFalse(Validate.validate("891"));
	}

	@Test
	public void test2626262626262626(){
		assertFalse(Validate.validate("2626262626262626"));
	}
}