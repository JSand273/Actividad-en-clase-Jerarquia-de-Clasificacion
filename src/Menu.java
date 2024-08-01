import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private List<Dispositivos_electronicos> dispositivosElectronicos;
    private List<Computadoras> computadoras;
    private List<Laptops> laptops;
    private List<Desktop> desktops;
    private List<DispositivoMovil> dispositivoMovils;
    private List<Smartphone> smartphones;
    private List<Tablet> tablets;
    private List<Electrodomesticos> electrodomesticos;
    private List<Refrigerador> refrigeradors;
    private Scanner scanner;

    public Menu() {
        dispositivosElectronicos = new ArrayList<>();
        computadoras = new ArrayList<>();
        laptops = new ArrayList<>();
        desktops = new ArrayList<>();
        dispositivoMovils = new ArrayList<>();
        smartphones = new ArrayList<>();
        tablets = new ArrayList<>();
        electrodomesticos = new ArrayList<>();
        refrigeradors = new ArrayList<>();
    }

    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("----- Menú Principal -----");
            System.out.println("Dispositivos Electronicos Disponibles");
            System.out.println("Computadoras: ");
            System.out.println("1. Laptop");
            System.out.println("2. Desktop");
            System.out.println("Dispositivos Moviles");
            System.out.println("3. Smartphone");
            System.out.println("4. Tablet");
            System.out.println("Electrodomesticos");
            System.out.println("5. Regrigerador");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    seleccionLaptop(scanner);
                    break;
                case 2:
                seleccionDesktop(scanner);
                break;
                case 3:
                    seleccionSmartphone(scanner);
                    break;
                case 4:
                    seleccionTablet(scanner);
                    break;
                case 5:
                    seleccionRefri(scanner);
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        }

    }

    private void seleccionLaptop (Scanner scanner){
        this.scanner = scanner;
        System.out.println("Bienvenido Usuario");
        System.out.print("Favor Ingrese contraseña: ");
        String contraseña = scanner.nextLine();
        System.out.println("Las funciones a utilizar en una Laptop podrian ser el buscador, el gestor de archivos y su funcion mas importante la portatibilidad.");


        Laptops laptops = new Laptops(contraseña);
        Laptops.add(laptops);
    }
    private void seleccionDesktop (Scanner scanner){
        this.scanner = scanner;
        System.out.println("Bienvenido Usuario");
        System.out.print("Favor Ingrese contraseña: ");
        String contraseña = scanner.nextLine();
        System.out.println("Las funciones a utilizar en una Desktop o PC sobre mesa son el buscador, gestor de archivos y algunas funciones mas, pero la limitante de que no podemos llevarla con nostros.");


        Desktop desktop = new Desktop(contraseña);
        Desktop.add(desktop);
    }
    private void seleccionSmartphone (Scanner scanner){
        this.scanner = scanner;
        System.out.print("Favor Ingrese contraseña: ");
        String contraseña = scanner.nextLine();
        System.out.println("Las funciones a utilizar en una Smartphone son mas basicas, programas de mensajeria, juegos livianos, buscadores, calculadoras, camaras, y muchas funciones mas de manera portatil.");


        Smartphone smartphone = new Smartphone(contraseña);
        Smartphone.add(smartphone);
    }
    private void seleccionTablet (Scanner scanner){
        this.scanner = scanner;
        System.out.print("Favor Ingrese contraseña: ");
        String contraseña = scanner.nextLine();
        System.out.println("Las funciones a utilizar en una Tablet son edicion de texto, fotografias, notas, aplicaciones livianas y demas.");


        Tablet tablet = new Tablet(contraseña);
        Tablet.add(tablet);
    }
    private void seleccionRefri (Scanner scanner){
        this.scanner = scanner;
        System.out.println("Refrigerador abierto ");
        System.out.println("Contenido encontrado dentro es agua, frutas, verduras, carnes y bocadillos.");
    }
}