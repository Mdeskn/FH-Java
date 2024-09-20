# Problem 4: Sorting Words Alphabetically

**Author**: Maede Eskandari Borujerdi  
**Matriculation Number**: 7221435  

## Problem Description
For this problem, we were to identify words in a given Shakespeare soliloquy and sort them alphabetically. We were asked to define how we handle "words" for the purpose of this activity. The code should do the following:
- Extract words from the text (i.e., separate them by spaces, ignoring punctuation).
- Sort the words in alphabetical order using **bubble sort**, a simple sorting algorithm.
  
### Definition of "Words"
In this context, a word is any sequence of characters separated by spaces. All punctuation (commas and periods) is removed. All letters are treated as lowercase for sorting purposes.

## Steps in the Program
1. **Extract Words**: 
    - The text is first processed to remove all punctuation.
    - Words are then split by spaces.
    - All characters are converted to lowercase to ensure consistent sorting.
  
2. **Sorting (Bubble Sort)**:
    - The **bubble sort** algorithm is used to sort the words alphabetically.
    - The algorithm compares adjacent words and swaps them if they are out of order, continuing until no more swaps are needed.

3. **Display Results**: 
    - Once the words are sorted, they are displayed as an array.

## Project Details
The text analyzed by the program is the same soliloquy used in Problem 3:

```java
String text = "To be or not to be, that is the question;" +
              "Whether 'tis nobler in the mind to suffer" +
              " the slings and arrows of outrageous fortune," +
              " or to take arms against a sea of troubles," +
              " and by opposing end them?";
```

## Instructions for Running the Project

### Step 1: Clone or Download the Project from GitHub
- Visit the GitHub repository containing the project.
- Download the project by clicking the **Code** button and selecting **Download ZIP**, or clone the repository using the following command:

```bash
git clone https://github.com/Mdeskn/FH-Java.git
```

- Extract the ZIP file to a folder on your local machine, or find the cloned project folder.

### Step 2: Import the Project into Eclipse
1. Open Eclipse IDE.
2. Go to **File** > **Import**.
3. Select **General** > **Existing Projects into Workspace** and click **Next**.
4. Click **Browse** and navigate to the folder where you saved or extracted the project, e.g.:

```bash
C:\Users\<YourUsername>\FH-Java\Homework assignment 1\Problem 4
```

5. Select the project and click **Finish**.

### Step 3: Run the Program in Eclipse
1. In Eclipse, locate the imported project in the **Package Explorer**.
2. Right-click the project folder and choose **Run As** > **Java Application**.
3. The console will display the sorted words in alphabetical order.

## Program Output
When you run the program, the output in the console will be as follows:

```
Sorted words: [a, against, and, and, and, and, arrows, arms, be, be, by, end, fortune, is, mind, nobler, not, of, of, of, opposing, or, or, outrageous, question, sea, slings, suffer, take, that, the, the, them, this, to, to, to, to, troubles, whether]
```