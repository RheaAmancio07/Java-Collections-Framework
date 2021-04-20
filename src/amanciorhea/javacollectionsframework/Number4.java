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
public class Number4 {
    public static void main(String[] args) {
        System.out.println("Reasons to opt for isEmpty() over size:\n");
        
        System.out.println("-->Using an Optional instead of using null to indicate failure/no result has some advantages: \n"
                + "             It clearly communicates that \"failure\" is an option. \n"
                + "             The user of your method does not have to guess whether null might be returned.");
        System.out.println("--> it is more expressive (the code is easier to read and to maintain)");
        System.out.println("--> it is faster, in some cases by orders of magnitude.");
        System.out.println("--> All of these implement the “size” method by iterating trough the collection and because of this, calling size gets increasingly slower as the number of elements increase");
        System.out.println("--> null checking shows you whether there is an object generally.");
        System.out.println("--> isEmpty checking shows you whether the content of existing String object is empty.");
    }
}
