/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amanciorhea.javacollectionsframework;
import java.util.*;  
import java.util.HashMap;
import java.util.Map.Entry;
/**
 *
 * @author 2ndyrGroupA
 */
public class Number8 {
    public static void main(String[] args) {
        counts();
    }
    
    public static void counts(){
        //Hashmap
        HashMap<String, String> words = new HashMap<>();
        words.put("concordia1", "Value given");
        words.put("acconcordia", "Test");
        words.put("condensada", "Sweet");
        words.put("concordiacondensad", "testing");
        words.put("concordiaamancio", "yhang");
        words.put("acconcordia", "pink");
        words.put("concordiaching", "shais");
        //display keys in a map 
        System.out.println("HashMap: " + words);

        //iniatializeed a variable with a value to be searched
        String value = "concordia";
        //counter for the occurences of the value
        int counter = 0;
        
        // iterate each entry of hashmap
        for(Entry<String, String> newWord: words.entrySet()) {
          if(newWord.getKey().substring(0,9).contains(value)) {
              counter++;
          }
        }
        //display the times of the value in the hashmap
        System.out.println("The number of key " + value + " is " + counter);
    }
}

