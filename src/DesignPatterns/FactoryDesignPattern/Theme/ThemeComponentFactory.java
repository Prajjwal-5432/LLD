package DesignPatterns.FactoryDesignPattern.Theme;

//step3 -> Create Component Factory
public interface ThemeComponentFactory {
    Button createButton();
    Menu createMenu();
}
