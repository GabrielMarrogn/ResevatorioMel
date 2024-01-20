import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

       while(sc.hasNext()){
        double v = sc.nextDouble(); // Volume do recipiente
        double d = sc.nextDouble(); // diametro do recipiente
        double pi = 3.14;
        double r = d/2; // raio

        double altura = v / (Math.pow(r, 2) * pi);
        double area = pi * r* r; 

        System.out.printf("ALTURA = %.2f\n", altura);
        System.out.printf("AREA = %.2f\n", area);
       }
        sc.close();

    }
}
