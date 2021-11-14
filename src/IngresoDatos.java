import java.util.Scanner;

public class IngresoDatos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, ingresa tu nombre: ");
        String nombre = sc.nextLine();

        System.out.println("y tu apellido: ");
        String apellido = sc.nextLine();

        System.out.println("¿Cuál es tu edad?: ");
        String edad = sc.nextLine();

        /* valida si en lo ingresado hay algun numero y si está entre 1 y 100
        --- falta que funcione para ingreso de numeros y letras juntos*/
        while ( edad.matches("^[a-zA-Z]+$") || Integer.parseInt(edad) > 100 || Integer.parseInt(edad) < 1) {
            System.out.println("por favor ingresa una edad valida:");
            String edad2 = sc.nextLine();
            edad = edad2;
        }

        System.out.println("Indica tu hobbie: ");
        String hobbie = sc.nextLine();

        System.out.println("¿Cuál es tu editor de código preferido?: ");
        String editor = sc.nextLine();

        System.out.println("¿Qué sistema operativo utilizas?: ");
        String sistema = sc.nextLine();

        System.out.println("Te llamas " + nombre + " " + apellido + " y tienes " + edad + " años.");
        System.out.println("Tu hobbie es " + hobbie + ".");
        System.out.println("Prefieres el editor de código " + editor + " y utilizas el sistema operativo " + sistema +".");
    }
}



