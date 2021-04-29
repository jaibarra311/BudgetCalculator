package controller;

import model.Budget;
import model.ResidualBudget;

public class BudgetCalculator {

    public static ResidualBudget calculate(Budget budget){
        double expenses = budget.housingExpense
                + budget.insurance
                + budget.utilities
                + budget.food
                + budget.carExpense;


        double residualBudget = budget.monthlyIncome - expenses;
        double percentOfExpenses = expenses/ budget.monthlyIncome;

        return new ResidualBudget(residualBudget, percentOfExpenses);
    }
}
