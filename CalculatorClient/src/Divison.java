public class Divison extends Operation{
    public Divison(){

    }

    public double Divide(double num1, double num2){
        if(num2 == 0){
            LogError("Divide by zero error");
        }
        return num1 / num2;
    }

}
