import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in);


        System.out.println("Digite o seu nome completo");
        String nome = entrada.nextLine();
        System.out.println("Digite a sua idade:");
        int idade = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Digite a sua altura:");
        double altura = entrada.nextDouble();
        entrada.nextLine();
        System.out.println("Digite o seu sexo(M/F):");
        char sexo = entrada.next().charAt(0);

        System.out.printf("Nome:%s\nIdade:%d\nAltura:%.2f\nSexo:%s", nome, idade, altura, sexo);



    }
}
