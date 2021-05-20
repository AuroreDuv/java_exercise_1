import java.util.Scanner;

public class Launcher {
    public static int fibo(int count)
    {
        int nbr1 = 0, nbr2 = 1, nbr3 = nbr1 + nbr2, i;

		if (count == 0)
		{
			return 0;
		}
		else if (count == 1)
		{
			return 1;
		}

        for(i = 2; i < count; ++i)
        {
            nbr1 = nbr2;
            nbr2 = nbr3;
            nbr3 = nbr1 + nbr2;
        }

		return nbr3;
    }

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
			else if(input.equals("fibo"))
			{
				int fib = fibo(scanner.nextInt());
				System.out.println(fib);
				scanner.nextLine();
			}
			else
			{
				System.out.println("Unknown command");
			}
		}
	}
}
