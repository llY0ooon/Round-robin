
public class MemoryMgmt extends Process {
	
	public int pfila, quantum=2 , c=1, contas[] = new int[10],r=1;
	
	void recebe() {
		System.out.println("pfila recebeu"+pfila);
		System.out.println("Quantum recebeu"+quantum);
		while(c<=pfila)
		{
		System.out.println("C recebeu"+c);
		}
		while(c<=pfila)
		{
		System.out.println("R recebeu"+r);
		}
		while(c<=pfila)
		{
		System.out.println("Contas[] recebeu"+contas[c]);
		c++;
		}
		System.out.printf("\n Exe usou pfila = %d \n",(pfila));
	    System.out.printf("\n Exe usou quantum = %d \n",(quantum));
	    while(c<=pfila)
	    {
	    System.out.printf("\n Exe usou c = %d \n",(c));
	    }
	    while(c<=pfila)
	    {
	    	System.out.printf("\n Exe usou contas[r] = %d \n",(contas[c]));
	    }
	    while(c<=pfila)
		{
	    	System.out.printf("\n Exe usou r = %d \n",(r));
		}
	}
	
}

