public class App {
    public static void main(String[] args) {
        double [] numeros = {58.0,26.0};
        Suma suma = new Suma();
        Resta resta = new Resta();
        Multiplicacion multiplicacion = new Multiplicacion();
        Division division = new Division();

        System.out.println(suma.sumar(numeros));
        System.out.println(resta.restar(numeros[0], numeros[1]));
        System.out.println(multiplicacion.multiplicar(numeros[0], numeros[1]));
        System.out.println(division.dividir(numeros[0], numeros[1]));
    }
}
