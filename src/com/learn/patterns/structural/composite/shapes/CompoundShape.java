package com.learn.patterns.structural.composite.shapes;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class CompoundShape extends BaseShape {

    protected List<Shape> children = new ArrayList<>();

    public CompoundShape(Shape... components) {
        super(0, 0, Color.BLACK);
        add(components);
    }

    public void add(Shape component) {
        children.add(component);
    }

    public void add(Shape... components) {
        children.addAll(Arrays.asList(components));
    }

    public void remove(Shape child) {
        children.remove(child);
    }

    public void remove(Shape... components) {
        children.removeAll(Arrays.asList(components));
    }

    public void clear() {
        children.clear();
    }

    @Override
    public int getX() {
        return children.stream()
                .mapToInt(Shape::getX)
                .min()
                .orElse(0);
    }

    @Override
    public int getY() {
        return children.stream()
                .mapToInt(Shape::getY)
                .min()
                .orElse(0);
    }

    @Override
    public int getWidth() {
        int x = getX();
        return children.stream()
                .mapToInt(child -> child.getX() + child.getWidth() - x)
                .max()
                .orElse(0);
    }

    @Override
    public int getHeight() {
        int y = getY();
        return children.stream()
                .mapToInt(child -> child.getY() + child.getHeight() - y)
                .max()
                .orElse(0);
    }

    @Override
    public void move(int x, int y) {
        children.forEach(child -> child.move(x, y));
    }

    @Override
    public boolean isInsideBounds(int x, int y) {
        return children.stream()
                .anyMatch(child -> child.isInsideBounds(x, y));
    }

    @Override
    public void unSelect() {
        super.unSelect();
        children.forEach(Shape::unSelect);
    }

    public boolean selectChildAt(int x, int y) {
        Optional<Shape> shape = children.stream()
                .filter(child -> child.isInsideBounds(x, y))
                .findFirst();
        if (shape.isPresent()) {
            shape.get().select();
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void paint(Graphics graphics) {
        if (isSelected()) {
            enableSelectionStyle(graphics);
            graphics.drawRect(getX() - 1, getY() - 1, getWidth() + 1, getHeight() + 1);
            disableSelectionStyle(graphics);
        }
        children.forEach(shape -> shape.paint(graphics));
    }
}
