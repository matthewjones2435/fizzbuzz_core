package edu.cnm.deepdive;

/**
 * Main method that runs methods of and prints results from the {@link FizzBuzz} class.
 */
public class Main {

  private Main() {}
  /**
   * Computes and displays values as fizz or buzz corresponding to their input values 1&ndash;100
   * @param args Command line arguments
   */
  public static void main(String[] args) {
    for(int i = 1; i <= 100; i++) {
      System.out.println (FizzBuzz.fizzBuzzValue(i));

    }

  }

}
