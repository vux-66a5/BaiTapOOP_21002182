package lab07.resizeableandgeometricobject;

public class ResizableCircle1 extends Circle1 implements Resizable1 {
    public ResizableCircle1(double radius) {
        super(radius);
    }

    public String toString() {
        return "ResizableCircle1[" + super.toString() + "]";
    }

    @Override
    public void resize(int percent) {
        this.radius *= percent / 100.0;
    }

}
