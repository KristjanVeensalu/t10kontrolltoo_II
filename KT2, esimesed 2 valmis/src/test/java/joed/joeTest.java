package joed;

import org.junit.*;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)

public class joeTest {
	@Autowired
	private TestRestTemplate restTemplate;
	@Test
	public void Joed(){
		assertEquals("Kala ,Sealt Suur ,Sealt Hallari ,Sealt liigub merre. Punkti kaugus merest on 85.0 km", this.restTemplate.getForObject("/Joed?kaugusSuudmest=25&jkNumberJoel=1", String.class));
	}
}