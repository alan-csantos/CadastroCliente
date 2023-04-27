package Controle;

import java.util.Scanner;

public class Menu {
    private Scanner input = new Scanner(System.in);
    private int opcaoMenu;
    
    public Menu() {
        this.opcaoMenu = 0;
    }

    public void executarMenu() {
        while(opcaoMenu != -1) {
            System.out.println("Menu:");
            System.out.println("1 - Opção 1");
            System.out.println("2 - Opção 2");
            System.out.println("3 - Opção 3");
            System.out.println("-1 - Sair");
            System.out.print("Digite a opção desejada: ");
            opcaoMenu = input.nextInt();
            
            switch(opcaoMenu) {
                case 1:
                    System.out.println("Opção 1 selecionada!");
                    break;
                case 2:
                    System.out.println("Opção 2 selecionada!");
                    break;
                case 3:
                    System.out.println("Opção 3 selecionada!");
                    break;
                case -1:
                    System.out.println("Saindo do menu...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }
    }
}
