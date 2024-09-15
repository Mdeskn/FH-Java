# Problem 3: String Analysis – Vowels, Consonants, and Spaces
Author: Maede Eskandari Borujerdi  
Matriculation Number: 7221435  

## Project Overview
This Java program analyzes a block of text and computes the number of vowels, consonants, and spaces present in the text.

### Problem Description
In this problem, the task is to count:
- The number of vowels (A, E, I, O, U – both lowercase and uppercase),
- The number of consonants,
- The number of spaces.

The program iterates over each character of a string and determines whether it's a space, vowel, or consonant.

### Output
The output of the program will display:
- The total number of vowels,
- The total number of consonants,
- The total number of spaces.

### Project Details
The text analyzed by the program is from Shakespeare's famous soliloquy:

```java
String text = "To be or not to be, that is the question;" + 
              "Whether `tis nobler in the mind to suffer" + 
              " the slings and arrows of outrageous fortune," +
              " or to take arms against a sea of troubles," +
              " and by opposing end them?";
```

### Key Steps
1. Initialize counters for spaces, vowels, and letters.
2. Use a loop to iterate over each character in the string.
3. Use conditions to check if the character is:
    - A space (`ch == ' '`),
    - A vowel (`ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'`),  
    - A consonant (all other letters).
4. Print the results.

### Instructions for Running the Project

#### Step 1: Clone or Download the Project from GitHub
- Visit the GitHub repository containing the project.
- Download the project by clicking the **Code** button and selecting **Download ZIP**, or clone the repository using the following command:

```bash
git clone https://github.com/Mdeskn/FH-Java.git
```

- Extract the ZIP file to a folder on your local machine, or find the cloned project folder.

#### Step 2: Import the Project into Eclipse
1. Open Eclipse IDE.
2. Go to **File** > **Import**.
3. Select **General** > **Existing Projects into Workspace** and click **Next**.
4. Click **Browse** and navigate to the folder where you saved or extracted the project, e.g.:

```bash
C:\Users\<YourUsername>\FH-Java\Homework assignment 1\Problem 3
```

5. Select the project and click **Finish**.

#### Step 3: Run the Program in Eclipse
1. In Eclipse, locate the imported project in the **Package Explorer**.
2. Right-click the project folder and choose **Run As** > **Java Application**.
3. The console will display the number of vowels, consonants, and spaces in the text.

### Program Output
When you run the program, you should see the following output in the console:

```
The text contained vowels: 65
consonants: 121
spaces: 42
```