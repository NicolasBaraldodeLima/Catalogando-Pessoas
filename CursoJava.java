package academy.devdojo.maratonajava.introducao;
import java.util.Scanner;

public class CursoJava {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas pessoas estarão catalogadas no sistema de entrega?");
        int participantesEntrega = scanner.nextInt();

        if (participantesEntrega <= 0) {
            System.out.println("Quantidade inválida ou não condiz com os requerimentos do sistema");
        } else {

            for (int i = 1; i < participantesEntrega; i++) {
                System.out.println("Quantidade de participantes " + participantesEntrega);
            }

            System.out.println("Total de participantes " + participantesEntrega);
        }

        scanner.close();

    }

    }



