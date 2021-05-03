package view.form.output;

import view.form.Clearable;

import javax.swing.*;

public class MessageField extends JTextArea implements Clearable {
    public void clear() {
        this.setText("");
    }
}
