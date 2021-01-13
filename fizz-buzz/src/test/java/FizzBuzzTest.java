import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FizzBuzzTest {

	@Test
	public void should_return_1_when_input_is_1() {
		String ret = FizzBuzz.execute(1);

		assertEquals("1", ret);
	}

	@Test
	public void should_return_input_when_not_multiple() {
		String ret = FizzBuzz.execute(2);

		assertEquals(ret, "2");
	}

	/*@Test
	public void should_return_Fizz_when_input_is_multiple_of_3() {
		String ret = FizzBuzz.execute(6);
		assertEquals(ret, "Fizz");

		ret = FizzBuzz.execute(3);
		assertEquals(ret, "Fizz");

		ret = FizzBuzz.execute(9);
		assertEquals(ret, "Fizz");

		ret = FizzBuzz.execute(12);
		assertEquals(ret, "Fizz");
	}

	@Test
	public void should_return_Buzz_when_input_is_multiple_of_5() {
		String ret = FizzBuzz.execute(5);
		assertEquals(ret, "Buzz");

		ret = FizzBuzz.execute(10);
		assertEquals(ret, "Buzz");

		ret = FizzBuzz.execute(35);
		assertEquals(ret, "Buzz");
	}

	@Test
	public void should_return_Buzz_when_input_is_multiple_of_15() {
		String ret = FizzBuzz.execute(15);
		assertEquals(ret, "FizzBuzz");

		ret = FizzBuzz.execute(45);
		assertEquals(ret, "FizzBuzz");

		ret = FizzBuzz.execute(60);
		assertEquals(ret, "FizzBuzz");
	}*/
}
