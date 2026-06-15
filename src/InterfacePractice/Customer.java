package InterfacePractice;

import InterfacePractice.Sugarcane;
import InterfacePractice.Farmer;

public class Customer implements Farmer{
	public void finalCost(int spredingCost, int chemicalCost) {
		
		Farmer f = new Sugarcane();
		int spreding = f.spreadingCost(spredingCost);
		int chemical = f.chemicalCost(chemicalCost);
		int totalCost = spreding + chemical;
		
		System.out.println("Final cost for customer: " + totalCost);
	}

	@Override
	public int spreadingCost(int t1) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int chemicalCost(int k1) {
		// TODO Auto-generated method stub
		return 0;
	}
}

