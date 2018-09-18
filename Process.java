import java.util.Scanner;

public class Process {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		MemoryMgmt m = new MemoryMgmt();
		FileMgmt f = new FileMgmt();
		
		System.out.println("Digite 1 para rodar com valores salvos ou 0 para inserir os valores:");
		m.r = leia.nextInt();
		if(m.r == 1) {
			f.ProcessoPronto();
		}
		else {
		
		System.out.println("Digite a quantidade de pessoas na fila:");
		m.pfila = leia.nextInt();
		for(m.c=1; m.c<=m.pfila;m.c++)
		{
		System.out.println("Digite a quantidade de contas da pessoa "+m.c);
		m.contas[m.c] = leia.nextInt();
		}
		
		for(m.c=1;m.contas[m.c] >= m.quantum;m.c++)
		{   
			while(m.contas[m.c]>0) {
			m.contas[m.c] = m.contas[m.c] - m.quantum;
			if(m.contas[m.c]==-1) 
			m.contas[m.c]= (m.contas[m.c] * -1)-1;
		System.out.printf("\nA pessoa %d ainda tem %d conta(s) a pagar\n",(m.c),(m.contas[m.c]));
if(m.contas[m.c]>0)
			{
				m.c++;
			}
			if(m.c>m.pfila)
			{
				m.c = 1;
			}
			if(m.contas[m.c] == 0 )
			{
				m.c++;
			}		
			}
		
		}
		}
				
		
		
	}
	
}
