package agh.edu.pl;

/**
 * Created by student4 on 2014-10-23.
 */
public class President {
    private static President p;
    private int age;
    // constructor is private!
    private President(int age) {
        this.age = age;
    }
    public static President getPresident() {
        if (p == null) p = new President(62);
        return p;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
