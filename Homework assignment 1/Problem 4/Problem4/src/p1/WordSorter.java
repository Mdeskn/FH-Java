package p1;

import java.util.Arrays;

public class WordSorter {
    public static void main(String[] args) {
        String text = "To be or not to be, that is the question;" +
                      "Whether 'tis nobler in the mind to suffer" +
                      " the slings and arrows of outrageous fortune," +
                      " or to take arms against a sea of troubles," +
                      " and by opposing end them?";

        // step 1: let's clean up the text and break it into words
        // remove anything that's not a letter (yes, commas and quotes, we're talking about you! ^_^)
        // and split the text into individual words
        String[] words = text.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");

        // step 2: time to sort! we'll use bubble sort to organize these words in alphabetical order
        // bubble sort is like checking a group of friends in line and swapping them if they're out of order
        bubbleSort(words);

        // step 3: and yaay! let's print the sorted words and admire our work
        System.out.println("Sorted words: " + Arrays.toString(words));
    }

    // bubble sort: our trusty (if not the fastest) way to sort words
    // it keeps checking pairs of words, swapping them if needed, and repeats until everything's in place
    public static void bubbleSort(String[] arr) {
        int n = arr.length;
        boolean swapped;
        do {
            swapped = false;
            // this loop checks one pair of words at a time, like sorting through a deck of cards
            for (int i = 0; i < n - 1; i++) {
                if (arr[i].compareTo(arr[i + 1]) > 0) {
                    // oops, these two are out of order! let's swap them
                    String temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true; // flag that a swap happened
                }
            }
            n--; // we can ignore the last item next time, it's already sorted!
        } while (swapped); // keep going until no swaps are made, meaning it's all sorted
    }
}
