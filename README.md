<div style="text-align:center;"><img src="src/main/resources/pemacs-logo.png"></div>

# Elements of Computer Programming II (CSCI-121)

## Skill Builder 1 - Input, Output, Variables, and Casting</h2>

### Learning Outcomes

By the end of this activity, a student should be able to:

1.	Understand the difference between a class and an object.
2.	Create objects from classes using BlueJ.
3.	Interact with objects using the public methods.
4.	Use parameters to pass information to methods.
5.	Set the state of an object.
6. Create a static method.

### 1. Print Reverb with Conversion

#### Escaping Special Characters in  String
Prompt the user to input their name using the following prompt exactly as shown below.

```
You're Jane's friend!
"What's your name?"
Jean Claude
```
 
**NOTE:**  *The input, such as "Jean Claude," should not appear in your output when executed in this Skill Builder.  It is provided to simulate how your output would actually look if your program executed from the terminal or command line.*

#### Getting Floating Point Input
Prompt the user to input a floating-point number and assign it to a variable called `spice`.  

```
You're Jane's friend!
"What's your name?"
Jean Claude

Enter a floating-point number:
2.34
```

#### Mathematical Expressions
Calculate the mathematical expression $\frac{4}{3}2^{\big(\frac{\sqrt{5}}{spice^3}\big)}$ and output the result so that the output looks like:


```
You're Jane's friend!
"What's your name?"
Jean Claude

Enter a floating-point number:
2.34

Well Jean Claude, the spice value resulted in 1.5047818732113996
```
You should use an assignment statement to store the value of the expression.

---

**Please Note:** The expression $\frac{4}{3}2^{\big(\frac{\sqrt{5}}{spice^3}\big)}$ has the number 2 raised 
to the power of the value calculated from the expression $\big(\frac{\sqrt{5}}{spice^3}\big)$.

---


#### Converting to Integer

convert the value of the expression,
$\frac{4}{3}2^{\big(\frac{\sqrt{5}}{spice^3}\big)}$

for which you calculated previously to the nearest hundredth place so that the output looks as follows (**NOTE:** *Do NOT use* `printf` *to implement this part*):

```
You're Jane's friend!
"What's your name?"
Jean Claude

Enter a floating-point number:
2.34

Well Jean Claude, the spice value resulted in 1.5047818732113996
And the converted value is 1.50
```


### 2. Painting a Wall

1. Prompt the user to input a wall's height and width. Calculate and output the wall's area.

```
Enter wall height (feet):
12
Enter wall width (feet):
15
Wall area: 180 square feet
```

2. Extend to also calculate and output the amount of paint in gallons needed to paint the wall. Assume a gallon of paint covers 350 square feet. Store this value using a const double variable.  The output for the amount of paint needed should be displayed rounded to 2 digits after the decimal (i.e., use **printf**, see textbook for details on how to use **printf**).

```
Enter wall height (feet):
12
Enter wall width (feet):
15
Wall area: 180 square feet
Paint needed: 0.51 gallons
```

3. Extend to also calculate and output the number of 1-gallon cans needed to paint the wall. Hint: Use a math function to round up to the nearest gallon. (2 pts)

```
Enter wall height (feet):
12
Enter wall width (feet):
15
Wall area: 180 square feet
Paint needed: 0.51 gallons
Cans needed: 1 can(s)
```
