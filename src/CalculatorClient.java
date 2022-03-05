import javax.swing.*;

public class CalculatorClient {
    public CalculatorClient(){

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("CalculatorClient");
        frame.setContentPane(new CalculatorClient().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private JPanel panel1;
    private JTextField textField1;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
}
