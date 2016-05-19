package src.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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

        List<Integer> ints = new ArrayList<Integer>();
        ints.addAll(Arrays.asList(1,2,3,4,5,6));
        ints.stream().filter(i -> i%2 == 0).collect(Collectors.toList());

    }
}
