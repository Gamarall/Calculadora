import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {


        //Evitar que o usuario digite a opção errada (tentar novamente) do while(opcao estiver incorreta)
        //tentar mais de uma operação após a concluida do while
        System.out.println("###CALCULADORA###");
        Scanner scanner=  new Scanner(System.in);;
        boolean exit = false;
        //do {
            Integer opcao = 0;
            try {
                do {
                    System.out.println("Escolha uma das opções abaixo:");
                    System.out.println("(1) Somar\n(2) Subtrair\n(3) Multiplicar\n(4) Dividir\n(9) Exit");
                    opcao = scanner.nextInt();
                    if (opcao < 1 || (opcao > 4 && opcao < 9) || opcao > 9) {
                        System.out.println("Tente novamente");
                    }

                } while (opcao < 1 || (opcao > 4 && opcao < 9) || opcao > 9);

                if (opcao == 9) {
                    System.out.println("Exit");
                    //break;
                }
                // o while só tem visibilidade do que esta fora do bloco do
                System.out.println("Escolha os numeros que deseja realizar a operação:");
                System.out.println("Primeiro numero:");
                Integer num1 = scanner.nextInt();
                System.out.println("Segundo numero:");
                Integer num2 = scanner.nextInt();

                Integer resultado = 0;
                switch (opcao) {
                    // switch é como se fosse um bloco de IF
                    case 1:
                        resultado = num1 + num2;
                        break;
                    case 2:
                        resultado = num1 - num2;
                        break;
                    case 3:
                        resultado = num1 * num2;

                        break;
                    case 4:
                        resultado = num1 / num2;
                        break;
                    default:
                        System.out.println("Opcao incorreta");
                }

                System.out.println("Resultado da operação: " + resultado);
            } catch (InputMismatchException exception){
                System.out.println("Digite somente as opções validas. Tente novamente.");
                scanner.next();
                //continue;
            }
        //} while(!exit);




    }
}