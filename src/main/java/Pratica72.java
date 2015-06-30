
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import utfpr.ct.dainf.if62c.pratica.Comparador;
import utfpr.ct.dainf.if62c.pratica.ContadorPalavras;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kiqdestro
 */
public class Pratica72 {
    
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        
         String Path;
         
         HashMap mapaPalavras;
         
         ArrayList Quantidades = new ArrayList();
         
         System.out.println("Digite o caminho do diretorio");
         Path = scanner.next();
         
         Set<Map.Entry<String, Integer>> entries;
         
         try{
            BufferedWriter Escritor = new BufferedWriter(new FileWriter(Path+".out"));
            
            ContadorPalavras Data = new ContadorPalavras(Path);
            
            mapaPalavras = Data.getPalavras();

            entries = mapaPalavras.entrySet();

            Quantidades.addAll(mapaPalavras.values());
            
            Collections.sort(Quantidades, new Comparator<Integer>() {

                @Override
                     public int compare(Integer o1, Integer o2) {
                         return  o2 - o1;
                 }
             
        });
         
         
        for (Object j: Quantidades) {
            for (Map.Entry<String, Integer> entry: entries) {
                    if(entry.getValue() == j) {
                        Escritor.write(entry.getKey() + "," + entry.getValue());
                        Escritor.newLine();
                        mapaPalavras.remove(entry.getKey());
                        break;
                    }
                }

            }
            Escritor.close();
         } catch(Exception e){
             System.out.println(e);
         }

         
    }
}
