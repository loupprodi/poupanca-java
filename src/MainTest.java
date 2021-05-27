
public class MainTest {

	public static void main(String[] args) {
		
		Conta c1 = new Conta(1000);
		System.out.println(c1.getSaldo());
		c1.Depositar(500);
		System.out.println(c1.getSaldo());
		c1.Sacar(3000);
		System.out.println(c1.getSaldo());
		System.out.println();

		
		Poupanca p1 = new Poupanca(-100, 20);
		System.out.println(p1.getSaldo());
		System.out.println();
		
		
		Poupanca p2 = new Poupanca(1000, 10);
		System.out.println(p2.getSaldo());
		p2.rendimento();
		System.out.println("O rendimento no aniversario da poupança foi de "+p2.getSaldo());
		
		
		
		
		
		
		
	}

}
