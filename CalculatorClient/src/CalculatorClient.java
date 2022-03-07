import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class CalculatorClient {
    static Connector connect = new Connector();
    static Socket socket;

    static {
        try {
            socket = connect.CreateConnection();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public CalculatorClient() throws IOException {

        Invaild.setVisible(false);
        Clear.setVisible(false);
        Undo.setVisible(false);
        HandleInput handler = new HandleInput(textField1, Clear, Undo, Invaild, socket);

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
        Undo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    handler.Handle("Undo");
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        });
        Clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    handler.Handle("Clear");
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        });
        zero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    handler.Handle("0");
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        });
    }

    public static void main(String[] args) throws IOException {

        frame.setContentPane(new CalculatorClient().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent e) {
                try {
                    socket.close();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        });

    }
    static JFrame frame = new JFrame("CalculatorClient");
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
    private JButton Clear;
    private JButton Undo;
    private JLabel Invaild;

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
