package GenericType;

import java.util.*;

public class Intro {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Hello");
        list.add(1234);
        list.add(3.4);
        int n = (int) list.get(0);
        // this is not type safe and will result in runtime error so we need the generic
        // to get ride we define the type of arraylist like what type of data this hold
        ArrayList<Integer> listWithType = new ArrayList<>();
        listWithType.add(1234);
    }
}
