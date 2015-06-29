/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.StringTokenizer;

/**
 *
 * @author kiqdestro
 */
public class ContadorPalavras {

    BufferedReader Leitor;

    public ContadorPalavras(String Path) throws FileNotFoundException {
        Leitor = new BufferedReader(new FileReader(Path));
    }

    public HashMap getPalavras() throws IOException {
        HashMap<String, Integer> mapaPalavras = new HashMap<>();
        String linha = Leitor.readLine();
        
        while (linha != null) {

            StringTokenizer LinhaTokenizer = new StringTokenizer(linha, "\t \n \r . , ;");
            
            while(LinhaTokenizer.hasMoreTokens()){
                String Palavra = LinhaTokenizer.nextToken();
                
                if(mapaPalavras.containsKey(Palavra)){
                    int qtd = mapaPalavras.get(Palavra) + 1;
                    mapaPalavras.remove(Palavra);
                    mapaPalavras.put(Palavra, qtd);
                }
                
                else
                    mapaPalavras.put(Palavra, 1);
                
                
            }
        linha = Leitor.readLine();
        
        }
        Leitor.close();
        return mapaPalavras;
    }
}
