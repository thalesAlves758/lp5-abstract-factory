import java.util.List;

public class Layout {
    private List<Button> buttons;
    private List<TextBox> textBoxes;

    public Layout(AbstractFactory factory) {
        this.buttons = factory.createButtons();
        this.textBoxes = factory.createTextBoxes();
    }

    public List<String> renderButtons() {
        return buttons.stream().map(Button::create).toList();
    }

    public List<String> renderTextBoxes() {
        return textBoxes.stream().map(TextBox::create).toList();
    }
}
