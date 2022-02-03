import com.services.Users;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Users> users = new ArrayList<>();
        int choose = 0;

        while(choose != 4) {
            System.out.println("[ 1 ] - Para cadastrar novo usuário");
            System.out.println("[ 2 ] - Listar todos os usuários");
            System.out.println("[ 4 ] - Sair\n");
            System.out.print("Digite sua escolha: ");
            choose = scan.nextInt();
            scan.nextLine(); //Clean the buffer
            switch (choose) {
                case 1 -> {
                    System.out.print("Digite o Nome Completo: ");
                    String name = scan.nextLine();
                    System.out.print("Digite o login: ");
                    String login = scan.nextLine();
                    System.out.print("Digite a sua senha: ");
                    String password = scan.nextLine();
                    System.out.print("Digite o seu e-mail: ");
                    String email = scan.nextLine();
                    Users newPeople = new Users(login, password, name, email);
                    System.out.println("Cadastrado:");
                    users.add(newPeople);
                    System.out.println(newPeople);
                }
                case 2 -> {
                    System.out.println("Usuários cadastrados:");
                    System.out.println(users + "\n");
                }
                default -> System.out.println("Digite [1] para cadastrar ou [4] para sair.");
            }
        }
        System.out.println("Você escolheu sair.");
    }
}
