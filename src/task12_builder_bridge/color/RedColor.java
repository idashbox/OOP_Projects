package task12_builder_bridge.color;

public class RedColor implements ColorImplementor {
    @Override
    public String applyColor() {
        return "\u001B[31m";
    }
}