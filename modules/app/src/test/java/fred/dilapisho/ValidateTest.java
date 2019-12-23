package fred.dilapisho;

import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class ValidateTest{
	@Test
	public void test891(){
		assertFalse(Validate.validate("891"));
	}

	@Test
	public void test1230(){
		assertFalse(Validate.validate("1230"));
	}

	@Test
	public void test2121(){
		assertFalse(Validate.validate("2121"));
	}

	@Test
	public void test26(){
		assertFalse(Validate.validate("26"));
	}

	@Test
	public void test91(){
		assertFalse(Validate.validate("91"));
	}

	@Test
	public void test2626262626262626(){
		assertFalse(Validate.validate("2626262626262626"));
	}

}