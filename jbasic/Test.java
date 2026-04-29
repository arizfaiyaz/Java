public class Test {
    public static void main(String[] args){
        System.out.println("Hello, World!");
        A a = new A();
        a.display();
    }
}

class A {
    void display() {
        System.out.println("Class A method");
    }
}
