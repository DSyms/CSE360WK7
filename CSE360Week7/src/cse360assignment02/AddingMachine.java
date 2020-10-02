package cse360assignment02;

/**
 * This is David Syms's Week 7 submission for Dr. Gonzalez Sanchez's CSE 360 Class
 * Fall 2020 Tuesday 9 am
 * @author David Syms
 */

//David Syms
//Dr. Gonzalez Sanchez
//CSE 360 Tuesday 9am Fall 2020
//Work for Week 7, Assignment2
//GITHUB REPOSITORY LINK: https://github.com/DSyms/CSE360WK7


public class AddingMachine {
  private int total;
  private String runningString = "0"; //Initialized to 0
  
  /**
   * This is constructor for the adding machine. 
   * 
   */
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
  }
  
  /**
   * This returns total value thus far
   * @return total
   */
  public int getTotal () {
    return total;
  }
  
  /**
   * Function that adds parameter to total
   * @param value Value to be added to total
   */
  public void add (int value) {
	  total = total + value; //adds value to total
	  addToString(" + " + value); //adds value to running string 
  }

  
  /**
   * Function that subtracts parameter to total
   * @param value Value to be subtracted to total
   */
  public void subtract (int value) {
	  total = total - value; //subtracts value to total
	  addToString(" - " + value); //Adds value to running string
  }
  
  /**
   * Function that adds last operation to return string
   * @param value Value to be added to string
   */
  public void addToString(String value) {
	  runningString = runningString + value; //adds value to running string
  }

  /**
   * Function that returns string of operations performed thus far
   * @return operations string
   */
  public String toString () {
    return runningString;
  }

  /**
   *  instructions did not include what this method was used for
   */
  public void clear() {
  }
  
  
  /**
   * Main function used for testing, commented out for grading purposes.
   * 
   */
  /*public static void main(String args[]) {
	  AddingMachine myCalculator = new AddingMachine();
	  
	  myCalculator.add (4); 
	  myCalculator.subtract (2); 
	  myCalculator.add(5);
	  
	  System.out.println("Total: " + myCalculator.getTotal());
	  System.out.println("Running String: " + myCalculator.toString());
  }*/
  
  
}