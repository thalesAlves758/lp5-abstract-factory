public class LightThemeButton implements Button {

    @Override
    public String create() {
        return "Button of Light theme was rendered";
    }

    @Override
    public String onClick() {
        return "Button of Light theme was clicked";
    }
}
