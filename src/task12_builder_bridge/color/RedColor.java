package task12_builder_bridge.color;

// Конкретная реализация 2 - красный цвет
public class RedColor implements ColorImplementor {
    @Override
    public String applyColor() {
        return "\u001B[31m";
    }
}