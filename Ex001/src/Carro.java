
public class Carro{
    private String modelo;
    private Double preco;
    private String placa;

    public Carro() {

    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String dados) {
        this.placa = dados;
    }

    public Carro(String modelo, Double preco, String dados) {
        this.modelo = modelo;
        this.preco = preco;
        this.placa = dados;
    }
}