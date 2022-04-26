import java.io.Serializable;

public class Pessoa implements Serializable {
    int chave;
    String nome;

    public String getNome() {
        return nome;
    }

    public int getChave() {
        return chave;
    }

    public void setChave(int chave) {
        this.chave = chave;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return  chave +
                "-" + nome;
    }
}
