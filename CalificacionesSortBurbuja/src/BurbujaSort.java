
import java.util.Scanner;

public class BurbujaSort{

    public void Sort(String[] args) {
        
        System.out.println("cuantas calificaciones deseas ingresar");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

        int []calificaciones = new int[n]; 
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese la calificacion #" + (i + 1) + ": ");
            calificaciones[i] = sc.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (calificaciones[j] > calificaciones[j + 1]) {
                    int temp = calificaciones[j];
                    calificaciones[j] = calificaciones[j + 1];
                    calificaciones[j + 1] = (int) temp;
                }
            }
        }

        System.out.println("\ncalificaciones ordenadas de menor a mayor:");
        for (int c : calificaciones) {
            System.out.println(c);
        }


    }

}