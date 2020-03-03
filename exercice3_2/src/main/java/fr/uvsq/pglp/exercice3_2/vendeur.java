package fr.uvsq.pglp.exercice3_2;

public class vendeur extends allEmploye {
	final private int base=2000;
	private int commission;
	public vendeur(int commission) {
		this.commission=commission;
	}

	@Override
	public double salaire() {
		// TODO Auto-generated method stub
		return base+commission;
	}
	

}
