package br.com.gft.model;

public class Avi�o extends Veiculo {

	public Avi�o(String _marca, String _modelo, String _placa, String _cor, float _km, boolean isLigado,
			int _litrosCombustivel, int _velocidade, Double _preco) {
		super(_marca, _modelo, _placa, _cor, _km, isLigado, _litrosCombustivel, _velocidade, _preco);
	}

	public void abastecer(String qtde) {
		
		int qtdeLitroString = Integer.parseInt(qtde);
		System.out.println("Abasteceu o Avi�o, agora o avi�o tem " + qtdeLitroString + " litros de combustivel");
	}
	
	public void acelerar() {

	}
}
