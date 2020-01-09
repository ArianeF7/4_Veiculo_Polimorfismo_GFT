package br.com.gft.model;

public class Caminhão extends Veiculo{

	public Caminhão(String _marca, String _modelo, String _placa, String _cor, float _km, boolean isLigado,
			int _litrosCombustivel, int _velocidade, Double _preco) {
		super(_marca, _modelo, _placa, _cor, _km, isLigado, _litrosCombustivel, _velocidade, _preco);
		
	}
	
	public void abastecer(float qtde) {
		int qtdeLitrosFloat1 = Math.round(qtde);
		int qtdeLitrosFloat = (int)qtde;
		
		System.out.println("Abasteceu o Caminhão, agora a quantidade de litros é: " + qtdeLitrosFloat1);
		System.out.println("Abasteceu o Caminhão, agora a quantidade de litros é: " + qtdeLitrosFloat);
	}
	
	public void acelerar() {

	}

}
