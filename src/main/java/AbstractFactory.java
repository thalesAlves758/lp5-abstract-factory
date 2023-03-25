import java.util.List;

public interface AbstractFactory {
    List<Button> createButtons();
    List<TextBox> createTextBoxes();
}
