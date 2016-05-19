package src.java;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chamadhu on 5/16/2016.
 */


class Super {
    public Object getSomething() {
        return new Object();
    }

    public Sub doSomething() {
        return new Sub();
    }
}

class Sub extends Super {
    @Override
    public String getSomething() {
        return new String();
    }

}

class test {
    public static void main(String[] args) {
        List<? extends Object> covariantList = new ArrayList<>();
        List<? super String> contravariantList = new ArrayList<>();
    }
}
