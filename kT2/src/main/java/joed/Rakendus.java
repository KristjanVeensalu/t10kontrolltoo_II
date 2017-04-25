package joed;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController

public class Rakendus{
	@RequestMapping("/Joed")
	public String Joed(double kaugusSuudmest, double jkNumberJoel) {
		
		Joed joed = new Joed();
		
		joed.nimetus1 = "Kala";
		joed.suubuvJogi1 = "Suur";
		joed.suubKM1 = 30;
		joed.jkNumber1 = 1;
		
		joed.nimetus2 = "Suur";
		joed.suubuvJogi2 = "Hallari";
		joed.suubKM2 = 43;
		joed.jkNumber2 = 2;
		
		joed.nimetus3 = "Hallari";
		joed.suubuvJogi3 = null;
		joed.suubKM3 = 23;
		joed.jkNumber3 = 3;
		
		double algusPunkt = jkNumberJoel;
		double kaugusJoelSuudmest = kaugusSuudmest;
		String vastus = "";
		
		
		
		if (algusPunkt == 1) {
			vastus = joed.nimetus1 + " ,Sealt " + joed.nimetus2 + " ,Sealt " + joed.nimetus3 + " ,Sealt liigub otse merre" + " Punkti kaugus merest on " + joed.suubuvJogiKMTagastus(kaugusJoelSuudmest, algusPunkt) + " km";
		} else if (algusPunkt == 2) {
			vastus = joed.nimetus2 + " Sealt " + joed.nimetus3 + " Sealt liigub otse merre" + " Punkti kaugus merest on " + joed.suubuvJogiKMTagastus(kaugusJoelSuudmest, algusPunkt) + " km";
		} else if (algusPunkt == 3){
			vastus = "Liigub otse merre" + " Punkti kaugus merest on " + joed.suubuvJogiKMTagastus(kaugusJoelSuudmest, algusPunkt) + " km";
		} else {
			vastus = "Sellise j2rjekorranumbriga jogi puudub";
		}
			
		return vastus;
	}
	
	
	public static void main(String[] args){
	System.getProperties().put("server.port", 4207);
	SpringApplication.run(Rakendus.class, args);
	}
}