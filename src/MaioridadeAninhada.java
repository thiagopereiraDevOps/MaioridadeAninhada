import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class MaioridadeAninhada {
    public static void main(String[] args) {
        int ano_atual, ano_nasc, idade;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o ano atual: ");
        ano_atual = entrada.nextInt();
        System.out.println("Digite seu ano de nascimento");
        ano_nasc = entrada.nextInt();

        idade = ano_atual - ano_nasc;

        if (idade <= 16) {
            System.out.println("NAO PODE VOTAR");
        } else if ((idade >= 16 && idade < 18) || (idade > 70)) {
            System.out.println("O VOTO EH OPCIONAL");
        } else  {
            System.out.println("VOCE DEVE VOTAR");
        }
    }
}
