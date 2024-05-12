package Reinos;

import java.util.Scanner;

// Clase principal del programa
public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenuReinos();
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    Animal animal = new Animal();
                    animal.mostrarCaracteristicas();
                    mostrarSubespeciesAnimal();
                    break;
                case 2:
                    Vegetal vegetal = new Vegetal();
                    vegetal.mostrarCaracteristicas();
                    mostrarSubespeciesVegetal();
                    break;
                case 3:
                    Fungi fungi = new Fungi();
                    fungi.mostrarCaracteristicas();
                    mostrarSubespeciesFungi();
                    break;
                case 4:
                    Protoctista protoctista = new Protoctista();
                    protoctista.mostrarCaracteristicas();
                    mostrarSubespeciesProtoctista();
                    break;
                case 5:
                    Monera monera = new Monera();
                    monera.mostrarCaracteristicas();
                    mostrarSubespeciesMonera();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }

        } while (opcion != 0);

        scanner.close();
    }

    // Método para mostrar el menú de los reinos
    public static void mostrarMenuReinos() {
        System.out.println("Seleccione un reino:");
        System.out.println("1. Animal");
        System.out.println("2. Vegetal");
        System.out.println("3. Fungi");
        System.out.println("4. Protoctista");
        System.out.println("5. Monera");
        System.out.println("0. Salir");
        System.out.print("Opción: ");
    }

    // Métodos para mostrar las subespecies de cada reino con sus características
    public static void mostrarSubespeciesAnimal() {
        System.out.println("Subespecies de Animal:");
        System.out.println("1. Mamíferos: Nutrición - Heterótrofa, Organización celular - Pluricelulares, Tipología celular - Eucariotas, Respiración - Aeróbica, Reproducción - Sexual, Locomoción - Autónoma");
        System.out.println("2. Aves: Nutrición - Heterótrofa, Organización celular - Pluricelulares, Tipología celular - Eucariotas, Respiración - Aeróbica, Reproducción - Sexual, Locomoción - Autónoma");
        System.out.println("3. Peces: Nutrición - Heterótrofa, Organización celular - Pluricelulares, Tipología celular - Eucariotas, Respiración - Aeróbica, Reproducción - Sexual, Locomoción - Autónoma");
    }

    public static void mostrarSubespeciesVegetal() {
        System.out.println("Subespecies de Vegetal:");
        System.out.println("1. Árboles: Nutrición - Autótrofa, Organización celular - Pluricelulares, Tipología celular - Eucariotas, Respiración - Aeróbica, Reproducción - Asexual, Locomoción - Inmóvil");
        System.out.println("2. Flores: Nutrición - Autótrofa, Organización celular - Pluricelulares, Tipología celular - Eucariotas, Respiración - Aeróbica, Reproducción - Asexual, Locomoción - Inmóvil");
        System.out.println("3. Hierbas: Nutrición - Autótrofa, Organización celular - Pluricelulares, Tipología celular - Eucariotas, Respiración - Aeróbica, Reproducción - Asexual, Locomoción - Inmóvil");
    }

    public static void mostrarSubespeciesFungi() {
        System.out.println("Subespecies de Fungi:");
        System.out.println("1. Levaduras: Nutrición - Heterótrofa, Organización celular - Pluricelulares, Tipología celular - Eucariotas, Respiración - Aeróbica, Reproducción - Asexual y por esporas, Locomoción - Inmóvil");
        System.out.println("2. Mohos: Nutrición - Heterótrofa, Organización celular - Pluricelulares, Tipología celular - Eucariotas, Respiración - Aeróbica, Reproducción - Asexual y por esporas, Locomoción - Inmóvil");
        System.out.println("3. Setas: Nutrición - Heterótrofa, Organización celular - Pluricelulares, Tipología celular - Eucariotas, Respiración - Aeróbica, Reproducción - Asexual y por esporas, Locomoción - Inmóvil");
    }

    public static void mostrarSubespeciesProtoctista() {
        System.out.println("Subespecies de Protoctista:");
        System.out.println("1. Protozoos: Nutrición - Autótrofa y heterótrofa, Organización celular - Unicelulares y pluricelulares, Tipología celular - Eucariotas, Respiración - Aeróbica, Reproducción - Asexual y sexual, Locomoción - Variable");
        System.out.println("2. Algas: Nutrición - Autótrofa y heterótrofa, Organización celular - Unicelulares y pluricelulares, Tipología celular - Eucariotas, Respiración - Aeróbica, Reproducción - Asexual y sexual, Locomoción - Variable");
        System.out.println("3. Mixófitas: Nutrición - Autótrofa y heterótrofa, Organización celular - Unicelulares y pluricelulares, Tipología celular - Eucariotas, Respiración - Aeróbica, Reproducción - Asexual y sexual, Locomoción - Variable");
    }

    public static void mostrarSubespeciesMonera() {
        System.out.println("Subespecies de Monera:");
        System.out.println("1. Bacterias: Nutrición - Heterótrofa, Organización celular - Unicelulares, Tipología celular - Procariotas, Respiración - Aeróbica y anaeróbica, Reproducción - Asexual, Locomoción - Inmóvil");
        System.out.println("2. Arqueas: Nutrición - Heterótrofa, Organización celular - Unicelulares, Tipología celular - Procariotas, Respiración - Aeróbica y anaeróbica, Reproducción - Asexual, Locomoción - Inmóvil");
        System.out.println("3. Cianobacterias: Nutrición - Heterótrofa, Organización celular - Unicelulares, Tipología celular - Procariotas, Respiración - Aeróbica y anaeróbica, Reproducción - Asexual, Locomoción - Inmóvil");
    }
}
