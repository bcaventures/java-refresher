import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest
{
    public static void main(String[] args)
    {
        Map<String, Integer> phoneBookMap = new LinkedHashMap<String, Integer>();
        phoneBookMap.put("Brina Ambe", 407390542);
        phoneBookMap.put("Briana Ambe", 106745351);
        phoneBookMap.put("Bridget Ngwa", 405331895);
        phoneBookMap.put("Nicoline Ambe", 109837632);
        phoneBookMap.put("Beltus Ambe", 515028643);
        phoneBookMap.put("Beltus Ambe", 315028643);
        phoneBookMap.put("Beltus Ambe", 615028643);

        System.out.println("Nicoline's phone number is '" + getPhoneNumber(phoneBookMap, "Nicoline Ambe") + "'");
        System.out.println("sorted map is '" + mapSorter(phoneBookMap) + "'");
    }

    public static int getPhoneNumber(Map<String, Integer> phoneMap, String name)
    {
        int phoneNum = 0;

        for (Map.Entry<String, Integer> map : phoneMap.entrySet())
        {
           if (map.getKey().equals(name))
           {
               System.out.println("Phone number of Nicoline is '" + map.getValue() + "'");
               phoneNum = map.getValue();
               break;
           }
        }
        return phoneNum;
    }

    public static Map<String, Integer> mapSorter(Map<String, Integer> phoneMap)
    {
        return Collections.sort(phoneMap, (x, y) -> (x.compareTo(y)));
    }
}
