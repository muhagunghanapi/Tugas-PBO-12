import javax.swing.*;
import java.awt.*;

public class CalculatorLayout extends JFrame {
    public CalculatorLayout() {
        setTitle("Calculator Layout");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        // JTextField di bagian atas
        JTextField textField = new JTextField();
        textField.setEditable(false);
        add(textField, BorderLayout.NORTH);

        // Panel untuk tombol dengan 3 baris 6 kolom
        JPanel buttonPanel = new JPanel(new GridLayout(3, 6, 5, 5));

        // Baris 1 tombol 1 s/d 6
        buttonPanel.add(new JButton("1"));
        buttonPanel.add(new JButton("2"));
        buttonPanel.add(new JButton("3"));
        buttonPanel.add(new JButton("4"));
        buttonPanel.add(new JButton("5"));
        buttonPanel.add(new JButton("6"));

        // Baris 2 tombol 7,8,9,0, +, -
        buttonPanel.add(new JButton("7"));
        buttonPanel.add(new JButton("8"));
        buttonPanel.add(new JButton("9"));
        buttonPanel.add(new JButton("0"));
        buttonPanel.add(new JButton("+"));
        buttonPanel.add(new JButton("-"));

        // Baris 3 tombol *, /, =, %, Mod, Exit
        buttonPanel.add(new JButton("*"));
        buttonPanel.add(new JButton("/"));
        buttonPanel.add(new JButton("="));
        buttonPanel.add(new JButton("%"));
        buttonPanel.add(new JButton("Mod"));
        buttonPanel.add(new JButton("Exit"));

        add(buttonPanel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CalculatorLayout frame = new CalculatorLayout();
            frame.setVisible(true);
        });
    }
}

