#Introduction to Programming

##Practical 3

###Instructions

Download the classes from github and put them into a bluej project. 

###Level 1: Play with Expressions in the Biogram

1. Compile all the classes and construct a BioGram with parameters width=500, height=200

2. Admire the pretty pattern

3. Adapt the CountExpr class to make your own ways of stepping and finishing

4. You will need to re-compile CountExpr and BioGram (why?) to run your own example

5. If you come up with a good one then upload it to the wiki along with your CountExpr class. It may look good, or perhaps be generated in some artistic way.

6. Have a look at the Pixel class and see if you can work out what it's doing. To understand this you will need a knowledge of binary, so miss this out if you don't already know about binary.

###Level 2: Expressions with numbers

1. In a new project define a new class called _Calculation_

2. Without writing any fields or constructors, write two get methods to return:

  * number of hours in a week
  * number of seconds in a year

3. Add to the _Calculation_ class two real-number fields called _x_ and _y_

  * Write a constructor for the the class
  * Write get and set methods for _x_ and _y_

4. Write more methods which do calculations with _x_ and _y_:
   * Find the average of _x_ and _y_
   * Find the the maximum of _x_ and _y_
   * Swap the values of _x_ and _y_
   * Assuming that _x_ holds a temperature in Celsius, set _y_ to be the same temperature in Farenheit. 0C=32F and 100C=212F.
   * Given quadratic coefficients _a_, _b_ and _c_, put the roots of the quadratic equation into the _x_ and _y_


###Level 3: Harder problems

You don't necessarily need to complete all of these to get a good mark, some of them are challenging. These calculations should be done inside methods of your _Calculation_ class but do not involve the fields _x_ and _y_. All inputs to the calculations should be parameters and all outputs should be return values.

1. Given an integer calculate whether it is an odd number.

2. Given a date String in the format DD/MM/YYYY calculate
 * DD
 * YYYY
 * YYYY even if format given is DD/MM/YY (could still be DD/MM/YYYY)
 
  __Hint:__ you will need to use methods from the _String_ class.
  
3. Given an amount of money (in pence, less than 100) calculate the minumum number of coins required to make that value

4. Given the day, month and year as ints where 2100>year>2000, calculate the day of the week. 1 Jan 2001 was a Monday. Assume every fourth year is a leap year.

