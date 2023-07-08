public class RewardValue {

    // Create variables
    private double cashValue;
    private double milesValue;

    // Constructor that takes cash as a parameter
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue * 0.0035;
    }

    // Constructor that takes miles as a parameter
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue / 0.0035;
    }

    // Get cash value method
    public double getCashValue() {
        return cashValue;
    }

    // Get miles value constructor
    public double getMilesValue() {
        return milesValue;
    }

}
