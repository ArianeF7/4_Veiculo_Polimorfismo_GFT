package br.com.gft.model;

public class Caminh�o extends Veiculo{

	public Caminh�o(String _marca, String _modelo, String _placa, String _cor, float _km, boolean isLigado,
			int _litrosCombustivel, int _velocidade, Double _preco) {
		super(_marca, _modelo, _placa, _cor, _km, isLigado, _litrosCombustivel, _velocidade, _preco);
		
	}
	
	public void abastecer(float qtde) {
		int qtdeLitrosFloat1 = Math.round(qtde);
		int qtdeLitrosFloat = (int)qtde;
		
		System.out.println("Abasteceu o Caminh�o, agora a quantidade de litros �: " + qtdeLitrosFloat1);
		System.out.println("Abasteceu o Caminh�o, agora a quantidade de litros �: " + qtdeLitrosFloat);
	}
	
	public void acelerar() {

	}

}
