package org.itstep.homework.bookstore.interfaces;

public class Wallet extends Credit {

    @Override
    public int getDebit() {
        return this.debit;
    }

    @Override
    protected void addDebit(int amount) {
        if ((debit + amount) >= MAX_AMOUNT) {
            this.debit = MAX_AMOUNT;
        } else {
            this.debit += amount;
        }
    }
}
