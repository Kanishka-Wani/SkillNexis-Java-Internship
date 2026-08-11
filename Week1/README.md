# ☕ Java Programming Internship – Week 1

## 📌 Introduction

This repository contains my **Week 1 work** for the **Java Programming Internship**.

During this week, I started learning the fundamentals of **Java programming** and practiced writing simple Java programs. The concepts were learned and practiced using the **Bro Code – Java Tutorial for Beginners** video along with hands-on coding exercises.

The main objective of Week 1 was to understand the basics of Java syntax, program structure, variables, data types, user input, operators, conditional statements, and basic problem-solving.

---

## 🎯 Week 1 Objectives

* Understand the basics of Java programming
* Learn how Java programs are structured
* Understand JDK, JVM, and JRE
* Write and execute a basic Java program
* Learn variables and data types
* Take input from the user
* Perform arithmetic operations
* Understand operators and expressions
* Use conditional statements
* Practice basic programming problems
* Develop logical thinking through simple Java programs

---

## 🛠️ Technologies Used

* **Programming Language:** Java
* **JDK:** Java Development Kit
* **IDE/Editor:** Visual Studio Code / IntelliJ IDEA
* **Version Control:** Git & GitHub

---

# 📚 Topics Covered

## 1. Introduction to Java

Java is a high-level, object-oriented programming language designed to be portable across different platforms.

### Key Features

* Object-Oriented
* Platform Independent
* Secure
* Robust
* Portable
* Multithreaded
* High Performance
* Automatic Memory Management

Java follows the principle:

> **Write Once, Run Anywhere**

---

## 2. JDK, JRE and JVM

### JDK – Java Development Kit

JDK provides the tools required to **develop and compile Java programs**.

It contains:

* JRE
* JVM
* Java compiler (`javac`)
* Development tools

### JRE – Java Runtime Environment

JRE provides the environment required to **run Java applications**.

### JVM – Java Virtual Machine

JVM executes Java **bytecode** and allows Java programs to run on different operating systems.

### Java Execution Flow

```text
Java Source Code
       ↓
    javac
       ↓
   Bytecode
       ↓
      JVM
       ↓
Program Output
```

---

# 3. First Java Program

The first program practiced was the traditional **Hello World** program.

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
```

### Explanation

* `class` → Defines a class
* `Main` → Class name
* `main()` → Starting point of the program
* `System.out.println()` → Prints output to the console

---

# 4. Variables

A variable is a named memory location used to store data.

### Syntax

```java
dataType variableName = value;
```

### Example

```java
int age = 20;
double price = 99.99;
char grade = 'A';
String name = "Kanishka";
boolean isStudent = true;
```

---

# 5. Java Data Types

## Primitive Data Types

Java has eight primitive data types:

| Data Type | Example                      |
| --------- | ---------------------------- |
| `byte`    | `byte age = 20;`             |
| `short`   | `short number = 1000;`       |
| `int`     | `int marks = 95;`            |
| `long`    | `long population = 100000L;` |
| `float`   | `float price = 10.5f;`       |
| `double`  | `double salary = 50000.50;`  |
| `char`    | `char grade = 'A';`          |
| `boolean` | `boolean status = true;`     |

### Reference Type

```java
String name = "Kanishka";
```

---

# 6. User Input

The `Scanner` class can be used to take input from the user.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Hello " + name);

        scanner.close();
    }
}
```

### Common Scanner Methods

```java
nextInt()
nextDouble()
nextFloat()
next()
nextLine()
nextBoolean()
```

---

# 7. Arithmetic Operators

Java provides arithmetic operators for performing calculations.

| Operator | Meaning        |
| -------- | -------------- |
| `+`      | Addition       |
| `-`      | Subtraction    |
| `*`      | Multiplication |
| `/`      | Division       |
| `%`      | Remainder      |

### Example

```java
int a = 20;
int b = 10;

System.out.println(a + b);
System.out.println(a - b);
System.out.println(a * b);
System.out.println(a / b);
System.out.println(a % b);
```

---

# 8. Expressions

Expressions are combinations of values, variables, and operators that produce a result.

```java
int a = 10;
int b = 20;

int result = a + b * 2;

System.out.println(result);
```

Java follows operator precedence while evaluating expressions.

---

# 9. User Input + Calculations

Example: Calculate the area of a rectangle.

