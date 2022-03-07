import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class CalculatorClient {
    public CalculatorClient() throws IOException {


        HandleInput handler = new HandleInput(textField1);
        one.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    handler.Handle("1");
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        });
        two.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    handler.Handle("2");
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        });
        three.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    handler.Handle("3");
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        });
        four.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    handler.Handle("4");
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        });
        five.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    handler.Handle("5");
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        });
        six.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    handler.Handle("6");
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        });
        seven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    handler.Handle("7");
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        });
        eight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    handler.Handle("8");
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        });
        nine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    handler.Handle("9");
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        });
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    handler.Handle("C");
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        });
        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    handler.Handle("+");
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        });
        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    handler.Handle("-");
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        });
        mulitply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    handler.Handle("*");
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        });
        divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    handler.Handle("/");
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        });
        equals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    handler.Handle("=");
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        });
    }

    public static void main(String[] args) throws IOException {
        JFrame frame = new JFrame("CalculatorClient");
        frame.setContentPane(new CalculatorClient().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);




    }

    private JButton one;
    private JButton four;
    private JButton seven;
    private JButton zero;
    private JButton two;
    private JButton five;
    private JButton eight;
    private JButton equals;
    private JButton three;
    private JButton six;
    private JButton nine;
    private JButton clear;
    private JButton plus;
    private JButton minus;
    private JButton mulitply;
    private JButton divide;
    private JPanel panel1;
    private JTextField textField1;

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
