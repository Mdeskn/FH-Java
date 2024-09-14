# Problem 2: Prime Number Calculation

**Author:** Maede Eskandari Borujerdi  
**Matriculation Number:** 7221435

## Project Overview

This Java application calculates and prints all prime numbers up to a specified limit (50 in this case). The program demonstrates the use of control flow statements to determine if a number is prime.

## Problem Description

The task is to create a program that finds all prime numbers from 2 to 50. The program should:

1. Use labeled `continue` instead of `break`.
2. Avoid using the `isPrime` variable.
3. Optimize the prime-checking process by only checking divisibility up to the square root of `i`.

### Expected Output

The output should display all prime numbers within the specified range. For example:

```
2
3
5
7
11
...
47
```

## Project Details

### Program Logic

The program uses the following logic:

1. **Loop through Numbers**: 
   - It starts from 2 and goes up to `nValues` (50).
   - For each number, it checks whether it is prime.

2. **Divisibility Check**: 
   - Instead of checking divisibility by every number up to `i`, it checks only up to the square root of `i`. This is done using the condition `j * j <= i`.

3. **Output**: 
   - If a number is determined to be prime (i.e., it has no divisors), it prints that number.

### Control Flow Statements

Control flow statements are commands that determine the order in which different parts of your program are executed. Here are some key control flow statements used in this program:

- **Loops**: Used to repeat a block of code. 
  - The outer loop (`for (int i = 2; i <= nValues; i++)`) goes through each number up to `nValues`.
  - The inner loop (`for (int j = 2; j * j <= i; j++)`) checks for divisors of each number.
  
- **If Statement**: Checks a condition. If the condition is true, it executes the block of code inside. 
  - In this program, `if (i % j == 0)` checks if `i` is divisible by `j`.
  
- **Continue Statement**: Skips the current iteration of the loop and moves to the next iteration. 
  - The labeled `continue Loop1;` in this program skips to the next number in the outer loop if a divisor is found.

## Instructions for Running the Project

### Step 1: Clone or Download the Project from GitHub

1. Visit the GitHub repository containing the project.
2. Download the project by clicking the **Code** button and selecting **Download ZIP**, or clone the repository using the following command:
   ```bash
   git clone https://github.com/Mdeskn/FH-Java.git
   ```
3. Extract the ZIP file to a folder on your local machine, or find the cloned project folder.

### Step 2: Import the Project into Eclipse

1. Open **Eclipse IDE**.
2. Go to **File > Import**.
3. Select **General > Existing Projects into Workspace** and click **Next**.
4. Click **Browse** and navigate to the folder where you saved or extracted the project, e.g.:
   ```bash
   C:\Users\<YourUsername>\FH-Java\Homework assignment 1\Problem 2
   ```
5. Select the project and click **Finish**.

### Step 3: Run the Program in Eclipse

1. In Eclipse, locate the imported project in the **Package Explorer**.
2. Right-click the project folder and choose **Run As > Java Application**.
3. The console will display all the prime numbers between 2 and 50.
