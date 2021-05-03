package view.form.input.fields;

import javax.swing.*;
import java.text.NumberFormat;

public class MoneyInputField extends InputField {
    public MoneyInputField(String fieldName) {
        super(fieldName, new JFormattedTextField(NumberFormat.getCurrencyInstance()));
    }
}
