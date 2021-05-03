package view.form.output;

import view.form.Clearable;

import javax.swing.*;
import java.awt.*;

public class BudgetHealthIndicatorField extends JProgressBar implements Clearable {
    public BudgetHealthIndicatorField() {
        super();
        this.setBackground(Color.BLUE);
    }

    public void update(int percentage, Color background) {
        this.setValue(percentage);
        this.setBackground(background);
    }

    public void clear() {
        this.setValue(0);
        this.setBackground(Color.BLUE);
    }
}
