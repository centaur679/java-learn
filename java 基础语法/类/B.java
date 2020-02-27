public class B extends A {

    public void name(){
        System.out.println("B");
    }

    public static void main(String[] args) {
        A b = new B();
        b.print();
    }
}
