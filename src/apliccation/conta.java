package apliccation;

public class conta {
	
	int numero;
	String titular;
	double saldo;
	
	public void depositar (double quantidade) {
		
		this.saldo += quantidade;
	}

	boolean sacar(double quantidade) {

		if (this.saldo < quantidade) {
			System.out.println("Saque não foi realizado");
			return false;

		} else {

			this.saldo -= quantidade;
			System.out.println("Saque bem sucedido");
			return true;

		}
	}
	
}
