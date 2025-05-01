import java.util.Locale;
import java.util.Scanner;
import java.lang.String;

class Jugador{
    String nombre, posicion;
    int numero;

    public Jugador(String nombre, String posicion, int numero){
        this.nombre = nombre;
        this.posicion = posicion;
        this.numero = numero;
    }
    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Posición: " +posicion);
        System.out.println("Número: " + numero);
    }
    public void editarNumero(Scanner entrada){
        numero = entrada.nextInt();
        entrada.nextLine();
    }
}
public class Club{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("--Ingreso de Jugadores--");
        System.out.println("Ingrese el nombre del jugador: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese la posición del jugador: ");
        String posicion = scanner.nextLine();
        System.out.println("Ingrese el número del jugador: ");
        int numero = scanner.nextInt();
        scanner.nextLine();
        Jugador jugador = new Jugador(nombre, posicion, numero);

        jugador.mostrarInfo();

        System.out.println("Editar número del jugador (SI/NO): ");
        String selec = scanner.nextLine();
        selec = selec.toUpperCase(Locale.ROOT);

        while (selec.equals("SI")){
            System.out.println("Ingrese el nuevo número del jugador: ");
            jugador.editarNumero(scanner);

            jugador.mostrarInfo();
            System.out.println("Editar número del jugador (SI/NO): ");
            selec = scanner.nextLine();
            selec = selec.toUpperCase(Locale.ROOT);
        }
        System.out.println("Jugador ingresado.");
        scanner.close();
    }
}
