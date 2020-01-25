import java.util.Scanner;
public class hello {

    public static void main(String[] args) {
      Scanner myObj = new Scanner(System.in);
      System.out.println("What is your name? ");

      String Name = myObj.nextLine();
      System.out.println("Hello " + Name + "!");
    }

}
