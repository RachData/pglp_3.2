package fr.uvsq.pglp.exercice3_2;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class allEmployeTest {

	@Test
	public void test() {
		vendeur v1 = new vendeur(10);
		vendeur v2 = new vendeur(20);
		employe e1=new employe(2010);
		employe e2=new employe(2005);
		Manager M1=new Manager(10);
		Manager M2=new Manager(20);
		ArrayList <allEmploye> listEmploye=new ArrayList<allEmploye>();
		listEmploye.add(v1);
		listEmploye.add(v2);
		listEmploye.add(e2);
		listEmploye.add(e1);
		listEmploye.add(M1);
		listEmploye.add(M2);
		double salaireTotal=0;
		for(int i=0;i < listEmploye.size();i++)
			salaireTotal+=listEmploye.get(i).salaire();
		assertTrue(salaireTotal==13055);
	}

}
