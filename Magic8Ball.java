public class Magic8Ball
{
   public static void main(String[] args)
   {
     // Get a random number from 1 to 8

     // Use if statements to test the random number
     // and print out 1 of 8 random responses
    int var = (int)(Math.random()*8) + 1;
    System.out.println(var);
      if (var == 1)
        {
            System.out.println("My reply is no");
        } 
    if (var == 2)
        {
            System.out.println("Better not tell you now");
        } 
     if (var == 3)
        {
            System.out.println("It is decidedly so");
        } 
    if (var == 4)
        {
            System.out.println("Without a doubt");
        } 
     if (var == 5)
        {
            System.out.println("Ask again later");
        } 
    if (var == 6)
        {
            System.out.println("Cannot predict now");
        } 
     if (var == 7)
        {
            System.out.println("Outlook not so good");
        } 
    if (var == 8)
        {
            System.out.println("You may rely on it");
        }



   }
}
