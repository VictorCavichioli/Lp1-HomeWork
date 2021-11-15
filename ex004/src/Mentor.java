public class Mentor {
    String nome;
    String id;
    String areaEspecializacao;


    @Override
    public String toString() {
        return nome + ", id=" + id + ", Área=" + areaEspecializacao;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }


    public String getAreaEspecializacao() {
        return areaEspecializacao;
    }


    public void setAreaEspecializacao(String areaEspecializacao) {
        this.areaEspecializacao = areaEspecializacao;
    }


    public Mentor(String nome, String id, String areaEspecializacao) {
        super();
        this.nome = nome;
        this.id = id;
        this.areaEspecializacao = areaEspecializacao;
    }
}
