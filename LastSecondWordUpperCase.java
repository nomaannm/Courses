@author NomanMumtaz
public class LastSecondWordUpperCase {

    static String lastsecUpperCase(String input1)
    {
        String[] words = input1.split(" ");

        if(words.length >= 2)
        {
            String lastSecondWord = words[words.length - 2];
            return lastSecondWord.toUpperCase();
        }

        else{
            return " ";
        }
        
	}
    

    public static void main(String[] args)
    {
        System.out.println(lastsecUpperCase("Noman mumtaz"));
    }
    
}
