package generics;
//T-->Type
//N-->Number
//K-->Key
//V-->Value


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenericType <T> {

    private T type; //field or variable

    //Getter and Setter
    public T getType() {
        return type;
    }

    public void setType(T type) {
        this.type = type;
    }

    public static void main(String[] args) {
        //using generics 2 different data object created
        GenericType<String> obj = new GenericType<>();
        obj.setType("Hello Generics");
        //obj.setType(77); //so we can set only string value
        //we are getting CTE which will avoid RTE

        GenericType<Integer> obj2 = new GenericType<>();
        obj2.setType(65);
        //obj2.setType("8787");

        List<String> listString = new ArrayList<>();
        listString.add("65");// no ClassCastException


        Map<Integer, String> map = new HashMap<>();
        map.put(2, "34");

    }
}
