package joed;

public class Joed{
	String nimetus1;
	String nimetus2;
	String nimetus3;
	
	double vooluhulk1;
	double vooluhulk2;
	double vooluhulk3;
	
	double pikkus1;
	double pikkus2;
	double pikkus3;
	
	String suubuvJogi1;
	String suubuvJogi2;
	String suubuvJogi3;
	
	double suubKM1;
	double suubKM2;
	double suubKM3;
	
	double jkNumber1;
	double jkNumber2;
	double jkNumber3;
	
	double kaugusMerest;
	double test1;
	double test2;
	
	double suubuvJogiKMTagastus(double punktJoel, double joeJKNumber){
		if (joeJKNumber == 1) {
			kaugusMerest = punktJoel+suubKM2+suubKM3;
		} else if (joeJKNumber == 2) {
			kaugusMerest = punktJoel+suubKM3;
		} else if (joeJKNumber == 3){
			kaugusMerest = punktJoel;
		}
		return kaugusMerest;
	}
	
}