package com.example;

import com.example.domain.*;
public class App {
    public static void main(String[] args) {
        HomeCat murzik = new HomeCat("Мурзик", 3);
        WildCat simba = new WildCat("Симба", 5);
        ToyCat kitty = new ToyCat("Китти", 1);

        murzik.showInfo();
        murzik.meow();
        murzik.doSomething();

        simba.showInfo();
        simba.meow();
        simba.doSomething();

        kitty.showInfo();
        kitty.meow();
        kitty.doSomething();
    }
}
