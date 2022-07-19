
public class Main {
	public static void main(String[] args) {
	Cliente Gabi = new Cliente();
	Gabi.setNome("Gabi");
	
	Conta cc = new ContaCorrente(Gabi);
	Conta cp = new ContaPoupanca(Gabi);
	
	cc.depositar(1000);
	cp.depositar(500);

	cc.sacar(50);
	
	cc.imprimirExtrato();
	cp.imprimirExtrato();
	
	
		
		
	}
}
