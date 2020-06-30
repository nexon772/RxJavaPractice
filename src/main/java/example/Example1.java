package example;

import io.reactivex.Observable;

public class Example1 {

    public void emit(){
        Observable.just("Hello", "RxJava 2!!").subscribe(System.out::print);
    }
}
