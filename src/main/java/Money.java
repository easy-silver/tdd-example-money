public class Money {

    protected int amount;

    /**
     * Dollar를 반환하는 팩토리 메서드
     *
     * @param amount
     * @return Dollar 인스턴스
     */
    public static Dollar dollar(int amount) {
        return new Dollar(amount);
    }

    @Override
    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount && getClass().equals(money.getClass());
    }
}
