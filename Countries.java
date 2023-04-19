public class Countries
{
  public static void main(String[] args)
  {
       // 1. Declare 4 arrays and initialize them to the given values.
       // Countries: China, Egypt, France, Germany, India, Japan, Kenya, Mexico, United Kingdom, United States
       String[] Countries = {"China", "Egypt", "France", "Germany", "India", "Japan", "Kenya", "Mexico", "United Kingdom", "United States"};
       // Capitals: Beijing, Cairo, Paris, Berlin, New Delhi, Tokyo, Nairobi, Mexico City, London, Washington D.C.
       String[] Capitals = {"Beijing", "Cairo", "Paris", "Berlin", "New Delhi", "Tokyo", "Nairobi", "Mexico City", "London", "Washington D.C."};
       // Languages: Chinese, Arabic, French, German, Hindi, Japanese, Swahili, Spanish, English, English
       String[] Languages = {"Chinese", "Arabic", "French", "German", "Hindi", "Japanese", "Swahili", "Spanish", "English", "English"};
       // Filenames for map images: China.jpg, Egypt.jpg, France.jpg, Germany.jpg, India.jpg, Japan.jpg, Kenya.jpg, Mexico.jpg, UK.jpg, US.jpg
       String[] Filename = {"China.jpg", "Egypt.jpg", "France.jpg", "Germany.jpg", "India.jpg", "Japan.jpg", "Kenya.jpg", "Mexico.jpg", "UK.jpg", "US.jpg"};

       // 2. Pick a random number up to the length of one of the arrays and save in the variable index
       int index = (int) (Math.random() * Countries.length);
       // 3. Print out the info in each array using the random index
        System.out.println("Country: " + Countries[index]);
        System.out.println("Capital: " + Capitals[index]);
        System.out.println("Language: " + Languages[index]);
        System.out.println("Filename: " + Filename[index]);

    

   }

  }
  