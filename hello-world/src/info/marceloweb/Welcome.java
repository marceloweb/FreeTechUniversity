package info.marceloweb;

import java.util.Scanner;

public class Welcome {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String name = input.next();

        System.out.println("Digite a hora atual(dois dígitos)");
        int time = input.nextInt();

        if (time > 12 && time <= 18) {
            System.out.println("Boa tarde " + name);
        } else if (time > 18) {
            System.out.println("Boa noite " + name);
        } else {
            System.out.println("Bom dia " + name);
        }

        System.out.println("Finalizando o exemplo... Tchau!");

    }
}
