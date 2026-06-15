package InterfacePractice;

public interface Farmer {
//	cost for growing sugarcane
	public int spreadingCost(int t1);

	public int chemicalCost(int k1);

//	customer selling price
	public void finalCost(int spredingCost, int chemicalCost);
}
