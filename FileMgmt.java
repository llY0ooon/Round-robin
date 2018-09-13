
public class FileMgmt extends Process {

int Quantum = 2, numpessoas = 4, conta1 = 2, conta2 = 3, conta3 = 4, conta4 = 5, result;
	
	FileMgmt(){
		
	}
	
	double ProcessoPronto ()
	{
		
		System.out.printf("Tem %d pessoas na fila",(numpessoas));
		
		result = conta1 - 2;
		System.out.printf("\nA pessoa 1 paga %d contas, restam %d contas \n",(Quantum),(result));
		
		result = conta2 - 2;
		System.out.printf("\n A pessoa 2 paga %d contas, restam %d contas \n",(Quantum),(result));
		
		result = conta3 - 2;
		System.out.printf("\n A pessoa 3 paga %d contas, restam %d contas \n",(Quantum),(result));
		
		result = conta4 - 2;
		System.out.printf("\n A pessoa 4 paga %d contas, restam %d contas \n",(Quantum),(result));
		return result;
		}
	
}
