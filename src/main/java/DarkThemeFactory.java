import java.util.ArrayList;
import java.util.List;

public class DarkThemeFactory implements AbstractFactory {

    @Override
    public List<Button> createButtons() {
        List<Button> buttons = new ArrayList<>();
        buttons.add(new DarkThemeButton());
        return buttons;
    }

    @Override
    public List<TextBox> createTextBoxes() {
        List<TextBox> textBoxes = new ArrayList<>();
        textBoxes.add(new DarkThemeTextBox());
        return textBoxes;
    }
}
