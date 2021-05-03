package model;

public class ResidualBudget {
    private double residualBudget;
    private double percentOfExpenses;

    public ResidualBudget(double residualBudget, double percentOfExpenses) {
        this.residualBudget = residualBudget;
        this.percentOfExpenses = percentOfExpenses;
    }

    public double getResidualBudget() {
        return residualBudget;
    }

    public double getPercentOfExpenses() {
        return percentOfExpenses;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ResidualBudget)) {
            return false;
        }
        ResidualBudget other = (ResidualBudget) o;

        return Double.compare(this.residualBudget, other.residualBudget) == 0
                && Double.compare(this.percentOfExpenses, other.percentOfExpenses) == 0;

    }
}
