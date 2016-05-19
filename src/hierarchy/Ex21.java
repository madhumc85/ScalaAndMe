package src.hierarchy;

public class Ex21 {
    // This is Java
    boolean isEqual(int x, int y) {
      return x == y;
    }

    public void go() {
        System.out.println(isEqual(421, 421));
    }

    public static void main(String[] args) {
        Ex21 ex1 = new Ex21();
        ex1.go();
    }
}
