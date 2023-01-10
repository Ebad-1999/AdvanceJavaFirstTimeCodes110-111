package enums;

public class EnumTest {
    public static void main(String[] args) {
        benefitsOfEnumOverConstant();

    }
    //method to see benefits of enum
    private static void benefitsOfEnumOverConstant(){
        System.out.println("----------constantMethod-------");
        constantMethod(1);
        constantMethod(2);
        constantMethod(3);
        constantMethod(4);
        constantMethod(100);
        constantMethod(34);//it is not complaining but it s doing some unnecessary task
        constantMethod(13);
        System.out.println("---------enumMethod-------");
        enumMethod(TransactionType.DEPOSIT);
        enumMethod(TransactionType.WITHDRAW);
        enumMethod(TransactionType.PAYMENT);
        enumMethod(TransactionType.TRANSFER);
        enumMethod(TransactionType.OTHER);
        //enumMethod(TransactionType.AD); //we are getting CTE
        System.out.println("----------enum methods--------");
        //values() method gives all values in array format
        System.out.println(TransactionType.values()[3]);
        for(TransactionType tt: TransactionType.values()){
            System.out.println(tt.name().toString());
            System.out.println(tt.ordinal()); //will give index / ordinal of constant value
        }
        System.out.println("Transaction Code for Deposit: "+ TransactionType.DEPOSIT.getTransactioCode());//to get value
        System.out.println("Transaction Ordinal for Deposit: "+ TransactionType.DEPOSIT.ordinal());//to get ordinal or index
        System.out.println("Transaction Name for Deposit: "+ TransactionType.DEPOSIT.name());//to get name of const
    }

    //two methods to see why we need snums
    //method to work with constant class
    private static void constantMethod(int i){
        if(i == TransactionTypeConstant.DEPOSIT){
            System.out.println("Money is depositing...");
        } else if(i == TransactionTypeConstant.WITHDRAW){
            System.out.println("Money is withdrawing...");
        } else if(i == TransactionTypeConstant.TRANSFER){
            System.out.println("Money is transferring...");
        } else if(i == TransactionTypeConstant.PAYMENT){
            System.out.println("Money is being paid...");
        } else if(i == TransactionTypeConstant.OTHER){
            System.out.println("Some other transaction...");
        }
    }
    //method for enum
    private static void enumMethod(TransactionType tt){
//        if(tt == TransactionType.DEPOSIT){
//            System.out.println("Money is depositing...");
//        }else if(tt == TransactionType.WITHDRAW){
//            System.out.println("Money is withdrawing...");
//        } else if(tt == TransactionType.TRANSFER){
//            System.out.println("Money is transferring...");
//        } else if(tt == TransactionType.PAYMENT){
//            System.out.println("Money is being paid...");
//        } else if(tt == TransactionType.OTHER){
//            System.out.println("Some other transaction...");
//        }
        switch (tt){
            case DEPOSIT:
                System.out.println("Money is depositing...");
                break;
            case WITHDRAW:
                System.out.println("Money is withdrawing...");
                break;
            case TRANSFER:
                System.out.println("Money is transferring...");
                break;
            case PAYMENT:
                System.out.println("Money is being paid...");
                break;
            case OTHER:
                System.out.println("Some other transaction...");
        }
    }
}
