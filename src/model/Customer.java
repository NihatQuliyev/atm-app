package model;

public class Customer {
    private String name;
    private int password;
    private String iban;
    private int money;
    public Customer(String name, String iban, int password,int money) {
        this.iban = iban;
        this.name = name;
        this.password = password;
        this.money = money;
    }

    public Customer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIban() {
        return iban;
    }

    public String setIban(String iban) {

        return this.iban = iban;
    }

    public int getPassword() {
        return password;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", password=" + password +
                ", money=" + money +
                '}';
    }
}
