/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amanciorhea.javacollectionsframework;

/**
 *
 * @author 2ndyrGroupA
 */
import java.util.*;

public class Number6 {
    public static void main(String[] args) {
        compare();
    }
    public static void compare(){
        
        List<String> color1 = new ArrayList<>(Arrays.asList("Pink", "Gray", "Skyblue", "White"));
        List<String> color2 = new ArrayList<>(Arrays.asList("Black", "Skyblue", "Bluegreen", "Gray"));
        
        List<String> union = new ArrayList(color1);
        union.addAll(color2);
        
        List<String> common = new ArrayList(color1);
        common.retainAll(color2);
          
        List<String> unique = new ArrayList(union);
        unique.removeAll(common);
        
        System.out.println("First Set of Colors: " + color1);
        System.out.println("Second Set of Colors: " + color2);
        System.out.println("Common Colors of the Sets: " + common);
 }
}