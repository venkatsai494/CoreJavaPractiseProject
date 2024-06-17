package solution;

import java.util.*;

public class Example1 {

    //Sort the following list of Strings with the length of there values
    List<String> names = Arrays.asList("Venkat", "Sai", "Ratan", "Kumar", "Parpelli");



    public static void main(String[] args) {

        Comparator<String> comp = new Comparator<String>() { //The Comparator<String> is implemented as an anonymous inner class. This means that you are creating an instance of an unnamed class that implements the Comparator interface.
            @Override
            public int compare(String o1, String o2) {
                if(o1.length()>o2.length())//this would mean
                    return 1;
                else if(o1.length()<o2.length())
                    return -1;
                else
                    return 0;
                /*
1: The first object (o1) is greater than the second object (o2). This means o1 should come after o2 in the sorted order.
-1: The first object (o1) is less than the second object (o2). This means o1 should come before o2 in the sorted order.
0: The first object (o1) is equal to the second object (o2). This means their order is the same or unchanged.
                 */
            }
        };

        Comparator<String> comp1 = new Comparator<String>() {
            public int compare(String o1, String o2) {
                return (o1.compareToIgnoreCase(o2));
                /*
An int value: 0 if the string is equal to the other string, ignoring case differences.
< 0 if the string is lexicographically less than the other string
> 0 if the string is lexicographically greater than the other string (more characters)
                 */
            }
        };

        Example1 ex = new Example1();
        System.out.println(ex.names);//This would print the list as it is
        Collections.sort(ex.names);//This would sort the sort and alter the original list
        System.out.println(ex.names);
        Collections.sort(ex.names, comp);// using the Comparator reference here to write our own logic for sorting
        System.out.println(ex.names);
        Collections.sort(ex.names, comp1);// Sorting the strings in a lexicographical (dictionary) order// this is not of much use as the Collections.sort would do the same. Just for example of comparator we have shown this example
        System.out.println(ex.names);
    }
}
