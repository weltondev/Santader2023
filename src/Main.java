import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
//        String nome = "Welton";
//        System.out.println("Hello, " + nome);
//
//        int a = 5;
//        int b = 3;
//
//        int soma = a + b;
//        int subtracao = a - b;
//        int multiplicacao = a * b;
//        float divisao = (float) a / b;
//
//        System.out.println(soma);
//        System.out.println(subtracao);
//        System.out.println(multiplicacao);
//        System.out.println(divisao);

//        boolean fimDeSemana = true;
//        boolean fazSol = true;
//        boolean vamosAPraia = fimDeSemana && fazSol;
//        String mensagem = vamosAPraia ? "Chegou o fim de Semana, vamos a praia!" : "Vamos esperar o fim de semana chegar e o tempo melhorar!";
//        System.out.println(mensagem);
        //ISO 8601
//        String nome = "Welton";
//        LocalDate hoje = LocalDate.now();
//        Locale brasil = new Locale( "pt", "BR");
//        String diaDaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
//        String saudacao;
//        LocalDateTime agora = LocalDateTime.now();
//        String hora = agora.getHour() + ":" + agora.getMinute();
//        System.out.println(hora);
//
//        if(agora.getHour() >= 0 && agora.getHour() < 12){
//            saudacao = "Bom Dia!";
//        }else if (agora.getHour() >= 12 && agora.getHour() < 18) {
//            saudacao = "Boa Tarde!";
//        }
//        else {
//            saudacao = "Boa Noite!";
//        }
//
//        System.out.printf("Olá, %s. Hojé é %s, são %s. %s %n", nome, diaDaSemana, hora,  saudacao.toUpperCase());

//        for (int i = 1; i <= 10; i++) {
//            for (int j = 1; j <= 10; j++) {
//                System.out.println(i + " X " + j + " = " + i * j);
//            }
//            System.out.println(i);
//        }

//        int[] numeros = new int[5];
//
//        numeros[0] = 1;
//        numeros[1] = 2;
//        numeros[2] = 3;
//        numeros[3] = 4;
//        numeros[4] = 5;
//
//        for (int i = 0; i < numeros.length; i++) {
//            System.out.println(numeros[i]);
//        }
        int resultado = soma(2, 8);
        System.out.println(resultado);
    }

    public static int soma (int a, int b) {
        return a + b;
    }
}


