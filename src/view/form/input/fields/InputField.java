package view.form.input.fields;

import view.form.Clearable;

import javax.swing.*;

public class InputField implements Clearable {
    public JLabel label;
    public JTextField input;

    public InputField(String fieldName, JTextField input) {
        this.input = input;
        this.label = new JLabel(fieldName);
        this.label.setLabelFor(this.input);
        this.label.setHorizontalAlignment(SwingConstants.RIGHT);
/*
        this.input.setName("Amount");
        this.input.setColumns(10);
        this.input.setEditable(true);
*/
    }

    public void clear() {
        this.input.setText("");
    }
}
