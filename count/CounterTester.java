package count;

public class CounterTester {

	public static void main(String[] args) {
		Counter concertCounter = new Counter();
		int rValue = concertCounter.getValue();
		for (int i = 0; i < 10; i++) {
			concertCounter.click();
		}
		for (int i = 0; i < 5; i++) {
			concertCounter.unclick();
		}
		rValue = concertCounter.getValue();
		System.out.println("expected venue: " + 5);
		System.out.println(rValue);
		concertCounter.reset();
		
		for (int i = 0; i < 3; i++) {
			concertCounter.click();
		}
		
		for (int i = 0; i < 4; i++) {
			concertCounter.unclick();
		}
		rValue = concertCounter.getValue();
		System.out.println("expected venue: " + (-1));
		System.out.println("concertcounter =" + rValue);
		
		Counter anotherVenue = new Counter();
		anotherVenue.clickMany(10);
		anotherVenue.unclickMany(5);
		rValue = anotherVenue.getValue();
		System.out.println("Expected output: " + 5);
		System.out.println(rValue);
		
		anotherVenue.reset();
		anotherVenue.clickMany(3);
		anotherVenue.unclickMany(4);
		rValue = anotherVenue.getValue();
		System.out.println("Expected output: " + (-1));
		System.out.println(rValue);
		
	}

}
