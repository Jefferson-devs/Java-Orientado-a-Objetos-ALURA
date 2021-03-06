package bytebank;

public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoJefferson = new Conta();
		contaDoJefferson.saldo = 100;
		contaDoJefferson.deposita(50);
		System.out.println(contaDoJefferson.saldo);
		
		boolean conseguiuRetirar = contaDoJefferson.saca(20);
		System.out.println(contaDoJefferson.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		boolean sucessoTransferencia =
				contaDaMarcela.transfere(3000, contaDoJefferson);
		
		if(sucessoTransferencia) {
			System.out.println("transferencia com sucesso");
		} else {
			System.out.println("faltou dinheiro");
		}
		System.out.println(contaDaMarcela.saldo);
		System.out.println(contaDoJefferson.saldo);
		
		contaDoJefferson.titular = "Jefferson Soares";
				System.out.println(contaDoJefferson.titular);
	
	}
}
