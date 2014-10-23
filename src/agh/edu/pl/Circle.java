package agh.edu.pl;

/**
 * Created by student4 on 2014-10-23.
 */
class Circle extends Shape {
    Circle() {
    } // Package-access constructor
    public void draw() {
        System.out.println("Circle.draw");
    }
    public void erase() {
        System.out.println("Circle.erase");
    }
}
