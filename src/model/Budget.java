package model;

import static model.Constant.negativeValueMessage;

public class Budget {
    public double monthlyIncome;
    public double housingExpense;
    public double insurance;
    public double utilities;
    public double food;
    public double carExpense;

    public Budget(double monthlyIncome, double housingExpense, double insurance, double utilities, double food, double carExpense) {
       if(monthlyIncome < 0){
           throw new IllegalArgumentException(negativeValueMessage);
       }
        this.monthlyIncome = monthlyIncome;
        this.housingExpense = housingExpense;
        this.insurance = insurance;
        this.utilities = utilities;
        this.food = food;
        this.carExpense = carExpense;

    }

}



