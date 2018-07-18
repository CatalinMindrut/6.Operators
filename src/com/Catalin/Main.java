package com.Catalin;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2;
        /** In this case, "=" and "+" are operators.
         * "int" is a primitive data type
         * "result" is a variable
         * "1+2" is an expression
         * And the entire thing is a statement as you will learn in the next course.
         */
        System.out.println("1 + 2 = " + result);

        int previousResult = result;
        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);
        /**Again "=" and "-" are operators.
         */

        previousResult = result;
        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;
        result = result /5;
        System.out.println(previousResult + " / 5 = " + result);
        /** Whatever is positioned to the left or to the right of an operator is called an Operand.
         * In the first example the expression "1+2" contains 1 operator "+" and 2 operands "1" and "2".
         */

        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);
        /** The remainder operator "%" returns what is left over after dividing, in this case 4 by 3.
         * 3 fits into 4 once leaving a remainder of 1.
         */

        result = result +1;
        System.out.println("Result is now " + result);
        result++;
        System.out.println("Result is now " + result);
        /** The "++" operator increments the current value by 1.
         * "--" works the same way except it deducts the value by 1.
         */

        result += 20;
        System.out.println("Result is now " + result);
        result -= 13;
        System.out.println("Result is now " + result);
        result *= 10;
        System.out.println("Result is now " + result);
        result /= 10;
        System.out.println("Result is now " + result);
        /** "+=", "/=", etc. operators effectively replace: result = result + 20 in the first example.
         */

        /**Conditional Code
         */
        boolean isAlien = false;
        if (isAlien == false)
        System.out.println("This is not an alien.");
        /**This is an example of conditional code, the print out is only processed if the above verification is true.
         * Difference between "=" and "==":
         * = assigns a value to the variable, in this example we are setting the isAlien variable to false. This is also
         * called an Assignment operator.
         * == verifies if the statements is true, tests to see if the isAlien variable is actually false.
         */

        isAlien = false;
        if (isAlien == true)
        System.out.println("This is not an alien!");
         /** (isAlien == true) is a boolean expression.
          * In this example, the boolean expression is changed to isAlien == true, the console will not print anything, because
          * the condition is not met so the following code line is not processed. The false value was assigned to the
          * isAlien variable and Java verifies, as instructed, if the isAlien variable has the value set to true. In this
          * case it does not so the rest of the code is not processed. This happens because the code was conditional,
          * involving an "if". If this is true, do this.
         */

         int topScore = 100;
         if (topScore == 100)
             System.out.println("You go the high score!");
        if (topScore != 100)
            System.out.println("You go the high score!");
        if (topScore > 100)
            System.out.println("You go the high score!");
        /** != is the not equal operator, ! negates the statement
         * Other operators = <, >, <=, >=,
         */

        topScore = 800;
        int secondTopScore = 100;
        if (topScore > secondTopScore && topScore > 790)
            System.out.println("Top Score is bigger than the second Top Score and bigger than 790.");
        /** The && operator verifies if both statements are true. The rest of the conditional code is not processed if the
         *  first or the second statements are not evaluated to true.
         */

        if (topScore > 700 || secondTopScore < 700)
            System.out.println("One of the statements is true.");
        /**This is the "or" operator (||), at least one of the statements must be true. If one or both the statements
         * are true then the rest of the code is processed.
         */

        /** Common mistakes:
         */
        int newValue = 50;
//        if (newValue = 50)
            System.out.println("This is an error");
        /** Using = instead  of == won't work because instead of verifying if the newValue variable is 50, it actually tries
         * to set the newValue to 50, once more. = is an assignment operator and it is used to set the value of a
         * variable in this case.
         * There is actually a hidden error in this statement. The problem is not that you are using the wrong operator
         * but the fact that you are not using a boolean. Normally the statement after the "if" would just assign the same
         * value to the newValue variable (see the example below).
         */

        boolean isCar = false;
        if (isCar = true)
            System.out.println("This is not supposed to happen!");
        /** Compared to the previous example, this statement will actually be valid and the text will be printed. The first
         * line of code assigns the false value to the isCar variable while the second line of code assigns the true
         * value to the isCar variable.
         * Being a boolean, the "if" statement will not return an error even if the wrong operator is used (== should be used).
         * If == is used, the print out will not longer be processed since the statement verifies if the isCar is true and no
         * longer sets the value to true.
         */

        isCar = true;
        if (isCar)
            System.out.println("This is true.");
        /**If only the variable is used in the "if" statement, Java will verify if the variable is true. isCar exists? Is it true?
         * if (isCar) is the same as if (isCar = true).
         */
        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar)
            System.out.println("isCar is true.");
        /** Ternary operator "?:" (x1 ? x2 : x3). In this case the operator translates to: return the value of isCar (true),
         * isCar is true? then wasCar = true, else, false.
         * In the example, isCar was actually set to true so true ? true is in fact valid and wasCar is set to true and the
         * rest of the code is processed.
         * The longer version fo the example is:
         */
        wasCar = isCar = true ? true : false;
        if (wasCar = true)
            System.out.println("isCar is true.");
        /** If isCar = true then set wasCar to true, else set wasCar to false.
         */

        /**Challenge:
         */
        double firstValue = 20;
        double secondValue = 80;
        double total = firstValue + secondValue;
        total = total * 25;
        System.out.println(total);
        double reminder = total % 40;
        System.out.println(reminder);
        if (reminder <= 20)
        System.out.println("Total was over the limit.");
    }
}
