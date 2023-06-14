public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.Saldo = 200;
		System.out.println(primeiraConta.Saldo);
		
		primeiraConta.Saldo += 100;
        System.out.println(primeiraConta.Saldo);
        
        Conta segundaConta = new Conta();
        segundaConta.Saldo = 50;
        
        System.out.println("primeira conta tem " + primeiraConta.Saldo);
        System.out.println("segunda conta tem " + segundaConta.Saldo);
        
        System.out.println(primeiraConta.Agencia);
        System.out.println(primeiraConta.Numero);
        
        System.out.println(segundaConta.Agencia);
        segundaConta.Agencia = 146;
        System.out.println("agora a segunda conta está na agencia " + segundaConta.Agencia);
	}
}
