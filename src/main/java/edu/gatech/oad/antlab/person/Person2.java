package edu.gatech.oad.antlab.person;
import java.util.*;

/**
 *  A simple class for person 2
 *  returns their name and a
 *  modified string
 *
 * @author Ryan Soedjak
 * @version 1.1
 */
public class Person2 {

    /** Holds the persons real name */
    private String name;
	 	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
	 public Person2(String pname) {
	   name = "Ryan Soedjak";
	 }
	/**
	 * This method should take the string
	 * input and return its characters in
	 * random order.
	 * given "gtg123b" it should return
	 * something like "g3tb1g2".
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 */
	private String calc(String input) {
	  //Person 2 put your implementation here
		List<Character> ch = new ArrayList<Character>();
        for (char c:input.toCharArray()) {
            ch.add(c);
        }
        StringBuilder ans = new StringBuilder(input.length());
        while (ch.size() > 0) {
            int r = (int)(Math.random()*ch.size());
            ans.append(ch.remove(r));
        }
	  return ans.toString();
	}
	/**
	 * Return a string rep of this object
	 * that varies with an input string
	 *
	 * @param input the varying string
	 * @return the string representing the
	 *         object
	 */
	public String toString(String input) {
	  return name + calc(input);
	}
}
