import java.util.ArrayList;
import java.util.List;

public class LightThemeFactory implements AbstractFactory {

    @Override
    public List<Button> createButtons() {
        List<Button> buttons = new ArrayList<>();
        buttons.add(new LightThemeButton());
        return buttons;
    }

    @Override
    public List<TextBox> createTextBoxes() {
        List<TextBox> textBoxes = new ArrayList<>();
        textBoxes.add(new LightThemeTextBox());
        return textBoxes;
    }
}
