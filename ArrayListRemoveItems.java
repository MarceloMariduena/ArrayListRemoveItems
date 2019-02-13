// @authors: Dr. Adrian Heinz, Marcelo Mariduena

import java.util.*;

public class ArrayListRemoveItems {
  public static void main(String[] args){

    // Scanner object for inputs
    Scanner input = new Scanner(System.in);

    // ArrayList objects for storing inputs
    ArrayList<Integer> alSource = new ArrayList<Integer>();
    ArrayList<Integer> alElements = new ArrayList<Integer>();
    ArrayList<Integer> alResult = new ArrayList<Integer>();

    // Declare the counter
    int num = 0;
    
    // User can enter as many inputs. Spaces don't matter. Integers will be put into the ArrayList alSource
    System.out.print("Enter all source elements and '-1' or a negative integer to stop: ");
    while (num > -1) {
      num = input.nextInt();
      if (num > -1) {
        alSource.add(num);
      }
    }
    
    // Reset the counter
    num = 0;

    // User can enter as many inputs. Spaces don't matter. Integers will be put into the ArrayList alElemets
    System.out.println("Enter all elements to be removed and '-1' or a negative integer to stop: ");
    while (num > -1) {
      num = input.nextInt();
      if (num > -1) {
        alElements.add(num);
      }
    }
    
    // The result of the called method removeItems on the two lists alSource and alElements is assigned to the ArrayList alResult
    alResult = removeItems(alSource, alElements);

    // Output
    System.out.println("-------- RESULT ---------");
    System.out.println(alResult.toString());
  }
  
  // This method takes in two ArrayList objects, removes elements and returns unique elements
  public static ArrayList<Integer> removeItems(ArrayList<Integer> alSource, ArrayList<Integer> alElements) {
    ArrayList<Integer> alResult = new ArrayList<Integer>();
    
    // Removes desired integers
    for (int i : alSource){
      if (alElements.contains(i)){
        continue;
      }
      else {
        alResult.add(i);
      }
    }
    
    ArrayList<Integer> noRepeats = new ArrayList<Integer>();
    
    // Removes repeats
    for (int i : alResult) {
      if (noRepeats.contains(i)){
        continue;
      }
      else {
        noRepeats.add(i);
      }
    }
    
    return noRepeats;
  }
}