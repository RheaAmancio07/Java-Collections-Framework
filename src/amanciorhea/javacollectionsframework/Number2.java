/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amanciorhea.javacollectionsframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 *
 * @author 2ndyrGroupA
 */
public class Number2 {
    public static void main(String[] args) {
        rearrangeColors();
    }
    
    public static void rearrangeColors(){
        List<String> colors = new ArrayList<String>();
        colors.add("Gray");
        colors.add("Skyblue");
        colors.add("Black");
        colors.add("White");
        colors.add("Ash Gray");
        colors.add("Pink");
        colors.add("Bluegreen");
        colors.add("Red");
        colors.add("Purple");
        colors.add("Orange");
  
        System.out.println("Original List of Colors : \n" + colors);
  
        Collections.shuffle(colors);
  
        System.out.println("\nShuffled List of Colors : \n" + colors);
    }
}
