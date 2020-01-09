package br.com.gft.model;

public class Carro extends Veiculo {

	public Carro(String _marca, String _modelo, String _placa, String _cor, float _km, boolean isLigado,
			int _litrosCombustivel, int _velocidade, Double _preco) {
		super(_marca, _modelo, _placa, _cor, _km, isLigado, _litrosCombustivel, _velocidade, _preco);				
	}
	
	public void abastecer(int qtde) {
		System.out.println("O carro agora tem " + qtde + " litros de combustivel");
		
		
	}
	
	public void acelerar() {

	}

}
