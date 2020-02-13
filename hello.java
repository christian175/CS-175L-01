
public class hello {

    public static void main(String[] args) {
    	String firstName = "Car";
    	String name = "Cart";
    	if(firstName.compareTo(name) > 0) {
    		System.out.println("the first is greater than the second");
    	}
    	else if (firstName.compareTo(name)< 0){
    		System.out.println("The first is less than the second");
    	}
    	else {
    		System.out.println("they are the same");
    	}
    }
}
