public abstract class Money {

    protected int amount;
    protected String currency;

    /**
     * Dollar를 반환하는 팩토리 메서드
     *
     * @param amount
     * @return Dollar 인스턴스
     */
    public static Money dollar(int amount) {
        return new Dollar(amount);
    }

    public static Money franc(int amount) {
        return new Franc(amount);
    }

    @Override
    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount && getClass().equals(money.getClass());
    }

    public abstract Money times(int multiplier);

    public String currency() {
        return currency;
    }

}
