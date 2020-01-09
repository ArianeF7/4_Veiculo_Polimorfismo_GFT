package br.com.gft.main;

import br.com.gft.model.Avião;
import br.com.gft.model.Caminhão;
import br.com.gft.model.Carro;

public class Main {
	public static void main(String[] args) {
		Carro c = new Carro ("Fiat", "Palio", "FIU1254", "Preto", 52525f, true, 35246, 542, 2542658.0);
		Avião a = new Avião ("aFiat", "aPalio", "aFIU1254", "aPreto", 52525f, true, 35246, 542, 2542658.0);
		Caminhão ca = new Caminhão ("Mercedes", "iveco", "CFIU1254", "Vermelho", 52525f, true, 35246, 542, 2542658.0);
		
		c.abastecer(200);
		a.abastecer("254");
		ca.abastecer(500f);
		
	}

}

