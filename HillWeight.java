/** 
  *  @author NomanMumtaz
*/

public class HillWeight {
    static int weightOfHill(int hillLevels , int weightOfPeak , int weightIncrement)
    {
        int weight = weightOfPeak ;

        for(int i = 2 ; i <= hillLevels; i++)
        {
            weightOfPeak += weightIncrement ;
            weight += (weightOfPeak * i); 
        } 

        return weight;
    }

    public static void main(String[] args)
    {
        System.out.println(weightOfHill(4, 2, 1));
    }
    
}