```java
import java.util.Scanner;

public class RectangleArea {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length: ");
        double length = scanner.nextDouble();

        System.out.print("Enter width: ");
        double width = scanner.nextDouble();

        double area = length * width;

        System.out.println("Area = " + area);

        scanner.close();
    }
}
```

---

# 10. Conditional Statements

Conditional statements allow a program to make decisions.

## if Statement

```java
int age = 20;

if (age >= 18) {
    System.out.println("Eligible to vote");
}
```

## if-else Statement

```java
int number = 10;

if (number % 2 == 0) {
    System.out.println("Even number");
} else {
    System.out.println("Odd number");
}
```

## else-if

```java
int marks = 85;

if (marks >= 90) {
    System.out.println("Grade A+");
} else if (marks >= 80) {
    System.out.println("Grade A");
} else if (marks >= 70) {
    System.out.println("Grade B");
} else {
    System.out.println("Needs Improvement");
}
```

---

# 11. Comparison Operators

| Operator | Meaning                  |
| -------- | ------------------------ |
| `==`     | Equal to                 |
| `!=`     | Not equal to             |
| `>`      | Greater than             |
| `<`      | Less than                |
| `>=`     | Greater than or equal to |
| `<=`     | Less than or equal to    |

Example:

```java
int age = 20;

System.out.println(age >= 18);
```

Output:

```text
true
```

---

# 12. Logical Operators

| Operator | Meaning |   |    |
| -------- | ------- | - | -- |
| `&&`     | AND     |   |    |
| `        |         | ` | OR |
| `!`      | NOT     |   |    |

Example:

```java
int age = 20;
boolean hasID = true;

if (age >= 18 && hasID) {
    System.out.println("Entry allowed");
}
```

---

# 💻 Practical Programs

During Week 1, I practiced several beginner-level programs.

### Programs Practiced

1. Hello World
2. Print personal information
3. Add two numbers
4. Find the remainder
5. Calculate square of a number
6. Calculate cube of a number
7. Calculate area of a rectangle
8. Calculate perimeter of a rectangle
9. Calculate simple interest
10. Take user input using Scanner
11. Check whether a number is even or odd
12. Check whether a number is positive or negative
13. Find the largest of two numbers
14. Find the largest of three numbers
15. Calculate grades using if-else
16. Create a simple calculator
17. Perform basic arithmetic operations
18. Check voting eligibility

---

# 🧮 Example: Simple Calculator

```java
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result;

        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            result = num1 / num2;
        } else {
            System.out.println("Invalid operator");
            scanner.close();
            return;
        }

        System.out.println("Result = " + result);

        scanner.close();
    }
}
```

---

# 📂 Repository Structure

```text
Java-Programming-Internship/
│
├── Week-1/
│   │
│   ├── HelloWorld.java
│   ├── Variables.java
│   ├── UserInput.java
│   ├── Arithmetic.java
│   ├── EvenOdd.java
│   ├── SimpleInterest.java
│   ├── Calculator.java
│   ├── GradeCalculator.java
│   └── README.md
│
└── README.md
```

---

# 📈 Learning Outcomes

After completing Week 1, I was able to:

* Understand the basic structure of a Java program
* Explain the difference between JDK, JRE and JVM
* Compile and execute Java programs
* Declare and use variables
* Understand Java data types
* Take input using `Scanner`
* Perform mathematical calculations
* Use arithmetic, relational and logical operators
* Implement decision-making using `if`, `else if`, and `else`
* Solve basic programming problems using Java

---

# 🎥 Learning Resource

The primary video resource used for learning the fundamentals was:

**Bro Code – Java Tutorial for Beginners**

The course provides practical explanations and coding examples covering Java fundamentals and gradually progressing toward more advanced Java concepts.

---

# 🚀 Conclusion

Week 1 provided a strong foundation in Java programming. I learned the basic syntax and structure of Java programs and practiced using variables, data types, user input, operators, expressions, and conditional statements.

The hands-on exercises helped me understand how Java code works and improved my problem-solving skills. These fundamentals will serve as the foundation for learning **loops, methods, arrays, Object-Oriented Programming, inheritance, polymorphism, exception handling, and other advanced Java concepts** in the upcoming weeks.

---

## 👨‍💻 Internship

**Program:** Java Programming Internship
**Week:** 1
**Language:** Java
**Repository:** Java Programming Internship
