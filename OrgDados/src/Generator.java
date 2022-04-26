import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Generator {
    public Pessoa geraPessoa(){
        ThreadLocalRandom gerador = ThreadLocalRandom.current();
        Random random = new Random();

        int tamanhoNome = gerador.nextInt(3, 10);

        char primeiraLetraNome = (char) gerador.nextInt(65, 90);


        StringBuilder nome = new StringBuilder().append(primeiraLetraNome);

        for (int i = 1; i < tamanhoNome; i++) {
            char letra = (char) gerador.nextInt(97, 122);
            nome.append(letra);
        }

        Pessoa pessoa = new Pessoa();
        pessoa.setChave(random.nextInt(1000000)+1);
        pessoa.setNome(String.valueOf(nome));


        return pessoa;
    }
}
