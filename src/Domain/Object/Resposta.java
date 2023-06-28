package Domain.Object;

public class Resposta {
    private int Id;
    private String Resposta;
    private int Pergunta;
    private boolean Certo;

    public Resposta(int id, String resposta, int pergunta, boolean certo) {
        Id = id;
        Resposta = resposta;
        Pergunta = pergunta;
        Certo = certo;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getResposta() {
        return Resposta;
    }

    public void setResposta(String resposta) {
        Resposta = resposta;
    }

    public int getPergunta() {
        return Pergunta;
    }

    public void setPergunta(int pergunta) {
        Pergunta = pergunta;
    }

    public boolean isCerto() {
        return Certo;
    }

    public void setCerto(boolean certo) {
        Certo = certo;
    }
}
