package com.in28minutes.exercises.newreleases.java10.api.features;

import java.util.ArrayList;
import java.util.List;

/**
 * Explore the new features on Java API since Java 9 and beyond.
 */
public class ListSetMapCopyOfApiRunner {
    public static void main(String[] args) {
        //Use of copyOf() and of() methods on List Set and Map:

        //Let's assume we have a list that is obtained from an external source (ie: Database)
        final List<String> names = new ArrayList<>();
        names.add("Ranga");
        names.add("Ravi");
        names.add("John");
        //This list from above, is modifiable as it is, as a new object is created and I can add more values.

        //Let's assume another method is created and passes this same list as parameter:
        doNotChange(names);
        //So now the list is screwed, or has been modified. Even when the list is declared final, it's contents are not final!
        System.out.println(names);
        //Let's create the list another way:
        List<String> names2 = List.of("Ranga", "Ravi", "John");
        //Now the list is created as Unmodifiable, but we have to set the values manually or values are fixed.
        //if we call again the method:
        //doNotChange(names2); //It will throw an exception: UnsupportedOperationException, because the list is Immutable.

        //To do the same with from another list, so we obtain a copy of another list but immutable:
        List<String> names3 = List.copyOf(names);
        //Again if we call again the method:
        //doNotChange(names2); //It will throw an exception: UnsupportedOperationException, because the list is Immutable.

    }

    private static void doNotChange(List<String> names) {
        names.add("ShouldNotBeAllowed");
    }
}
