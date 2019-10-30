import java.util.ArrayList;
import java.util.*;

public class Main{
    public static void main(String args[]) {
// create an array list
        List<String> namesList = Arrays.asList( "alex", "brian", "charles","mike","petros");
        ArrayList<String> al = new ArrayList<String>(namesList);
        Random r=new Random();
        int random=1+r.nextInt(al.size());
        System.out.println(al.get(random));


    }}
