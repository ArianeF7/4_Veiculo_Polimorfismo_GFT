package br.com.gft.model;

public class Veiculo {

	public Veiculo(String _marca, String _modelo, String _placa, String _cor, float _km, boolean isLigado,
			int _litrosCombustivel, int _velocidade, Double _preco) {
		this.marca = _marca;
		this.modelo = _modelo;
		this.placa = _placa;
		this.cor = _cor;
		this.km = _km;
		this.isLigado = isLigado;
		this.litrosCombustivel = _litrosCombustivel;
		this.velocidade = _velocidade;
		this.preco = _preco;
	}

	private String marca, modelo, placa, cor;
	private float km;
	private boolean isLigado;
	private int litrosCombustivel, velocidade;
	private Double preco;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getKm() {
		return km;
	}

	public void setKm(float km) {
		this.km = km;
	}

	public boolean isLigado() {
		return isLigado;
	}

	public void setLigado(boolean isLigado) {
		this.isLigado = isLigado;
	}

	public int getLitrosCombustivel() {
		return litrosCombustivel;
	}

	public void setLitrosCombustivel(int litrosCombustivel) {
		this.litrosCombustivel = litrosCombustivel;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public void abastecer(int qtde) {

	}
		
	public void acelerar() {

	}

}
