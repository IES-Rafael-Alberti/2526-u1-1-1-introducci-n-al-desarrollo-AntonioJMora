import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuál es tu nombre? ");
        String nombre = sc.nextLine();

        System.out.print("¿En qué año naciste? ");
        int anio_nacimiento = sc.nextInt();

        int anio_actual = 2025;
        int edad = anio_actual - anio_nacimiento;

        System.out.println("Hola " + nombre + ", tienes " + edad + " años. Este programa está hecho en el lenguaje de programación: Java.");
    }
}
