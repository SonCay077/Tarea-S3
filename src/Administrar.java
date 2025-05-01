import java.util.Scanner;

class Ciclistas {

    String nombre;
    float edad, km;

    public Ciclistas(String nombre, float edad, float km) {
        this.nombre = nombre;
        this.edad = edad;
        this.km = km;
    }

    void mostrarInfo(){
        System.out.println("--- FICHA DE CICLISTA ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("KM: " + km);
        System.out.println("-------------------------");
    }

    void actualizarKm(Scanner entrada){
        System.out.println("Actualizando KM de " + nombre + "...");
        System.out.println("Ingrese nuevo kilometraje recorrido: ");
        km = entrada.nextFloat();
        entrada.nextLine();
        System.out.println("Kilometraje actualizado correctamente!");
    }

    void promedioMensual(){
        float promedio = km/12;
        System.out.println("El promedio mensual de" + nombre + " es: " + promedio);
    }
}

public class Administrar {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("----- FEDERACIÓN -----");
        System.out.println("Ingresando Competidor 1...");
        System.out.println("Ingrese el nombre: ");
        String nombre1 = teclado.nextLine();
        System.out.println("Ingrese la edad: ");
        float edad1 = teclado.nextFloat();
        teclado.nextLine();
        System.out.println("Ingrese el recorrido (km): ");
        float km1 = teclado.nextFloat();
        teclado.nextLine();
        Ciclistas Ciclista1 = new Ciclistas(nombre1, edad1, km1);

        System.out.println("Ingresando Competidor 2...");
        System.out.println("Ingrese el  nombre: ");
        String nombre2 = teclado.nextLine();
        System.out.println("Ingrese la edad: ");
        float edad2 = teclado.nextFloat();
        teclado.nextLine();
        System.out.println("Ingrese el recorrido (km): ");
        float km2 = teclado.nextFloat();
        teclado.nextLine();
        Ciclistas Ciclista2 = new Ciclistas(nombre2, edad2, km2);

        System.out.println("Ingresando Competidor 3...");
        System.out.println("Ingrese el nombre: ");
        String nombre3 = teclado.nextLine();
        System.out.println("Ingrese la edad: ");
        float edad3 = teclado.nextFloat();
        teclado.nextLine();
        System.out.println("Ingrese el recorrido (km): ");
        float km3 = teclado.nextFloat();
        teclado.nextLine();
        Ciclistas Ciclista3 = new Ciclistas(nombre3, edad3, km3);

        Ciclista1.mostrarInfo();
        Ciclista2.mostrarInfo();
        Ciclista3.mostrarInfo();

        while (true){
            System.out.println("----- MENU -----");
            System.out.println("1. Mostrar Información de Competidor.");
            System.out.println("2. Actualizar Recorrido de Competidor.");
            System.out.println("3. Ver Promedio Mensual de Competidor.");
            System.out.println("4. Salir");
            System.out.println("Ingrese la opción: ");
            int opc = teclado.nextInt();
            teclado.nextLine();
            switch (opc){
                case 1:
                    System.out.println("Seleccione el competidor: ");
                    System.out.println("1. Competidor 1");
                    System.out.println("2. Competidor 2");
                    System.out.println("3. Competidor 3");
                    int opc1 = teclado.nextInt();
                    teclado.nextLine();
                    switch (opc1) {
                        case 1:
                            Ciclista1.mostrarInfo();
                            break;
                        case 2:
                            Ciclista2.mostrarInfo();
                            break;
                        case 3:
                            Ciclista3.mostrarInfo();
                            break;
                        default:
                            System.out.println("Opción no valida.");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Seleccione el competidor: ");
                    System.out.println("1. Competidor 1");
                    System.out.println("2. Competidor 2");
                    System.out.println("3. Competidor 3");
                    int opc2 = teclado.nextInt();
                    teclado.nextLine();
                    switch (opc2){
                        case 1: Ciclista1.actualizarKm(teclado);
                            break;
                        case 2: Ciclista2.actualizarKm(teclado);
                            break;
                        case 3: Ciclista3.actualizarKm(teclado);
                            break;
                        default: System.out.println("Opción no valida.");
                    }
                    break;
                case 3:
                    System.out.println("Seleccione el competidor: ");
                    System.out.println("1. Competidor 1");
                    System.out.println("2. Competidor 2");
                    System.out.println("3. Competidor 3");
                    int opc3 = teclado.nextInt();
                    teclado.nextLine();
                    switch (opc3){
                        case 1: Ciclista1.promedioMensual();
                            break;
                        case 2: Ciclista2.promedioMensual();
                            break;
                        case 3: Ciclista3.promedioMensual();
                            break;
                        default: System.out.println("Opción no valida.");
                    }
                    break;
                case 4:
                    System.out.println("Que tenga un buen día, adiós.");
                    break;
                default: System.out.println("Opción no valida.");
            }

            if (opc == 4) {
                break;
            }

        }

    }
}
