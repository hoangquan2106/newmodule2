package Main;

import Classs.StaticProperty;

public class StaticPropertys {

    public static void main(String[] args) {
        StaticProperty staticProperty1 = new StaticProperty("quân","haha");
        System.out.println(StaticProperty.num);
        StaticProperty staticProperty2 = new StaticProperty("quân2", "hahaha");
        System.out.println(StaticProperty.num);
        staticProperty1.display();
        staticProperty2.display();
    }
}
