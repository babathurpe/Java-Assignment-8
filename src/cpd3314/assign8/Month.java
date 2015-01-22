/*
 * Copyright 2014 Len Payne <len.payne@lambtoncollege.ca>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/* The following exercises are adapted from: 
 * Gaddis, T. (2013). Starting Out with Java: From Control Structures through  
 * Objects. (5th ed.). Upper Saddle River, NJ: Pearson Education. 
 * ISBN: 978-0-13-285583-9 
 */

package cpd3314.assign8;

/* Exercise #5 - Month Class
 * =========================
 * Write a class named Month. The class should have an int field named 
 * monthNumber that holds the number of the month. For example, January would be 
 * 1, February would be 2, and so forth. In addition, provide the following 
 * methods:
 * - A no-arg constructor that sets the monthNumber field to 1.
 * - A constructor that accepts the number of the month as an argument. It 
 *     should set the monthNumber field to the value passed as the argument. If 
 *     a value less than 1 or greater than 12 is passed, the construtor should 
 *     set monthNumber to 1.
 * - A constructor that accepts the name of the month, such as "January", 
 *     "february", or "MARCH" as an argument. It should be case-insensitive. It 
 *     should set the monthNumber field to the correct corresponding value.
 * - A setMonthNumber method that accepts an int argument, which is assigned to 
 *     the monthNumber field. If a value less than 1 or greater than 12 is 
 *     passed, the method should set monthNumber to 1.
 * - A getMonthNumber method that returns the value in the monthNumber field.
 * - A getMonthName method that returns the name of the month. For example, if 
 *     the monthNumber field contains 1, then this method should return 
 *     "January".
 * - A toString method that returns the same value as the getMonthName method.
 * - An equals method that accepts a Month object as an argument. If the 
 *     argument object holds the same data as the calling object, this method 
 *     should return true. Otherwise, it should return false.
 * - A greaterThan method that acepts a Month object as an argument. If the 
 *     calling object's monthNumber field is greater than the argument's 
 *     monthNumber field, this method should return true. Otherwise, it should 
 *     return false.
 * - A lessThan method that accepts a Month object as an argument. If the 
 *     calling object's monthNumber field is less than the argument's 
 *     monthNumber field, this method should return true. Otherwise, it should 
 *     return false.
 *
 * - Gaddis pg. 557-8
 */

/**
 * @author Babatope Shokunbi - C0642703
 */

public class Month {

    private int monthNumber;
    String month;

    public Month() {
        monthNumber = 1;
    }

    public Month(int monthNumber) {
        this.monthNumber = monthNumber;
        //setMonthNumber(monthNumber);
    }

    public Month(String month) {
        this.month = month;

        if (this.month.equalsIgnoreCase("January")) {
            this.monthNumber = 1;
        } else if (this.month.equalsIgnoreCase("February")) {
            this.monthNumber = 2;
        } else if (this.month.equalsIgnoreCase("March")) {
            this.monthNumber = 3;
        } else if (this.month.equalsIgnoreCase("April")) {
            this.monthNumber = 4;
        } else if (this.month.equalsIgnoreCase("May")) {
            this.monthNumber = 5;
        } else if (this.month.equalsIgnoreCase("June")) {
            this.monthNumber = 6;
        } else if (this.month.equalsIgnoreCase("July")) {
            this.monthNumber = 7;
        } else if (this.month.equalsIgnoreCase("August")) {
            this.monthNumber = 8;
        } else if (this.month.equalsIgnoreCase("September")) {
            this.monthNumber = 9;
        } else if (this.month.equalsIgnoreCase("October")) {
            this.monthNumber = 10;
        } else if (this.month.equalsIgnoreCase("November")) {
            this.monthNumber = 11;
        } else if (this.month.equalsIgnoreCase("December")) {
            this.monthNumber = 12;
        }
    }

    public void setMonthNumber(int monthNumber) {
        //this.monthNumber = monthNumber;
        if (monthNumber >= 1 && monthNumber <= 12) {
            this.monthNumber = monthNumber;
        } else {
            monthNumber = 1;
        }
    }

    public int getMonthNumber() {
        return monthNumber;
    }

    public String getMonthName() {
        switch (monthNumber) {
            case 1:
                return "Janaury";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "January";
        }
    }

    @Override
    public String toString(){
        return getMonthName();
    }
    
    public boolean equals(Month m){
        if(m.getMonthNumber() == this.getMonthNumber()){
            return true;
        } else{
            return false;
        }
    }
    
    public boolean greaterThan(Month m){
        if(this.getMonthNumber() > m.getMonthNumber()){
            return true;
        } else{
            return false;
        }
    }
    
    public boolean lessThan(Month m){
        if(this.getMonthNumber() < m.getMonthNumber()){
            return true;
        } else{
            return false;
        }
    }
}
