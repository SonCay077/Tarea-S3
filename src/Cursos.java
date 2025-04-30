import java.util.Locale;
import java.util.Scanner;
import java.lang.String;

class Curso{
    String nombre, codigo;
    int creditos;

    public Curso(String nombre, String codigo, int creditos){
        this.nombre = nombre;
        this.codigo = codigo;
        this.creditos = creditos;
    }
    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Codigo: " + codigo);
        System.out.println("Creditos: " + creditos);
    }
    public void editarCredito(Scanner entrada){
        creditos = entrada.nextInt();
        entrada.nextLine();
    }
}
public class Cursos{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("--Ingreso de cursos--");
        System.out.println("Ingrese el nombre del curso: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el codigo del curso: ");
        String codigo = scanner.nextLine();
        System.out.println("Ingrese los creditos del curso: ");
        int creditos = scanner.nextInt();
        scanner.nextLine();
        Curso curso = new Curso(nombre, codigo, creditos);

        curso.mostrarInfo();

        System.out.println("Editar créditos del curso (SI/NO): ");
        String selec = scanner.nextLine();
        selec = selec.toUpperCase(Locale.ROOT);

        while (selec.equals("SI")){
            System.out.println("Ingrese el nuevo valor de créditos: ");
            curso.editarCredito(scanner);

            curso.mostrarInfo();
            System.out.println("Editar créditos del curso (SI/NO): ");
            selec = scanner.nextLine();
            selec = selec.toUpperCase(Locale.ROOT);
        }
        System.out.println("Curso ingresado.");
        scanner.close();
    }
}