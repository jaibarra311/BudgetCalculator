package view.form.input;

import view.form.Clearable;
import view.form.input.fields.InputField;

import javax.swing.*;
import java.util.Arrays;

public class InputPanel extends JPanel implements Clearable {
    private final InputField[] fields;

    public InputPanel(InputField...fields) {
        super();
        this.fields = fields;

        for (InputField field: fields) {
            this.add(field.label);
            this.add(field.input);
        }
    }

    public void clear() {
        Arrays.stream(fields).forEach(InputField::clear);
    }
}
