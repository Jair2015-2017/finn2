package untitledbp.unasat.sr.untitledbp.db.dto.olap;

import untitledbp.unasat.sr.untitledbp.db.dto.oltp.User;

/**
 * Created by Jair on 2/16/2017.
 */

public class Balance {
    private int id;
    private double opening;
    private double transactions;
    private double closing;
    private User user;

    public Balance() {
    }

    public Balance(int id, double opening, double transactions, double closing, User user) {
        this.id = id;
        this.opening = opening;
        this.transactions = transactions;
        this.closing = closing;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getOpening() {
        return opening;
    }

    public void setOpening(double opening) {
        this.opening = opening;
    }

    public double getTransactions() {
        return transactions;
    }

    public void setTransactions(double transactions) {
        this.transactions = transactions;
    }

    public double getClosing() {
        return closing;
    }

    public void setClosing(double closing) {
        this.closing = closing;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
