package DesignPatterns.FactoryDesignPattern.Theme.primary;

import DesignPatterns.FactoryDesignPattern.Theme.Button;
import DesignPatterns.FactoryDesignPattern.Theme.Menu;
import DesignPatterns.FactoryDesignPattern.Theme.ThemeComponentFactory;

public class PrimaryThemeFactory implements ThemeComponentFactory {
    @Override
    public Button createButton() {
        return new PrimaryButton();
    }

    @Override
    public Menu createMenu() {
        return new PrimaryMenu();
    }
}
