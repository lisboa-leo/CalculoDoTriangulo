import application.Triangle;
import java.util.Locale;
import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tcd = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new  Triangle();

        System.out.println("Entre com os numeros do triangulo X: ");
        x.a = tcd.nextDouble();
        x.b = tcd.nextDouble();
        x.c = tcd.nextDouble();
        System.out.println("Entre com os numeros do triangulo Y: ");
        y.a = tcd.nextDouble();
        y.b = tcd.nextDouble();
        y.c = tcd.nextDouble();

        double p = (x.a + x.b + x.c) /2.0;
        double areaX = Math.sqrt(p *(p - x.a) *(p - x.b)* (p - x.c));

        p = (y.a + y.b + y.c) / 2.0;
        double areaY = Math.sqrt(p *(p - y.a) *(p - y.b)* (p - y.c));


    }
}
