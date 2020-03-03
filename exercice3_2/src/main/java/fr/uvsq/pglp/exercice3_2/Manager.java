package fr.uvsq.pglp.exercice3_2;

public class Manager extends allEmploye{
	
	private final int base=1500;
	private int NombresEmployes;
	public Manager (int NombresEmployes){
		this.NombresEmployes = NombresEmployes;
	}
	@Override
	public double salaire(){
		return base +(NombresEmployes*100);
	}

}
