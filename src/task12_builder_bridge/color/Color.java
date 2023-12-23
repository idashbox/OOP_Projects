package task12_builder_bridge.color;

public abstract class Color {
    protected ColorImplementor colorImplementor;

    public Color(ColorImplementor colorImplementor) {
        this.colorImplementor = colorImplementor;
    }

    public abstract String getColorCode();
    public abstract String colorizeText(String text, String colorCode);
}