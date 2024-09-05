import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        int ej,op;
        double V,I,R,T1,Q1,P1,RES,POR1,POR2,POR3,DEF;

        System.out.println("Elige el ejercicio que deseas realizar");
        System.out.println("1-Ejercicio ley de ohm");
        System.out.println("2-Ejercicio notas");
        ej= teclado.nextInt();
        switch (ej) {
            case 1:
                System.out.println("BIENVENIDO A LA LEY DE OHM");
                System.out.println("Elige la opcion que deseas hallar");
                System.out.println("1-Voltaje");
                System.out.println("2-Corriente");
                System.out.println("3-Resistencia");
                op = teclado.nextInt();
                if (op == 1) {
                    System.out.println("Digita el valor de la corriente");
                    I = teclado.nextDouble();
                    System.out.println("Digita el valor de la resistencia");
                    R = teclado.nextDouble();
                    V = I * R;
                    System.out.println("El valor del voltaje es: " + df.format(V));
                } else if (op == 2) {
                    System.out.println("Digita el valor de el voltaje");
                    V = teclado.nextDouble();
                    System.out.println("Digita el valor de la resistencia");
                    R = teclado.nextDouble();
                    I = V / R;
                    System.out.println("El valor de la corriente es: " + df.format(I));
                } else if (op == 3) {
                    System.out.println("Digita el valor de el voltaje");
                    V = teclado.nextDouble();
                    System.out.println("Digita el valor de la corriente");
                    I = teclado.nextDouble();
                    R = V / I;
                    System.out.println("El valor de la resistencia es: " + df.format(R));
                }
            case 2:
                System.out.println("BIENVENIDO A EL  PROGRAMA DE TUS NOTAS");

                System.out.println("Ingresa las notas de el corte 1");
                System.out.println("Ingrese la nota de tareas");
                T1 = teclado.nextDouble();
                System.out.println("Ingrese la nota de quizes");
                Q1 = teclado.nextDouble();
                System.out.println("Ingrese la nota de parcial");
                P1 = teclado.nextDouble();
                RES = T1 + Q1 + P1;
                System.out.println("La suma de sus notas es: " + RES);
                POR3 = RES * 0.35;
                System.out.println("Su nota del primer corte es: " + df.format(POR3));

                System.out.println("Ingresa las notas de el corte 2");
                System.out.println("Ingrese la nota de tareas");
                T1 = teclado.nextDouble();
                System.out.println("Ingrese la nota de quizes");
                Q1 = teclado.nextDouble();
                System.out.println("Ingrese la nota de parcial");
                P1 = teclado.nextDouble();
                RES = T1 + Q1 + P1;
                System.out.println("La suma de sus notas es: " + RES);
                POR2 = RES * 0.35;
                System.out.println("Su nota del primer corte es: " + df.format(POR2));

                System.out.println("Ingresa las notas de el corte 3");
                System.out.println("Ingrese la nota de tareas");
                T1 = teclado.nextDouble();
                System.out.println("Ingrese la nota de quizes");
                Q1 = teclado.nextDouble();
                System.out.println("Ingrese la nota de parcial");
                P1 = teclado.nextDouble();
                RES = T1 + Q1 + P1;
                System.out.println("La suma de sus notas es: " + RES);
                POR1 = RES * 0.30;
                System.out.println("Su nota del primer corte es: " + df.format(POR1));

                DEF = (POR1 + POR2 + POR3) / 3;
                System.out.println("Su nota definitiva es: " + df.format(DEF));

                if (DEF >= 3.0 && DEF <= 5.0) {
                    System.out.println("Aprovaste la materia");
                } else if (DEF >= 1.9 && DEF < 3.0) {
                    System.out.println("Habilitas la materia");
                } else if (DEF >= 0.0 && DEF <= 1.9) {
                    System.out.println("Reprovaste la materia");
                } else {
                    System.out.println("Error en las notas ingresadas");
                }
        }
    }
}

