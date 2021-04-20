/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amanciorhea.javacollectionsframework;

import java.util.ArrayList;

/**
 *
 * @author 2ndyrGroupA
 */
public class Number3 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(8);
        numbers.add(23);
        numbers.add(91);
        numbers.add(6);
        numbers.add(1);
        minToFront(numbers);
    }
    public static void minToFront(ArrayList<Integer> numbers) {
    int minIndex = 0;
    
    for (int i = 0; i < numbers.size(); i++) {
        if (numbers.get(minIndex) > numbers.get(i)) {
            minIndex = i;
        }
    }
    
    int minValue = numbers.remove(minIndex);
    numbers.add(0, minValue);
    System.out.println(numbers);
}
}
