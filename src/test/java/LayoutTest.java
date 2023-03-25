import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LayoutTest {

    @Test
    void shouldRenderLightThemeButtons() {
        AbstractFactory factory = new LightThemeFactory();
        Layout layout = new Layout(factory);
        assertTrue(layout.renderButtons() instanceof List<String>);
        assertEquals("Button of Light theme was rendered", layout.renderButtons().get(0));
    }

    @Test
    void shouldRenderLightTextBoxes() {
        AbstractFactory factory = new LightThemeFactory();
        Layout layout = new Layout(factory);
        assertTrue(layout.renderTextBoxes() instanceof List<String>);
        assertEquals("Textbox of Light theme was rendered", layout.renderTextBoxes().get(0));
    }

    @Test
    void shouldRenderDarkThemeButtons() {
        AbstractFactory factory = new DarkThemeFactory();
        Layout layout = new Layout(factory);
        assertTrue(layout.renderButtons() instanceof List<String>);
        assertEquals("Button of Dark theme was rendered", layout.renderButtons().get(0));
    }
}
