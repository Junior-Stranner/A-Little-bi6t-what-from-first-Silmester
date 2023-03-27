import java.util.Scanner;

public class FuncionarioJR {
	 public static void main(String[]args) {
		  Scanner ler = new Scanner(System.in);
		  
		  double[] salF = new double[3];
		  double media = 0;
		  int c;
		  double salfmenor = 0;
		  int salfmaior = 0;
	  
		  for (  c = 0; c <= 2; c++) {
				System.out.println("digite salario dos funcionaios");
				salF[c] = ler.nextDouble(); 
				
				media =media + salF[c]/3;	 
		  }	 
		  for(c = 0; c<=2; c++) {
			   if (salF[c]<media) {
				    salfmenor++;
			}
	     }
		  for (c = 0; c<=2; c++) {
				if (salF[c]>media) {
					salfmaior++;
				}
			}
			System.out.println("digite todos os sal: "+salF[0]+"..."+salF[2]);
			System.out.println("media do salario é: "+media);
			System.out.println("func q recebe acima da media: "+salfmaior);
			System.out.println("func q recebe abaixo da media: "+salfmenor);
	   }
	}
  

