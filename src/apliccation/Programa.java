package apliccation;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		conta minhaConta = new conta();
		conta meuSonho = new conta();
		
		minhaConta.titular = "Vitor_Lima";
		minhaConta.numero = 44995;
		minhaConta.saldo = 200;
		
		meuSonho.titular = "VITOR";
		meuSonho.numero = 44994;
		meuSonho.saldo = 2078900;		
		
		System.out.println("Saldo atual: "  + minhaConta.saldo);
		
		minhaConta.sacar(240);

		System.out.println("Saldo atualizado: " + minhaConta.saldo);

		minhaConta.depositar(600);
		
		System.out.println("Saldo depois do depósito: " + minhaConta.saldo);
	}

}
