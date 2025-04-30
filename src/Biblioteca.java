import java.util.Locale;
import java.util.Scanner;
import java.lang.String;

class Libro {

    String titulo, autor;
    int anioPublicacion;

    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    void mostrar() {
        System.out.println("--- Reporte del Libro ---");
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año Publicacion: " + anioPublicacion);
        System.out.println("-------------------------");
    }

    void editarAnio(Scanner entrada) {
        System.out.println("Actualizando información...");
        System.out.println("Actualizar año publicacion: ");
        anioPublicacion = entrada.nextInt();
        entrada.nextLine();
    }
}

public class Biblioteca {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("----- BIBLIOTECA -----");
        System.out.println("Ingresando Libro 1...");
        System.out.println("Ingrese el titulo: ");
        String titulo = teclado.nextLine();
        System.out.println("Ingrese el autor: ");
        String autor = teclado.nextLine();
        System.out.println("Ingrese año de publicación: ");
        int anioPublicacion = teclado.nextInt();
        teclado.nextLine();
        Libro Libro1 = new Libro(titulo, autor, anioPublicacion);

        System.out.println("Ingresando Libro 2...");
        System.out.println("Ingrese el titulo: ");
        String titulo2 = teclado.nextLine();
        System.out.println("Ingrese el autor: ");
        String autor2 = teclado.nextLine();
        System.out.println("Ingrese el año publicacion: ");
        int anioPublicacion2 = teclado.nextInt();
        teclado.nextLine();
        Libro Libro2 = new Libro(titulo2, autor2, anioPublicacion2);

        Libro1.mostrar();
        Libro2.mostrar();

        System.out.println("¿Desea editar algún libro? (si/no): ");
        String selec = teclado.nextLine();
        selec = selec.toLowerCase(Locale.ROOT);

        while (selec.equals("si")) {

            System.out.println("¿Qué libro desea editar?: ");
            System.out.println("1. Libro 1" + "\n2. Libro 2");
            int lib = teclado.nextInt();
            teclado.nextLine();
            switch (lib) {
                case 1:
                    Libro1.editarAnio(teclado);
                    Libro1.mostrar();
                break;
                case 2:
                    Libro2.editarAnio(teclado);
                    Libro2.mostrar();
                break;
                default: System.out.println("Opción no válida.");
            }

            System.out.println("¿Desea editar otro libro? (si/no): ");
            selec = teclado.nextLine();
            selec = selec.toLowerCase(Locale.ROOT);
        }
        System.out.println("Tenga un buen día, adiós.");

        teclado.close();
    }
}