package agh.edu.pl;

/**
 * Created by student4 on 2014-10-23.
 */
class Square extends Shape {
    Square() {
    } // Package-access constructor
    public void draw() {
        System.out.println("Square.draw");
    }
    public void erase() {
        System.out.println("Square.erase");
    }
}
