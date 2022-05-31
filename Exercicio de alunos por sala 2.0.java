package Lista2;
import java.util.Scanner;
public class MediaDoFundamental {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		
		int q1=0,q2=0,q3=0,q4=0,q5=0,q6=0;
		int qq,soma=0,med;
		int a1=0,a2=0,a3=0,a4=0,a5=0,a6=0;
		
		System.out.printf("\nInforme quantos alunos tem a primeira sala :");
		q1=sc.nextInt();
		System.out.printf("\nInforme quantos alunos tem a segunda sala:");
		q2=sc.nextInt();
		System.out.printf("\nInforme quantos alunos tem a terceira sala :");
		q3=sc.nextInt();
		System.out.printf("\nInforme quantos alunos tem a quarta sala :");
		q4=sc.nextInt();
		System.out.printf("\nInforme quantos alunos tem a quinta sala :");
		q5=sc.nextInt();
		System.out.printf("\nInforme quantos alunos tem a sexta sala :");
		q6=sc.nextInt();
		
		int Q[]= {q1,q2,q3,q4,q5,q6};
		
		qq=Q.length;
		
		for (int b=0;b<qq;b++) {
			soma=soma+Q[b];
			System.out.printf("\nSoma do momento e "+(b+1)+",total de alunos: "+soma);
		}
		
		med=soma/qq;
		
		System.out.print("\nValor medio de aluno por sala é "+med+".");
		
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
