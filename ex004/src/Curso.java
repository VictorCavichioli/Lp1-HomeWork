public class Curso {
    String titulo;
    String sala;
    String areaConhecimento;


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getAreaConhecimento() {
        return areaConhecimento;
    }

    public void setAreaConhecimento(String areaConhecimento) {
        this.areaConhecimento = areaConhecimento;
    }

    public Curso(String titulo, String sala, String areaConhecimento) {
        super();
        this.titulo = titulo;
        this.sala = sala;
        this.areaConhecimento = areaConhecimento;
    }

    @Override
    public String toString() {
        return "Curso: " + titulo + ", Sala = " + sala + ", Área=" + areaConhecimento;
    }
}
