package joed;

public class Joed{
	String nimetus;
	double vooluhulk;
	double pikkus;
	String suubuvJogi;	
	double suubKM;	
	double jkNumber;
	double kaugusMerest;

	public Joed(String nimetus, double vooluhulk, double pikkus, String suubuvJogi, double suubKM, double jkNumber){
		this.nimetus = nimetus;
		this.vooluhulk = vooluhulk;
		this.pikkus = pikkus;
		this.suubuvJogi = suubuvJogi;
		this.suubKM = suubKM;
		this.jkNumber = jkNumber;
	}
	

	double antudPunkt(double punktJoel, double suubkm, double suubkm2, double suubkm3){
		return punktJoel+suubkm+suubkm2+suubkm3;
	}

	
}