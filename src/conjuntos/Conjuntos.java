/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conjuntos;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.*;



/**
 *
 * @author jse
 */
public class Conjuntos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadena1="1,2,3,4";
        String cadena2="2,4,6,8";
        String[] a1=cadena1.split(",");
        String[] a2=cadena2.split(",");
        
        List<String> arreglo = new ArrayList<String>();
        List<String> arreglo2 = new ArrayList<String>();
        
        arreglo=Lists.newArrayList(a1);
         arreglo2=Lists.newArrayList(a2);
        
    Set<String> setA = new HashSet<String>(arreglo);

    
   
 Set<String> setB = new HashSet<String>(arreglo2);

 
Set<String> unionSet = Sets.union(setA, setB);
   
        System.out.println("result: "+unionSet.toString());
    }


}
