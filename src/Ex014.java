import java.util.ArrayList;

public class Ex014 {

    public static void main(String[] args) {

        ArrayList<Integer> quadrado = gerador.gerarQuadrado();

        int x1 = gerador.pegarNumeroAleatorio(quadrado),
            x2 = gerador.pegarNumeroAleatorio(quadrado),
            x3 = gerador.pegarNumeroAleatorio(quadrado),
            x4 = gerador.pegarNumeroAleatorio(quadrado),
            x5 = gerador.pegarNumeroAleatorio(quadrado),
            x6 = gerador.pegarNumeroAleatorio(quadrado),
            x7 = gerador.pegarNumeroAleatorio(quadrado),
            x8 = gerador.pegarNumeroAleatorio(quadrado),
            x9 = gerador.pegarNumeroAleatorio(quadrado);

        int contador = 1;

        while(
            ((x1 + x2 + x3) != 15) || ((x4 + x5 + x6) != 15) || ((x7 + x8 + x9) != 15) ||
            ((x1 + x4 + x7) != 15) || ((x2 + x5 + x8) != 15) || ((x3 + x6 + x9) != 15) ||
            ((x1 + x5 + x9) != 15) || ((x3 + x5 + x7) != 15)
        ) {
            quadrado = gerador.gerarQuadrado();
            contador++;
            x1 = gerador.pegarNumeroAleatorio(quadrado);
            x2 = gerador.pegarNumeroAleatorio(quadrado);
            x3 = gerador.pegarNumeroAleatorio(quadrado);
            x4 = gerador.pegarNumeroAleatorio(quadrado);
            x5 = gerador.pegarNumeroAleatorio(quadrado);
            x6 = gerador.pegarNumeroAleatorio(quadrado);
            x7 = gerador.pegarNumeroAleatorio(quadrado);
            x8 = gerador.pegarNumeroAleatorio(quadrado);
            x9 = gerador.pegarNumeroAleatorio(quadrado);
        }

        System.out.println(x1 + " - " + x2 + " - " + x3);
        System.out.println(x4 + " - " + x5 + " - " + x6);
        System.out.println(x7 + " - " + x8 + " - " + x9);

        System.out.println("------------------------------");
        System.out.println("Quantidade de Tentativas: " + contador);
        System.out.println("------------------------------");
    }
}