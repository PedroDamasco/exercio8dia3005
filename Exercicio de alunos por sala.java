package Lista2;
import java.util.Scanner;
public class MediaDoFundamental {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
				// Scanner basico
				Scanner sc = new Scanner(System.in);
				// Criando vetor, com valores determinado pelo exercicio.
				int Q[]= {35,4,22,20,36,30};
				// criando os dado.
				int qq,soma=0,med;
				
				
				// Length para informar o tamanho do vetor.
				qq=Q.length;
				
				
				// Criando o For ( looping ).
				for (int s=0;s<qq;s++) {
					soma=soma+Q[s];
					// Expondo os resultados.
					System.out.printf("\nSoma do momento e "+(s+1)+",total de alunos: "+soma);
				}
				// Calculando a Media.
				med=soma/qq;
				
				// Expondo a media de alunos. 
				System.out.print("\nValor medio de aluno por sala é "+med+".");
				
				// Criando condicao de caso tenha media acima da media expor a sala e o numero de alunos.
				if (Q[0] >=med)
					System.out.print(" \nSala 1 maior que a media com "+Q[0]);	
				
				if (Q[1] >=med)
					System.out.print(" \nSala 2 maior que a media com "+Q[1]);	
				
				if (Q[2] >=med)
					System.out.print(" \nSala 3 maior que a media com "+Q[2]);	
				
				if (Q[3] >=med)
					System.out.print(" \nSala 4 maior que a media com "+Q[3]);	
				
				if (Q[4] >=med)
					System.out.print(" \nSala 5 maior que a media com "+Q[4]);	
				
				if (Q[5] >=med)
					System.out.print(" \nSala 6 maior que a media com "+Q[5]);	
					
				
				
			}

		}
