
public class Main {

	public static void main(String[] args) {
		Cliente Manoelly = new Cliente();
		Manoelly.setNome("Manoelly");
		
		Conta cc = new ContaCorrente(Manoelly);
		
		Conta cp = new ContaPoupança(Manoelly);

		Conta cu = new ContaUniversitaria(Manoelly);
	
		cc.depositar(100);
		cc.imprimirExtrato();
		
		cp.depositar(100);
		cp.transferir(50, cu);
		cp.imprimirExtrato();
		
		cu.depositar(50);
		cu.sacar(50);
		cu.imprimirExtrato();
	}

}
