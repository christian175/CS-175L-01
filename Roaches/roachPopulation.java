package Roaches;
public class roachPopulation {
	public int roachNum;
	
	public roachPopulation(int x) {
		roachNum = x;
	}
	
	public void breed() {
		roachNum = roachNum * 2;
	}
	
	public void spray(double y) {
		roachNum = (int) (Math.round(roachNum - (roachNum * (y / 100))));
	}
	
	public int getRoaches() {
		return roachNum;
	}
}
