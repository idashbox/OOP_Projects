package task12_builder_bridge.color;

// Конкретная абстракция 1
public class FreshColor extends Color {
    public FreshColor(ColorImplementor colorImplementor) {
        super(colorImplementor);
    }

    @Override
    public String getColorCode() {

        return colorImplementor.applyColor();
    }

    @Override
    public String colorizeText(String text, String colorCode) {
        return colorCode + text + "\u001B[0m";
    }
}