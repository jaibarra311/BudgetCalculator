package view;

import view.form.buttons.ButtonsPanel;
import view.form.input.InputPanel;
import view.form.input.fields.*;
import view.form.output.OutputPanel;

import javax.swing.*;
import java.awt.*;

public class BudgetForm extends JFrame {
    InputPanel inputPanel;
    ButtonsPanel buttonsPanel = new ButtonsPanel();
    OutputPanel outputPanel = new OutputPanel();

    public BudgetForm() {
        super("Budget Calculator");
        initializeForm();
    }

    private void initializeForm() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 500);

        Container panel = this.getContentPane();
        panel.setLayout(new GridLayout(3,1));

        createInputPanel();

        panel.add(inputPanel);
        panel.add(buttonsPanel);
        panel.add(outputPanel);

        this.setVisible(true);
    }

    private void createInputPanel() {
        inputPanel = new InputPanel(
                new MonthlyIncomeField(),
                new HousingExpensesField(),
                new InsuranceAndUtilitiesField(),
                new RestaurantsAndFoodField(),
                new AutomobileExpensesField()
        );
    }
}
