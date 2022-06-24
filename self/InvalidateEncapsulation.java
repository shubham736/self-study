package self;

public class InvalidateEncapsulation {
        private int x = 1;

        Inner getInner() {
            Inner inner = new Inner();
            return inner;
        }

        class Inner {
            int getX() {
                return x;
            }
        }
}
class Ideone
{
    public static void main (String[] args) throws java.lang.Exception
    {
        InvalidateEncapsulation outer = new InvalidateEncapsulation();
        InvalidateEncapsulation.Inner inner = outer.getInner();
        System.out.println("Private x: "+inner.getX());
    }
}
