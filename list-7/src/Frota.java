import java.util.ArrayList;
import java.util.List;

public class Frota {
    private String nome;
    private String tipo;
    private String responsavel;
    private List<Carro> carros;
    private List<Caminhao> caminhoes;

    public Frota(String nome, String tipo, String responsavel) {
        this.nome = nome;
        this.tipo = tipo;
        this.responsavel = responsavel;
        this.carros = new ArrayList<>();
        this.caminhoes = new ArrayList<>();
    }

    public void adicionarCarro(Carro carro) {
        carros.add(carro);
    }

    public void adicionarCaminhao(Caminhao caminhao) {
        caminhoes.add(caminhao);
    }

    public List<Carro> getCarros() {
        return carros;
    }

    public List<Caminhao> getCaminhoes() {
        return caminhoes;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public String getResponsavel() {
        return responsavel;
    }
}
