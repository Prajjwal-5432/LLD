package DesignPatterns.FactoryDesignPattern.Theme;

import DesignPatterns.FactoryDesignPattern.Theme.primary.PrimaryTheme;

public class Client {
    public static void main(String[] args) {
        Theme primaryTheme = new PrimaryTheme();
        ThemeComponentFactory componentFactory = primaryTheme.createComponentFactory();
    }
}
