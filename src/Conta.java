
public class Conta {
	
	protected double saldo;
	
	Conta(double saldoInicial){
		if(saldoInicial<0) {
			System.out.println("O saldo eh negativo! ");
			saldo=saldoInicial;}
		else {
			System.out.println("O saldo eh positivo");
			saldo = saldoInicial;}
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
			this.saldo = saldo;
	}	
	
	
	void Depositar( double valor) {
		this.saldo+=valor;
	}
	
	void Sacar( double valor) {
		this.saldo-=valor;
	}
	

}
