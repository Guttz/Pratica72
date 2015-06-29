/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

import java.util.Comparator;

/**
 *
 * @author kiqdestro
 */
public class Comparador implements Comparator<Integer> {
    
    public Comparador(){}

    public int compare(Integer o1, Integer o2) {
        return -(o1-o2);
    }
    
}
