
// the import keyword is used to load in additional Java PACKAGE code for our programs
// in this case, we are loading in the standard "util" package for the Scanner class
import java.util.*; // anything after the // is a comment


// we use the class keyword to denote an OBJECT
// an object is simply a collection of PROPERTIES (variables)
// and METHODS (functions) that relate to each other
public class Project2StudentGrades{

  // all of our Java programs will have a "main method"
  // this is the ENTRY POINT of our program
  // the keywords prior to main:
  // - public: denotes the access permissions for other objects
  // - static: denotes procedural style code (i.e., not Object Oriented)
  // - void: the return type of the method (in this case NOTHING)
  public static void main(String[] args) {


    // initialize a variable of type OBJECT Scanner and call its CONSTRUCTOR with the System.in parameter)
    int scores[] = new int[6];
    int i;
    float total=0, avg;
    Scanner scanner = new Scanner(System.in);

  for(i=0; i<6; i++) {
    System.out.print("Enter the students assignment scores "+(i+1)+":");
    scores[i] = scanner.nextInt();
    total = total + scores[i];
  }
  scanner.close();

  avg=total/6;
  System.out.print("The students final grade is a/an: ");
  if(avg>=91)
  {
    System.out.print("A");
  }
  else if(avg>=82 && avg<91)
  {
    System.out.print("B");
  }
  else if(avg>=70 && avg<82)
  {
    System.out.print("C");
  }
  else if(avg>=60 && avg<69)
  {
    System.out.print("D");
  }
  else if(avg<=59)
  {
    System.out.print("F");
  }
      if(avg>=60)
      {
      System.out.print("\n Congratulations you passed!");
      }
      else if(avg<=59)
      {
      System.out.print("\n Sorry you failed!");
      }
    }
  }