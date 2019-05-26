import java.util.HashMap;
import java.util.Map;

public class NamesList
{

    public static void main(String [] args)
    {
        Map<String, String> namesList = new HashMap<String, String>();

        namesList.put("Beltus", "Father");
        namesList.put("Brina", "Daughter");
        namesList.put("Briana", "Daughter");
        namesList.put("Bridget", "Mother");
        namesList.put("Simon", "Dog");

        for(String mapKey : namesList.keySet())
        {
            System.out.println(mapKey + " : " + namesList.get(mapKey));
        }
    }
}
