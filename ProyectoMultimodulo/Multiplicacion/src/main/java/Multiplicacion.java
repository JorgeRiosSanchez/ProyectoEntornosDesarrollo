import org.apache.commons.math3.analysis.function.Multiply;

public class Multiplicacion {
    Multiply multiply= new Multiply();
    public double multiplicar (double num1, double num2){
        return multiply.value(num1, num2);
    }
}
