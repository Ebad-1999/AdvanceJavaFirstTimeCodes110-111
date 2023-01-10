package enums;
//declaring variables using enums
public enum TransactionType {
    DEPOSIT(4),
    WITHDRAW(10),
    TRANSFER(20),
    PAYMENT(30),
    OTHER(40);

    private final int transactioCode;

    public int getTransactioCode(){
        return transactioCode;
    }
    private TransactionType(int transactioCode) {
        this.transactioCode = transactioCode;
    }
}
