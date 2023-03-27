import java.util.Scanner;

public class CalculadoraJR {
	public static void main(String[]args) {
		Scanner ler  = new Scanner(System.in);
			   
		int x = 0;
		int num1, num2,Resultado ;
	    num1 = num2 = Resultado = 0;
	  do {  
	    System.out.println("digite opcao1 para soma");
		System.out.println("digite opcao2 para subrair");
	    System.out.println("digite opcao3 para mult");
		System.out.println("digite opcao4 para divir");
		
		System.out.println("digite umas das opçoes acima:");
		x = ler.nextInt();
		   
		 if(x!=0) {  
			
	      System.out.println("digite o peimeiro numero");
		  num1 =ler.nextInt();
		  System.out.println("digite o peimeiro numero");
		  num2 = ler.nextInt();
			  
	      if(x == 1) {
		     Resultado = num1 + num2;
		 }else {
			 if(x == 2) {
			    Resultado = num1 - num2;
			}else { 
				 if( x == 3) {  
					Resultado = num1 * num2;
			       }else {
			          if(x == 4) {
			             Resultado = num1 / num2;
			        	}
			         }
				  }
			   }
			  System.out.println("resultado é: "+Resultado);
		    }
		 }while(x!=0);
	   }
	}

