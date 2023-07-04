public class RewardValue {
    double cashValue;
    int milesValue;
    double convRate = 0.0035;
    public RewardValue(double cash){
        cashValue = cash;
        milesValue = (int)(cash / convRate);
    };

    public RewardValue(int miles){
        cashValue = miles * convRate;
        milesValue = miles;
    };

    public double getCashValue(){
        return cashValue;
    }

    public int getMilesValue(){
        return milesValue;
    }



}
