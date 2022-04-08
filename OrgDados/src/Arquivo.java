import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Arquivo {
    FileWriter arq;
    String caminhoArquivo = "arquivo.txt";


    void gravaArquivo(List<Pessoa> listaPessoa)throws IOException{
        arq = new FileWriter(caminhoArquivo);
        PrintWriter gravarArq = new PrintWriter(arq);
        for (int i = 0 ; i<listaPessoa.size();i++){
            gravarArq.println(listaPessoa.get(i));
        }
        arq.close();
    }

    List<Pessoa> lerArquivo(String arquivo) throws FileNotFoundException {
        List<Pessoa> listaPessoa =new ArrayList<>();
        Scanner in = new Scanner(new FileReader(caminhoArquivo));
        while (in.hasNextLine()) {
            Pessoa pessoa = new Pessoa();
            String line = in.nextLine();
            String[] chaveNome = line.split("-");
            pessoa.setChave(Integer.parseInt(chaveNome[0]));
            pessoa.setNome(chaveNome[1]);
            listaPessoa.add(pessoa);
        }

        return listaPessoa;
    }
}
