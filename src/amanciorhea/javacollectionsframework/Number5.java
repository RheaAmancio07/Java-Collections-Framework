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
public class Number5 {
    public static void main(String[] args) {
        System.out.println("FOR LOOP and FOREACH LOOP \n"); 
        
        System.out.println("FOR LOOPS: \n");
        System.out.println("FOR LOOPS DEFINITION: ");
        System.out.println("---> For loops are appropriate loops when you know exactly how many times iteration you wants in statements within the loop."); 
        System.out.println("---> For loop iterates a statement or a block of statements repeatedly until a specified expression evaluates to false.");
        System.out.println("---> In case of for the variable of the loop is always be int only.");
        System.out.println("---> The For Loop executes the statement or block of statements repeatedly until specified expression evaluates to false. \n");
        
        System.out.println("FOR LOOPS ADVANTAGES: ");
        System.out.println("---> It works because it increases the abstraction level.Instead of having to express the low-level details of how to loop around a list or array (with an index or iterator),\n "
                + "The developer simply states that they want to loop and the language takes care of the rest. \n However, all the benefit is lost as soon as the developer needs to access the index or to remove an item.");
        System.out.println("--->The advantage to a for loop is we know exactly how many times the loop will execute before the loop starts.\n");
        System.out.println("FOR LOOPS DISADVANTAGES: ");
        System.out.println("---> It cannot traverse through the elements in reverse fashion. ");
        System.out.println("---> You cannot skip any element as the concept of index is not there.");
        System.out.println("---> You cannot choose to traverse to odd or even indexed elements too.\n");
    
        
        System.out.println("FOREACH LOOPS: ");
        System.out.println("--> For-each loop is used to iterate through the items in object collections, List generic collections or array list collections.");
        System.out.println("--> In case of Foreach the variable of the loop while be same as the type of values under the array.");
        System.out.println("---> The Foreach statement repeats a group of embedded statements for each element in an array or an object collection.\n");
        
        System.out.println("FOREACH LOOPS ADVANTAGES: ");
        System.out.println("---> The possibility of programming error is eliminated.");
        System.out.println("---> It makes the code more readable.");
        System.out.println("---> There is no use of index or rather a counter in this loop.\n");

        System.out.println("FOREACH LOOPS DISADVANTAGES: ");
        System.out.println("---> The problem with this type of writing is that you can't jump out of the forEach loop midway, and the break command can't be returned from the closure function with the return statement.");
        System.out.println("---> It cannot traverse through the elements in reverse fashion.");
        System.out.println("---> You cannot skip any element as the concept of index is not there.");
        System.out.println("---> You cannot choose to traverse to odd or even indexed elements too.");
        


    }
}
