import java.util.Scanner;
class Main {
  public static void main(String[] args) {
		Scanner Scan= new Scanner(System.in);
			Athlete athlete1 = new Athlete("Derek Jeter","he is a retired","Baseball");

    System.out.println("Would you like to guess an athlete, ceo or actress/actor");
		String n= Scan.nextLine();
	if (n.equals("athlete"))
		{
			System.out.println("guess your athlete");
			String g= Scan.nextLine();
				if(n.equals("Derek Jeter"))
					 {
						 System.out.println("You guessed correct");
					 }
				else if(!(n.equals("Derek Jeter")))
				{
					System.out.println("Wrong, guess again, but first do you want a hint, if yes, type yes");
					String h= Scan.nextLine();
					if (h.equals("yes"))
					{
						System.out.println(athlete1.getSport());
						while(!(n.equals("Derek Jeter")))
							{
								System.out.println("Now guess");
								String p= Scan.nextLine();
								}
					}
				}

		}

		
		//System.out.println(athlete1.toString()); 
		Ceo CEO1 = new Ceo("Jeff Bezos","CEO of shopping website","Amazon");
		//System.out.println(CEO1.toString()); 
		Act Actor = new Act("Victoria Justice","In a kids show","Victorious");
		//System.out.println(Actor.toString()); 

  }
}