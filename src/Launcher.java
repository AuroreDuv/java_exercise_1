import java.util.Scanner;

public class Launcher {
	public static void main(String args[]) {
		System.out.println("Hello");

		while(true)
    {
      Scanner scanner = new Scanner(System.in);
      String input = scanner.nextLine();

      if(input.equals("quit"))
      {
        System.exit(0);
      }
      else
      {
        System.out.println("Unknown command");
      }
    }
	}
}
