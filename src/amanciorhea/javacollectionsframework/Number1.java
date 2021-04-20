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
public class Number1 {

    public static void main(String[] args) {
        sortColors();
    }
    public static void sortColors(){
        
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
       
       System.out.println("List of Colors before Sorting: "+ colors);
       
       Collections.sort(colors);
       
       System.out.println("List of Colors after Sorting: "+ colors);
    } 
}
