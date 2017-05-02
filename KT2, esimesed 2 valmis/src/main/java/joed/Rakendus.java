package joed;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController

public class Rakendus{
	@RequestMapping("/Joed")
	public String Joed(double kaugusSuudmest, double jkNumberJoel) {
		
		
		Joed joed1 = new Joed("Kala", 30, 30, "Suur", 30, 1);
		Joed joed2 = new Joed("Suur", 30, 30, "Hallari", 30, 2);
		Joed joed3 = new Joed("Hallari", 30, 30, null, 30, 3);
		String vastus = "";
	
	
		if(jkNumberJoel == 1) {
			vastus = joed1.nimetus + " ,Sealt " + joed2.nimetus + " ,Sealt " + joed3.nimetus + " ,Sealt liigub merre. " + "Punkti kaugus merest on " + joed1.antudPunkt(kaugusSuudmest,0.0, joed2.suubKM, joed3.suubKM) + " km";
		}
		else if(jkNumberJoel == 2) {
			vastus = joed2.nimetus + ", Sealt " + joed3.nimetus + " Sealt merre. "  + "Punkti kaugus merest on " + joed1.antudPunkt(kaugusSuudmest,0.0, 0.0, joed3.suubKM) + " km";
		}
		else if(jkNumberJoel == 3) {
			vastus = "Liigub otse merre. " + "Punkti kaugus merest on " + joed1.antudPunkt(kaugusSuudmest,0.0, 0.0, 0.0) + " km";
		}else {
			vastus = "Sellist järjekorranumbriga jõgi puudub";
		}
		return vastus;
	}

	public static void main(String[] args){
	System.getProperties().put("server.port", 5555);
	SpringApplication.run(Rakendus.class, args);
	}

}

//scl enable rh-maven33 bash
//mvn package
//java -Dserver.port=4545 -jar target/app1.jar
//http://greeny.cs.tlu.ee:4545/tervita?eesnimi=Juku