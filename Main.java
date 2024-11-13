import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese los materiales disponibles:");
        System.out.print("Tablas largas: ");
        int tablasLargas = sc.nextInt();
        System.out.print("Tablas cortas: ");
        int tablasCortas = sc.nextInt();
        System.out.print("Ganchos pequeños: ");
        int ganchosPequenos = sc.nextInt();
        System.out.print("Ganchos grandes: ");
        int ganchosGrandes = sc.nextInt();
        System.out.print("Tornillos: ");
        int tornillos = sc.nextInt();

        int tablasLargasNecesarias = 30;
        int tablasCortasNecesarias = 30;
        int ganchosPequenosNecesarios = 15;
        int ganchosGrandesNecesarios = 15;
        int tornillosNecesarios = 150;

        if (tablasLargas >= tablasLargasNecesarias &&
            tablasCortas >= tablasCortasNecesarias &&
            ganchosPequenos >= ganchosPequenosNecesarios &&
            ganchosGrandes >= ganchosGrandesNecesarios &&
            tornillos >= tornillosNecesarios) {
            System.out.println("Se pueden hacer los 15 estantes.");
        } else {
            System.out.println("No se pueden hacer los 15 estantes.");
        }

        sc.close();
    }
}