// 1 - Pacote
package intro;

// 2 - Referência as bibliotecas

// 3 - Classe
public class Medidas {
    // 3.1 Atributos - Caracteristicas

    // 3.2 - Métodos e Funções(verbos o que sabe fazer)
     public static void main(String[] args) {
        System.out.println("  BOM DIAA!!  Calculo de Areas!!");
         //Calculo de area reduzido
         int largura = 4;
         int comprimento = 3;

         System.out.println("Para largura de " + largura + " e o comprimento de "
                 + comprimento + "m, a area é de " + largura * comprimento + "m².");



    }
    public void calcularAreaModoExtenso(){
//  Calculo de area = Exemplo: o tamanho do tapete ou do piso
        int largura;
        int comprimento;
        int resultado;

        largura = 7;  //largura recebe 4
        comprimento = 3;

        resultado = largura * comprimento;
        System.out.println("Para largura de " + largura + " e o comprimento de "
                + comprimento + "m, a area é de " + resultado + "m².");
    }

    public void calcularAreaModoCompacto(){
         //Calculo de area reduzido
         int largura = 4;
         int comprimento = 3;

        System.out.println("Para largura de " + largura + " e o comprimento de "
                + comprimento + "m, a area é de " + largura * comprimento + "m².");
    }
}
