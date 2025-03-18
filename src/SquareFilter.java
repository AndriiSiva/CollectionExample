public class SquareFilter implements Filter{
    @Override
    public Object apply(Object o) {
        Integer number = (Integer) o;
        return number * number;
    }
}
