public class ExtendedClass {
    private byte b;
    private int i;
    private double d;
    private String s;

    @Override
    public int hashCode() {
        return b * 10 + (int) d * 100 + i + s.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (obj == null || obj.getClass() != this.getClass())
            return false;
        ExtendedClass ex = (ExtendedClass) obj;
        return b == ex.b && i == ex.i && d == this.d &&
                ex.s != null && s.equals(s);
    }

    @Override
    public String toString() {
        return "ExtendedClass [b=" + b +
                "i= " + i +
                "d= " + d +
                "s= " + s + "]";
    }
}
