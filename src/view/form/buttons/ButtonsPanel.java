package view.form.buttons;

import javax.swing.*;
import java.awt.*;

public class ButtonsPanel extends JPanel {
    public ButtonsPanel() {
        super(new GridLayout(1, 2));

        this.add(new JButton("Submit"));
        this.add(new JButton("Clear"));
    }
}
