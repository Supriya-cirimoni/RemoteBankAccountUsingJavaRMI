package common;

public class Money{
	
    private double amount;
    
    public Money() {
    	this.amount=0;
    }

    public Money(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}