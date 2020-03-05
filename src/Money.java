public class Money{

    protected int amount;

    public boolean equals(Object object) {
        Money money = (Dollar) object;
        return amount == money.amount;
    }
}
