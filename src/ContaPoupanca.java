
public class ContaPoupanca extends Conta {
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}
	
	public void imprimirExtrato() {
		System.out.println("===	Extrato Conta Poupan�a ===");
		System.out.println(String.format("Titular: %s",this.cliente.getNome()));
		System.out.println(String.format("Agencia:%d", super.agencia));
		System.out.println(String.format("Numero:%d", super.numero));
		System.out.println(String.format("Saldo:%.2f", super.saldo));
	}
	

}
