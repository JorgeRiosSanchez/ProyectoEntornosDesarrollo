import org.apache.commons.math3.analysis.function.Subtract;

public class Resta {

    Subtract subtract = new Subtract();
    public double restar (double num1, double num2){
        return subtract.value(num1, num2);
    }
}
