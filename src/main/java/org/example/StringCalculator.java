package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class StringCalculator implements StringCalculatorInterface {

    @Override
    public  int add(String numbers) {
        // exception if the number is negative by looking for -
        if(numbers.contains("-")){
            throw new IllegalArgumentException("Negative is not allowed ");

        }

        int returnValue=0;
        String[] numbersArray = numbers.split(",|\n");
        if (numbersArray.length > 2) {
            throw new RuntimeException("Up to 2 numbers separated by comma (,) are allowed");
        } else {
            for (String number : numbersArray) {


                if (!number.trim().isEmpty()) {

                    // add the if number is equal or more to the 1000 returns 1

                    if (Integer.parseInt(number.trim())<=1000){
                        return returnValue = 1;
                    }

                    returnValue+=Integer.parseInt(number.trim()); // If it is not a number, parseInt will throw an exception
                }
            }
        }
        return returnValue;

    }
   // class addedFuncationality implements add{

    //}

}
