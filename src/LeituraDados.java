import java.util.Scanner;

public class LeituraDados {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /*System.out.println("Digite seu nome completo: ");
        String nomeCompleto = scan.nextLine();
        System.out.println("Seu nome completo é: " +nomeCompleto);

        System.out.println("Digite seu primeiro nome: ");
        String primeiroNome = scan.next();
        System.out.println("Seu primeiro nome é: " +primeiroNome);*/

        /*System.out.println("Digite a sua idade: ");
        int idade = scan.nextInt();
        System.out.println("Sua idade é: " +idade);*/

        /*System.out.println("Digite a sua altura: ");
        double altura = scan.nextDouble();
        System.out.println("A sua altura é: " +altura);*/

        System.out.println("Digite seu primeiro nome, idade, quantidade de filhos, altura e bichos de estimação");
        String primeiroNome = scan.next();
        int idade = scan.nextInt();
        byte quantidadeFilhos = scan.nextByte();
        float altura = scan.nextFloat();
        boolean temPet = scan.nextBoolean();

        System.out.println("Você digitou os seguintes valores: ");
        System.out.println("Primeiro nome: " +primeiroNome);
        System.out.println("Sua idade: " +idade);
        System.out.println("Quantos filhos ?: " +quantidadeFilhos);
        System.out.println("Qual a sua altura ?: " +altura);
        System.out.println("Tem algum bicho de estimação ?:" +temPet);
    }
}
