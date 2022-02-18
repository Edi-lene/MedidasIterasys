// 1 - Pacote
package intro;

// 2 - Referência as bibliotecas

import java.util.Scanner;

// 3 - Classe
    public class Medidas {
    // 3.1 Atributos - Caracteristicas

    // 3.2 - Métodos e Funções(verbos o que sabe fazer. Void não retorna valor)
     public static void main(String[] args) {
      //Condicional é verificar uma condição fazer uma pergunta para uma pessoa, ou um hardware ou software
      //switch = selecionar o comportamento do programa conforme aesoclha da pessoa ou do software
      //Utilizar  a classe do java para ler a escolha do usuário no console
       Scanner scanner = new Scanner(System.in);
       System.out.println(" M E N U  DE  O P Ç Õ E S");
       System.out.println("C - calcularAreaModoCurto");
       System.out.println("D - contarAteDez");
       System.out.println("E - calcularAreaModoExtenso");
       System.out.println("I - if Simples");
       System.out.println("DIGITE a opção desejada: ");
       String opcao = scanner.next();

       //String opcao = "curto";

        switch (opcao){

           case "C":
           case "c":
                System.out.println("Você escolheu executar o metodo calcularAreaModoCurto");
                calcularAreaModoCurto ();
                break;
            case "D":
            case "d":
               System.out.println("Você escolheu executar o metodo contarAteDez");
               contarAteDez();
               break;
           case "E":
           case "e":
               System.out.println("Você escolheu executar o metodo calcularAreaModoExtenso");
               calcularAreaModoExtenso();
               break;
            case "I":
            case "i":
                System.out.println("Você escolheu executar o metodo ifsimples");
                ifSimples ();
                break;
           default:
               System.out.println("Você escolheu outro valor que não tem uma ação associado");
               break;
       }


    }

    public static void ifSimples(){
        //Condicional é verificar uma condição fazer uma pergunta para uma pessoa, ou um hardware ou software

        // if = se
        // else = senão

        String modo = "curto";

        if (modo == "curto"){
            calcularAreaModoCurto();
        }
        else{
            calcularAreaModoExtenso();
        }
    }

    public static void calcularAreaModoCurto(){
        System.out.println(" Calculo de Areas Modo Curto!!");

         //Calculo de area reduzido
        int largura = 4;
        int comprimento = 3;

        System.out.println(" Para largura de " + largura + " e o comprimento de "
                + comprimento + "m, a area é de " + largura * comprimento + "m².");
    }

    public static void calcularAreaModoExtenso(){

        System.out.println(" Calculo de Areas Modo Extenso!!");
          //Calculo de area = Exemplo: o tamanho do tapete ou do piso
        int largura;
        int comprimento;
        int resultado;

        largura = 7;  //largura recebe 4
        comprimento = 3;

        resultado = largura * comprimento;
        System.out.println(" Para largura de " + largura + " e o comprimento de "
                + comprimento + "m, a area é de " + resultado + "m².");
    }

    public static void contarAteDez(){ //Loops ou repetição // for é o mais comum repeti quando mandar
        System.out.println("Contagem Crescente");
         for(int numero = 1; numero <= 10; numero++){
             System.out.println(numero);
         }
    }


}
