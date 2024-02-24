package buttons;

/**
 * HTML button implementation.
 */
public class HtmlButton implements Button {

    public void render() {
        System.out.println("<button>Test buttons.Button</button>");
        onClick();
    }

    public void onClick() {
        System.out.println("Click! buttons.Button says - 'Hello World!'");
    }
}