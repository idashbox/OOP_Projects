package task12_builder_bridge.color;

// Конкретная реализация 1 - зеленый цвет
public class GreenColor implements ColorImplementor {
    @Override
    public String applyColor() {
        return "\u001B[32m";
    }
}