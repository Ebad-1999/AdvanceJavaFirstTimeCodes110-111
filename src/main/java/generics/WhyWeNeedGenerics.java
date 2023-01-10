package generics;

import java.util.ArrayList;
import java.util.List;

public class WhyWeNeedGenerics {
    public static void main(String[] args) {
        List<Object> listObject  = new ArrayList<>();
        listObject.add("Hello Generics");
        listObject.add(65);
        listObject.add(67);

        String str1 = (String) listObject.get(0);
        int int1 = (int) listObject.get(1);
        String str2 = (String) listObject.get(2);
        //string.valueOf
    }
}
