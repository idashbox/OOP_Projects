package task12_builder_bridge.color;

public class GreenColor implements ColorImplementor {
    @Override
    public String applyColor() {
        return "\u001B[32m";
    }
}