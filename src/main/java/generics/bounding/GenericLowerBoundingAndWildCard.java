package generics.bounding;

import java.util.ArrayList;
import java.util.List;

public class GenericLowerBoundingAndWildCard {
    public static void main(String[] args) {
        List<Object> ol = new ArrayList<>();
        addElement(ol);
        List <Number> nl = new ArrayList<>();
        addElement(nl);
        List<Double> dl = new ArrayList<>();
        //addElement(dl); //if we did not use generics, we would get RTE
        //----------------printElement()-------------------
        //we can do this
        List <String> strArr = new ArrayList<>();
        printElement(strArr);
        //----------------printObject()-------------------
        List <String> strArr1 = new ArrayList<>();
        //printObject(strArr1);
        List <Object> strObjlist = new ArrayList<>();
        printObject(strObjlist);

    }
    //super Integer -->it brings parent classes of Integer
    public static void addElement(List<? super Integer> list){
        //? -->WildCard
        for (int i = 1; i<=10;i++){
            list.add(i);
        }
    }
    //limitations of wildcard
    public static void printElement(List<?> listOfUnknown){
       // listOfUnknown.add("Java"); //because of ? (unknown data type, add method will not accept)
        //first we need to declare data type
        //listOfUnknown.add(null); //null value will work
        for(Object o: listOfUnknown){
            System.out.println(o);
        }
    }
    public static void printObject(List<Object> listOfObjects){
        listOfObjects.add("Java");
        for(Object o: listOfObjects){
            System.out.println(o);
        }
    }
}
