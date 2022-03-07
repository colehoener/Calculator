import javax.swing.*;
import java.io.IOException;
import java.net.Socket;
import java.util.Vector;

public class HandleInput {
    Vector calculation = new Vector();
    int totalOperands = 0;
    JTextField displayText = null;
    JButton Clear;
    JButton Undo;
    JLabel Invalid;

    CallServer serverCall = null;
    Addition addi = new Addition();
    Subtraction sub = new Subtraction();
    Multiplication mult = new Multiplication();
    Divison div = new Divison();
    Boolean didCalculation = false;
    String longCalc = "";
    Boolean isInvaild = false;

    public HandleInput(JTextField displayText, JButton Clear, JButton Undo, JLabel Invalid, Socket socket ) throws IOException {
        this.displayText = displayText;
        this.Clear = Clear;
        this.Undo = Undo;
        this.Invalid = Invalid;
        this.serverCall = new CallServer(socket);
    }

    public void Handle(String input) throws IOException {
        if(input == "+" || input == "-" || input == "*" || input == "/"){
            String lastEl = (String) calculation.elementAt(calculation.size() - 1);
            if(lastEl == "+" || lastEl == "-" || lastEl == "*" || lastEl == "/"){
                isInvaild = true;
                Clear.setVisible(true);
                Undo.setVisible(true);
                Invalid.setVisible(true);
            }
        }
        if(isInvaild){
            if(input == "Clear"){
                calculation.clear();
                displayText.setText("");
                longCalc = "";
                isInvaild = false;
                Clear.setVisible(false);
                Undo.setVisible(false);
                Invalid.setVisible(false);
            }
            else if(input == "Undo"){

                displayText.setText(displayText.getText());
                longCalc = "";
                isInvaild = false;
                Clear.setVisible(false);
                Undo.setVisible(false);
                Invalid.setVisible(false);
            }
        }
        else if(input == "Clear"){

        }
        else if(input == "Undo"){

        }
        else{
            if (didCalculation) {
                calculation.clear();
                displayText.setText("");
                didCalculation = false;
                totalOperands = 0;
            }

            //Check if equal sign
            if (input == "=") {
                longCalc = longCalc.concat("=");
                Calculate();
                didCalculation = true;
                totalOperands = 0;

                serverCall.Call(longCalc);
                longCalc = "";

            } else if (input == "C") {
                calculation.clear();
                displayText.setText("");
                longCalc = "";
            } else if (input == "+" || input == "-" || input == "*" || input == "/") {
                if (calculation.size() > 0) {
                    totalOperands++;
                    calculation.add(input);
                    displayText.setText(displayText.getText() + input);
                    longCalc = longCalc.concat(input);
                } else {
                    Clear.setVisible(true);
                    Undo.setVisible(true);
                    Invalid.setVisible(true);
                    isInvaild = true;
                }

            } else {
                calculation.add(input);
                displayText.setText(displayText.getText() + input);
                longCalc = longCalc.concat(input);
            }

            if (totalOperands > 1) {
                calculation.removeElementAt(calculation.size() - 1);
                Calculate();
                calculation.add(input);
                displayText.setText(displayText.getText() + input);
                totalOperands = 1;
            }
        }


        System.out.println("\nInput: " + input);
        System.out.println(calculation);
    }


    public double getNum1(int opperandPos){
        double num1;
        String num1String = "";
        for(int i = 0; i < opperandPos; i++){
            num1String = num1String.concat((String) calculation.elementAt(i));
        }

        num1 = Double.parseDouble(num1String);
        return num1;
    }

    public double getNum2(int opperandPos){
        double num2;
        String num2String = "";
        for(int i = opperandPos + 1; i < calculation.size(); i++){
            num2String = num2String.concat((String) calculation.elementAt(i));
        }

        num2 = Double.parseDouble(num2String);
        return num2;
    }

    public void Calculate(){
        for(int i = 0; i < calculation.size(); i++){
            if(calculation.elementAt(i) == "+"){
                double result = addi.add(getNum1(i), getNum2(i));
                longCalc = longCalc.concat(String.valueOf(result));
                displayText.setText(String.valueOf(result));
                calculation.clear();
                calculation.add(String.valueOf(result));
            }
            else if(calculation.elementAt(i) == "-"){
                double result = sub.Subtract(getNum1(i), getNum2(i));
                longCalc = longCalc.concat(String.valueOf(result));
                displayText.setText(String.valueOf(result));
                calculation.clear();
                calculation.add(String.valueOf(result));
            }
            else if(calculation.elementAt(i) == "*"){
                double result = mult.Multiply(getNum1(i), getNum2(i));
                longCalc = longCalc.concat(String.valueOf(result));
                displayText.setText(String.valueOf(result));
                calculation.clear();
                calculation.add(String.valueOf(result));
            }
            else if(calculation.elementAt(i) == "/"){
                double result = div.Divide(getNum1(i), getNum2(i));
                longCalc = longCalc.concat(String.valueOf(result));
                displayText.setText(String.valueOf(result));
                calculation.clear();
                calculation.add(String.valueOf(result));
            }
        }


    }
}
