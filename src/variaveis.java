import java.util.Scanner;

public class variaveis
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota1, nota2, nota3, nota4, soma, media;

        System.out.println("Digite a primeira nota:");
        nota1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota:");
        nota2 = scanner.nextDouble();

        System.out.println("Digite a terceira nota:");
        nota3 = scanner.nextDouble();

        System.out.println("Digite a quarta nota:");
        nota4 = scanner.nextDouble();

        soma = nota1 + nota2 + nota3 + nota4;

        media = soma / 4;

        System.out.println("A média do aluno é: " + media);

        scanner.close();
    }
}

