public class Main {
    public static void main(String[] args) {
        ThemeFactory lightFactory = new LightThemeFactory();
        Application lightApp = new Application(lightFactory);
        lightApp.paint();
        ThemeFactory darkFactory = new DarkThemeFactory();
        Application darkApp = new Application(darkFactory);
        darkApp.paint();
    }
}