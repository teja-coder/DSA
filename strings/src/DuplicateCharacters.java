import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCharacters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String s = in.next();
        HashMap<Character,Integer> m = new HashMap<Character,Integer>();
        for (int i = 0; i < s.length(); i++) {
            if(m.containsKey(s.charAt(i))){
                m.put(s.charAt(i),m.get(s.charAt(i))+1);
            }
            else
                m.put(s.charAt(i),1);
        }
        for(Map.Entry<Character,Integer> map : m.entrySet()){
            if(map.getValue()>1){
                System.out.println(map.getKey() + " " + map.getValue());
            }
        }
    }
}
