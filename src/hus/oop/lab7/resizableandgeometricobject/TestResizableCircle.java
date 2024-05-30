package hus.oop.lab7.resizableandgeometricobject;

public class TestResizableCircle {
    public static void main(String[] args) {
        GeometricObject geometricObject = new ResizableCircle(2.5);
        System.out.println(geometricObject.getArea());
        System.out.println(geometricObject.getPerimeter());

        ResizableCircle resizableCircle = (ResizableCircle) geometricObject;
        System.out.println(resizableCircle.resize(44));
        System.out.println(resizableCircle);
    }
}
