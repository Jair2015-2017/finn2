package untitledbp.unasat.sr.untitledbp.db.dto.oltp;

/**
 * Created by Jair on 2/16/2017.
 */

public class Transaction {

    private int id;
    private String name;
    private String descr;
    private double amount;
    private String date;
    Category category;

    public Transaction(int id, double amount, String date, Category category) {
        this.id = id;
        this.amount = amount;
        this.date = date;
        this.category = category;
    }

    public Transaction(int id, String name, String descr, double amount, String date, Category category) {
        this.id = id;
        this.name = name;
        this.descr = descr;
        this.amount = amount;
        this.date = date;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
