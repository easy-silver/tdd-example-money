public class Money {

    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    /**
     * Dollar를 반환하는 팩토리 메서드
     *
     * @param amount
     * @return Dollar 인스턴스
     */
    public static Money dollar(int amount) {
        return new Dollar(amount, "USD");
    }

    public static Money franc(int amount) {
        return new Franc(amount, "CHF");
    }

    @Override
    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount && getClass().equals(money.getClass());
    }

    public Money times(int amount) {
        return null;
    }

    public String currency() {
        return currency;
    }

}
