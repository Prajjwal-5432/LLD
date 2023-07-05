package DesignPatterns.FactoryDesignPattern.Theme.dark;

import DesignPatterns.FactoryDesignPattern.Theme.Button;
import DesignPatterns.FactoryDesignPattern.Theme.Menu;
import DesignPatterns.FactoryDesignPattern.Theme.ThemeComponentFactory;

public class DarkThemeFactory implements ThemeComponentFactory {
    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public Menu createMenu() {
        return new DarkMenu();
    }
}
