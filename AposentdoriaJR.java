import java.util.Scanner;

public class AposentdoriaJR {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Digite idade do fucionario: ");
		int idade = in.nextInt();

		System.out.print("Tempo trabalado:");
		int tempo = in.nextInt();
		
		calculaAposentadoria(idade,tempo);
		
		 }		 
		 
	public static void calculaAposentadoria (int idade, int tempo){
		if (((idade>= 65)||(tempo>=30))||((idade>= 60) && (tempo>= 25))){
			System.out.println("Requer aposentadoria");
		} else { 
			System.out.println("Não requer aposentadoria");
		}
	}
}


   

