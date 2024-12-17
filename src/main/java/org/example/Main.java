package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("!!!     hello дорогой друг    !!!");
        String osName = System.getProperty("os.name");
        String ver = System.getProperty("java.version");
        long tim = System.currentTimeMillis();
        System.out.println("Ява версия: " + ver);
        System.out.println("Время в милисек: " + tim);
        System.out.println("Ваша операционная система: " + osName);

    }
}
