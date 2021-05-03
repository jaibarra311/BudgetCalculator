package view.form.output;

import model.ResidualBudget;
import view.form.Clearable;

import javax.swing.*;
import java.awt.*;

public class OutputPanel extends JPanel implements Clearable {
    private final BudgetHealthIndicatorField budgetHealthIndicatorField = new BudgetHealthIndicatorField();
    private final MessageField messageField = new MessageField();
    private ResidualBudget residualBudget;

    public void update(ResidualBudget residualBudget) {
        this.residualBudget = residualBudget;

        if (this.residualBudget.getPercentOfExpenses() > 1.0) {
            overBudget();
        } else if (this.residualBudget.getPercentOfExpenses() < 0.7) {
            healthyBudget();
        } else {
            defaultOutput();
        }
    }

    private void overBudget() {
        budgetHealthIndicatorField.update((int) residualBudget.getPercentOfExpenses(), Color.RED);
        messageField.setText(" -- OVER BUDGET -- ");
    }

    private void healthyBudget() {
        budgetHealthIndicatorField.update((int) residualBudget.getPercentOfExpenses(), Color.GREEN);
        messageField.setText("You have plenty of room in your budget! Good job!");
    }

    private void defaultOutput() {
        budgetHealthIndicatorField.update((int) residualBudget.getPercentOfExpenses(), Color.BLUE);
        messageField.setText("You have $" + residualBudget.getResidualBudget() + " left in your budget.");
    }

    public void clear() {
        budgetHealthIndicatorField.clear();
        messageField.clear();
    }
}
