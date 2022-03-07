import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

public class Logger {
    Vector logs = new Vector();
    int totalCalculations = 0;

    public Logger(){

    }

    public void LogItem(String calculation){
        logs.add(calculation);
        PrintToFile(calculation);
        totalCalculations+=1;
    }

    public int GetTotalCalculation(){
        return totalCalculations;
    }

    public Vector GetCalculations(){
        return logs;
    }

    public void PrintToFile(String output){
        String fileName = "./Calculations.txt";
        try {
            FileWriter fileWriteObj = new FileWriter(fileName , true);
            BufferedWriter writer = new BufferedWriter(fileWriteObj);
            writer.append("\n");
            writer.append(output);

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
