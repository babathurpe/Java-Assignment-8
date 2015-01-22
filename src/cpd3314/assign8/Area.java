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

/* Exercise #1 - Area Class
 * ========================
 * Write a class that has three overloaded static methods for calculating the 
 * areas of the following geometric shapes:
 * - Circles
 * - Rectangles
 * - Regular Polygon (http://www.mathwords.com/a/area_regular_polygon.htm)
 * Here are the formulas for calculating the area of the shapes.
 *   Area of a Circle:              Area = Math.PI * Radius * Radius
 *   Area of a Rectangle:           Area = Width * Length
 *   Area of a Regular Polygon:     Area = 1/2 * NumSides * LengthSide * Radius
 * Because the three methods are to be overloaded, they should each be named 
 * calculate, but have different parameter lists.
 *
 * - Gaddis pg. 555-6
 */
/**
 * @author Babatope Shokunbi - C0642703
 */
public class Area {
    //double pi = Math.PI;
    
    //Area of circles
    public static double calculate(double radius){
        return Math.PI * radius * radius;
    }
    
    //Area of Rectangle
    public static double calculate(double width, double length){
        return width * length;
    }
    
    //Area of Regular Polygon
    public static double calculate(double numSides, double lengthSides, double radius){
        return 0.5 * numSides * lengthSides * radius;
    }
}