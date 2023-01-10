package generics;

public class GenericTypeWithTwoParameters <S, U>{
    private S s;
    private U u;
    //constructor

    public GenericTypeWithTwoParameters(S s, U u) {
        this.s = s;
        this.u = u;
    }
    //Getter--Setter

    public S getS() {
        return s;
    }

    public void setS(S s) {
        this.s = s;
    }

    public U getU() {
        return u;
    }

    public void setU(U u) {
        this.u = u;
    }

    public static void main(String[] args) {
        GenericTypeWithTwoParameters<String, Integer> obj1 = new GenericTypeWithTwoParameters<>("Hello", 44);
        GenericTypeWithTwoParameters<Integer, String> obj2 = new GenericTypeWithTwoParameters<>(55, "Generics");
        System.out.println(obj1.getS());
        System.out.println(obj2.getU());
    }
}
