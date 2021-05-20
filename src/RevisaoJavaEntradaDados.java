import java.util.Scanner;


public class RevisaoJavaEntradaDados {

    public static void main(String[] args) {
        Scanner leitorDoTeclado = new Scanner(System.in);


        System.out.println("Digite o nome:");
        String nome = leitorDoTeclado.nextLine();

        System.out.println("Digite a idade:");
        int idade = leitorDoTeclado.nextInt();

        System.out.println("Digite o peso:");
        double peso = leitorDoTeclado.nextDouble();

        System.out.println("Digite o sexo:");
        char sexo = leitorDoTeclado.next().charAt(0);


        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " Anos");
        System.out.println("Peso: " + peso + " Kg");
        System.out.println("Sexo: " + sexo);

        leitorDoTeclado.close();
    }
}
