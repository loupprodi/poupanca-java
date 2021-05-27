
public class Poupanca extends Conta {
	
	private int diaRendimento;

	Poupanca(double saldoInicial, int diaRendimento) {
		super(saldoInicial);
		this.setDiaRendimento(diaRendimento);
		
		if(saldoInicial<0) {
			System.out.println("O saldo não pode ser negativo!");
			saldoInicial=0;
		} else {
			saldo+=saldoInicial;
			System.out.println("O seu saldo é "+saldo);
		}
	}

	public int getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}
	
	
	void rendimento() {
		this.saldo= saldo*0.0005;
	}
	

}
