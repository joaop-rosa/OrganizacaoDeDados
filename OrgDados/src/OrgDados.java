import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrgDados {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Arquivo arq = new Arquivo();
        int chave;
        String nome;
        List<Pessoa> listaPessoa = new ArrayList<>();
        try {
            listaPessoa = arq.lerArquivo("arquivo.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            //Criar arquivo
        }

        System.out.println("Arquivo carregado: \n" + listaPessoa);
        System.out.println("Deseja inserir mais registros? sim=1 | nao=0\n");
        int resp = ler.nextInt();
        while (resp == 1) {
            Pessoa pessoa = new Pessoa();
            System.out.println("Informe uma chave:");
            chave = ler.nextInt();
            System.out.println("Informe um nome:\n");
            nome = ler.next();
            pessoa.setChave(chave);
            pessoa.setNome(nome);
            listaPessoa.add(pessoa);
            System.out.println("Deseja inserir mais registros? sim=1 | nao=0\n");
            resp = ler.nextInt();
        }

        Sort sort = new Sort();
        sort.bubbleSort(listaPessoa);
        System.out.println(listaPessoa);

        try {
            arq.gravaArquivo(listaPessoa);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
