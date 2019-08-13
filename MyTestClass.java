package a.b;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class MyTestClass {

	@Test
	public void given_a_complex_number() throws Exception {
		assertEquals(MyClass.solution(1234567890),
				"one billion two hundred thirty four million five hundred sixty seven thousand height hundred ninety");
	}
}