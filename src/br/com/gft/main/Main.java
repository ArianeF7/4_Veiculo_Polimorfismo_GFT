package br.com.gft.main;

import br.com.gft.model.Avi�o;
import br.com.gft.model.Caminh�o;
import br.com.gft.model.Carro;

public class Main {
	public static void main(String[] args) {
		Carro c = new Carro ("Fiat", "Palio", "FIU1254", "Preto", 52525f, true, 35246, 542, 2542658.0);
		Avi�o a = new Avi�o ("aFiat", "aPalio", "aFIU1254", "aPreto", 52525f, true, 35246, 542, 2542658.0);
		Caminh�o ca = new Caminh�o ("Mercedes", "iveco", "CFIU1254", "Vermelho", 52525f, true, 35246, 542, 2542658.0);
		
		c.abastecer(200);
		a.abastecer("254");
		ca.abastecer(500f);
		
	}

}

