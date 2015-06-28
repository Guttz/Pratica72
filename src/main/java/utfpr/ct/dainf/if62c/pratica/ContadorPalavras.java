/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;

/**
 *
 * @author kiqdestro
 */
public class ContadorPalavras {
   BufferedReader Reader;

    public ContadorPalavras(String Path) throws FileNotFoundException{
        Reader = new BufferedReader(new FileReader(Path));
    }   
    
    public HashMap getPalavras(){
        
        String  Linha = Reader.readLine();
        Reader
    }        
}
