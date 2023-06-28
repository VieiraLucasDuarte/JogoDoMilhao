package Domain.Object;

public class Pergunta {
    private int Id;
    private String Texto;
    private boolean Perguntado;

    public Pergunta(int id, String texto, boolean perguntado) {
        Id = id;
        Texto = texto;
        Perguntado = perguntado;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getTexto() {
        return Texto;
    }

    public void setTexto(String texto) {
        Texto = texto;
    }

    public boolean isPerguntado() {
        return Perguntado;
    }

    public void setPerguntado(boolean perguntado) {
        Perguntado = perguntado;
    }
}
