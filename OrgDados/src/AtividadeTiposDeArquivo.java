import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AtividadeTiposDeArquivo {
    public static void main(String[] args) throws IOException {
        Arquivo arquivo = new Arquivo();
        Generator generator = new Generator();
        List<Pessoa> listaPessoa = new ArrayList<>();
        for (int i = 0; i < 500000 ; i++){
            listaPessoa.add(generator.geraPessoa());
        }
        long iniciotxt = System.currentTimeMillis();
        arquivo.gravaArquivo(listaPessoa);
        long fimtxt =  System.currentTimeMillis();
        System.out.println("Tempo execução de gravação arquivo txt:\n");
        System.out.println(new SimpleDateFormat("SS").format(new Date(fimtxt-iniciotxt)));
        long iniciobinario =  System.currentTimeMillis();
        arquivo.gravaArquivoBinario(listaPessoa);
        long fimbinario = System.currentTimeMillis();
        System.out.println("Tempo execução de gravação arquivo binario:\n");
        System.out.println(new SimpleDateFormat("SS").format(new Date(fimbinario-iniciobinario)));
    }
}
