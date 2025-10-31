package org.example.birds;

class Bird {
    public void fly() {
        System.out.println("Птица летает");
    }

    public void sing() {
        System.out.println("Птица поёт");
    }
}

class Sparrow extends Bird {
    @Override
    public void fly() {
        System.out.println("Воробей летает быстро и ловко");
    }

    @Override
    public void sing() {
        System.out.println("Воробей чирикает");
    }
}

class Hen extends Bird {
    public void layEggs() {
        System.out.println("Наседка несёт яйца");
    }

    public void incubate() {
        System.out.println("Наседка высиживает птенцов");
    }

    @Override
    public void fly() {
        System.out.println("Наседка летает плохо, только подпрыгивает");
    }

    @Override
    public void sing() {
        System.out.println("Наседка кудахчет");
    }
}
