import java.util.ArrayList;
import java.util.List;

public class FilterExample {

    public static <T> T[] filter(T[] array, Class<? extends Filter> filterClass) {
        try {
            Filter filter = filterClass.getDeclaredConstructor().newInstance();
            List<T> result = new ArrayList<>();

            for (T item : array) {
                result.add((T) filter.apply(item));
            }

            return result.toArray((T[]) java.lang.reflect.Array.newInstance(
                    array.getClass().getComponentType(), result.size()));

        } catch (Exception e) {
            throw new RuntimeException("Failed to instantiate filter", e);
        }
    }
}