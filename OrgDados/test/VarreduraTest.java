import org.junit.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class VarreduraTest {
    @Test
    public void testeVarreduraSequencial(){
        Arquivo arq = new Arquivo();
        List<Pessoa> listaPessoa = new ArrayList<>();
        try {
            listaPessoa = arq.lerArquivo("arquivo.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            //Criar arquivo
        }
        Varredura varredura = new Varredura();
        //Busca por chave
        int posicaoDoValor = varredura.buscaSequencial(listaPessoa,5);
        System.out.println("Busca por chave: " +posicaoDoValor);
        //Busca por nome
        posicaoDoValor = varredura.buscaSequencial(listaPessoa,"Sabrina");
        System.out.println("Busca por nome: "+posicaoDoValor);
    }
    @Test
    public void testeVarreduraBinaria(){
        Arquivo arq = new Arquivo();
        List<Pessoa> listaPessoa = new ArrayList<>();
        try {
            listaPessoa = arq.lerArquivo("arquivo.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            //Criar arquivo
        }
        Varredura varredura = new Varredura();
        //Busca por chave
        int posicaoDoValor = varredura.buscaBinaria(listaPessoa,5);
        System.out.println("Posição do valor buscado: " +posicaoDoValor);

    }
    @Test
    public void testeVarreduraHashing(){

    }
}
