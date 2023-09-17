@author NomanMumtaz
/* This code calculates the weight of a string.. 
*/

class StringWeight
{
    static int weightOfString(String a)
    {
        int weight = 0 ;
        a = a.toLowerCase();
        for(int i = 0 ; i < a.length() ; i++)
        {
            int term = a.charAt(i);
            if(a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'o' || a.charAt(i) == 'u' || a.charAt(i) == 'i' || a.charAt(i) == ' ') weight += 0 ;
            else{
                if( term > 96 && term < 123) weight += (term - 96);
            }



        }
        return weight;
    }
    public static void main(String[] args)
    {
        System.out.println(weightOfString("AB z9"));
    }
}
