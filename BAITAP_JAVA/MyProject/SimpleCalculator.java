import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator {
    private JFrame frame;
    private JTextField textField;
    private double num1, num2, result;
    private String operator;

    public SimpleCalculator() {
        frame = new JFrame("Simple Calculator");
        textField = new JTextField();
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));

        // Buttons
        JButton[] buttons = new JButton[16];
        String[] buttonLabels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+"
        };

        for (int i = 0; i < 16; i++) {
            buttons[i] = new JButton(buttonLabels[i]);
            panel.add(buttons[i]);
            buttons[i].addActionListener(new ButtonClickListener());
        }

        frame.setLayout(new BorderLayout());
        frame.add(textField, BorderLayout.NORTH);
        frame.add(panel, BorderLayout.CENTER);
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            if (command.charAt(0) >= '0' && command.charAt(0) <= '9' || command.equals(".")) {
                textField.setText(textField.getText() + command);
            } else if (command.charAt(0) == '=') {
                num2 = Double.parseDouble(textField.getText());
                switch (operator) {
                    case "+": result = num1 + num2; break;
                    case "-": result = num1 - num2; break;
                    case "*": result = num1 * num2; break;
                    case "/": result = num1 / num2; break;
                }
                textField.setText(String.valueOf(result));
                operator = "";
            } else {
                if (!operator.isEmpty()) {
                    num2 = Double.parseDouble(textField.getText());
                    switch (operator) {
                        case "+": result = num1 + num2; break;
                        case "-": result = num1 - num2; break;
                        case "*": result = num1 * num2; break;
                        case "/": result = num1 / num2; break;
                    }
                    textField.setText(String.valueOf(result));
                }
                num1 = Double.parseDouble(textField.getText());
                operator = command;
                textField.setText("");
            }
        }
    }

    public static void main(String[] args) {
        new SimpleCalculator();
    }
}
