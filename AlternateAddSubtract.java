/**
* @author NomanMumtaz
*/
public class Alternate {
    public static int addSubtractAlternate(int theNumber , int option)
    {
        int result = 0;
        boolean toggle = false ;
        if(option == 1)
        {
            result = theNumber ;
            while(theNumber >= 1)
            {
                if(toggle == false ){
                result -= (theNumber - 1);
                toggle = true ;
                theNumber--;
                }
                else if (toggle == true)
                {
                    result += (theNumber - 1);
                    toggle = false ;
                    theNumber--;
                }
            }
        }
        
        else if(option == 2)
        {
            result = theNumber ;
            while(theNumber >= 1)
            {
                if(toggle == false ){
                    result += (theNumber - 1);
                    toggle = true ;
                    theNumber--;
                }
                else if(toggle == true)
                {
                    result -= (theNumber - 1);
                    toggle = false ;
                    theNumber-- ;
                }
            }
        }
        return result ;
    }
    public static void main(String[] args)
    {
        System.out.println(addSubtractAlternate(6, 1));
        System.out.println(addSubtractAlternate(6,2));
    }
    
}
