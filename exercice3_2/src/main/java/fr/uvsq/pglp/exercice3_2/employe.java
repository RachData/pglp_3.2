package fr.uvsq.pglp.exercice3_2;

public class employe extends allEmploye{
	final private int salaire=1500;
	private int startyear;
	public employe(int startyear) {
		this.startyear=startyear;
	}
	@Override
	public double salaire() {
		// TODO Auto-generated method stub
		return salaire+(2020-this.startyear);
	}

}
