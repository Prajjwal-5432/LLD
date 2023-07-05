package DesignPatterns.FactoryDesignPattern.Theme;

//step1 -> Create Parent Class
//step4 -> Add Factory Method
public abstract class Theme {
    private String name;
    private String primaryColor;
    private String authorName;

    public abstract ThemeComponentFactory createComponentFactory();
}
