public class ChallengeReplace
{
  public static void main(String[] args)
  {
       String message = "I love cats! I have a cat named Coco. My cat's very smart!";

       // Write a loop here that replaces every occurrence of "cat"
       // in the message with "dog", using indexOf and substring.
    int index = 0;
    while ((index = message.indexOf("cat", index)) != -1) 
    {
      message = message.substring(0, index) + "dog" + message.substring(index + 3);
      index += 3;
    }
       System.out.println(message);
   }
}
