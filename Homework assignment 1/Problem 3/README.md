# Problem 3: Counting Vowels, Consonants, and Spaces
Author: Maede Eskandari Borujerdi  
Matriculation Number: 7221435  

## Problem Description
The goal of this program is simple: analyze a given text and count how many vowels, consonants, and spaces it contains.

### What We’re Counting
- **Vowels**: The letters A, E, I, O, U (both uppercase and lowercase).
- **Consonants**: Every other letter except vowels.
- **Spaces**: Every space in the text.

### How It Works
- **Step 1**: Initialize counters for spaces, vowels, and letters (consonants will be calculated by subtracting vowels from total letters).
- **Step 2**: Loop through each character in the string:
    - If it’s a space, we increment the `spaces` counter.
    - If it’s a letter, we check if it's a vowel. If yes, we increment the `vowels` counter.
    - Consonants are just the total number of letters minus the number of vowels (neat, right?).
- **Step 3**: Print the final counts.

---

## Program Output
When the program is run, it will output:

```
The text contained:
Vowels: 60
Consonants: 93
Spaces: 37
```

---

## Code
Here’s the Java code that does all the work:

```java
package p1;

public class StringCharacters {
    public static void main(String[] args) {
        String text = "To be or not to be, that is the question;" +
                      "Whether `tis nobler in the mind to suffer" +
                      " the slings and arrows of outrageous fortune," +
                      " or to take arms against a sea of troubles," +
                      " and by opposing end them?";

        int spaces = 0, vowels = 0, letters = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            
            if (ch == ' ') {
                spaces++;
            } else if (Character.isLetter(ch)) {
                letters++;
                
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                    vowels++;
                }
            }
        }

        System.out.println("The text contained:");
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + (letters - vowels));
        System.out.println("Spaces: " + spaces);
    }
}
```

---

## Running the Program

### Step 1: Clone the Repository
First, grab the project from GitHub using:

```bash
git clone https://github.com/Mdeskn/FH-Java.git
```

### Step 2: Import the Project into Eclipse
1. Open **Eclipse IDE**.
2. Go to **File > Import**.
3. Select **General > Existing Projects into Workspace**.
4. Browse to where you cloned the project and select **Homework assignment 1/Problem 3**.

### Step 3: Run the Program
- Right-click the project in the **Package Explorer**.
- Select **Run As > Java Application**.
- The results will be displayed in the console.

---
