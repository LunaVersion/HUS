package hus.oop.lab11.visitorpattern.pseudocode;

import java.util.ArrayList;
import java.util.List;

public class CompoundShape implements Shape{
    public int id;
    public List<Shape> children = new ArrayList<>();

    public CompoundShape(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public void move(int x, int y) {

    }

    @Override
    public void draw() {

    }

    @Override
    public String accept(Visitor v) {
        return v.visitCompoundShape(this);
    }

    public void add(Shape shape) {
        children.add(shape);
    }
}
