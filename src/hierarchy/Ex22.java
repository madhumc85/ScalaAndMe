package src.hierarchy;

public class Ex22 {
    // This is Java
    boolean isEqual(Integer x, Integer y) {
      return x == y;
    }

    public void go() {
        System.out.println(isEqual(421, 421));
    }

    public static void main(String[] args) {
        Ex22 ex2 = new Ex22();
        ex2.go();
    }
}
