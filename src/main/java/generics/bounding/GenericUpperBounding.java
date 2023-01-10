package generics.bounding;

public class GenericUpperBounding <T extends Number>{ //setting boundary from upper --> it is now subclass of Number class
    private T[] numberArray;
    //constructor
    public GenericUpperBounding(T[] numberArray) {
        this.numberArray = numberArray;
    }
    //method to find average of array of numbers
    public double getAverage(){
        double sum = 0;
        for (T t:numberArray){
            sum += t.doubleValue(); //doubleValue()--> converts elements to double  data type
        }
        double avg= sum/numberArray.length;
        return avg;
    }
//main method starts
    public static void main(String[] args) {
        Integer [] intArr = {2, 5, 7, 8};
        GenericUpperBounding<Integer> obj1 = new GenericUpperBounding<>(intArr);
        System.out.println(obj1.getAverage());
        Double [] doubleAr ={4.5, 6.8, 7.0};
        GenericUpperBounding<Double> obj2 = new GenericUpperBounding<>(doubleAr);
        System.out.println(obj2.getAverage());
//        String [] strArr = {"A", "A"};
//        GenericUpperBounding<String> obj3 = new GenericUpperBounding<>(strArr); //It will save us from RTE, typeCasting
    }
}
