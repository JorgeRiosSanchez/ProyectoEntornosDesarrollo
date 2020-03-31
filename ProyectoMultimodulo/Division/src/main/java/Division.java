import org.apache.commons.math3.analysis.function.Divide;

public class Division {

    Divide divide = new Divide();
    public double dividir (double num1, double num2){
        return divide.value(num1, num2);
    }
}
