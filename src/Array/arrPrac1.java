
package Array;

import java.util.ArrayList;

public class arrPrac1 {
    public static void main(String[] args) {

        ArrayList userNames = new ArrayList();
        userNames.add("asmi");
        userNames.add("BA");
        userNames.add("Ram");
        userNames.remove("BA");
        System.out.println(userNames);
        System.out.println(userNames.contains("Ganesh"))

    }
}