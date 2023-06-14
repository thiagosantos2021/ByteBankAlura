public class Conta {
	double Saldo;
	int Agencia = 42;
	int Numero;
	String Titular;
	
	public void deposita(double valor) {
		this.Saldo += valor;
    }
	
	public boolean saca(double valor) {
		if (this.Saldo >= valor) {
			this.Saldo = this.Saldo - valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) { 
		if(this.Saldo >= valor) { 
            this.Saldo -= valor; 
            destino.deposita(valor);
            return true;
        } else {
            return false;
        }
	}
}
