import java.util.LinkedHashMap;
import java.util.Map;

public class LambdaFunctions {
    public static void main(String[] args)
    {
        int numItems;
        int[] mapItems = new int[2];
        //Map<Integer, Integer> numbersMap = new LinkedHashMap<Integer, Integer>();

        Scanner scan = new Scanner(System.in);
        numItems = scan.nextInt();

        for (int i = 0; i < numItems; i++)
        {
           mapItems = scan.nextInt();
           System.out.println("mapItems are '" + mapItems + "'");
        }
    }

    /*
    public boolean isOdd()
    {
        return true;
    }

    public boolean isPrime()
    {
        return true;
    }

    public boolean isPalindrome()
    {
        return true;
    }
    */
}
