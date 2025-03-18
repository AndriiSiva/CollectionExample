import java.util.ArrayList;
import java.util.List;

public class FilterExample {

    public static <T> T[] filter(T[] array, Class<? extends Filter> filterClass) {

        List<T> resultList = new ArrayList<>();

        try {
            Filter filter = filterClass.getDeclaredConstructor().newInstance();
            for (T item : array) {
                Object result = filter.apply(item);
                if (result != null) {
                    resultList.add((T) result);
                }
            }
        } catch (Exception e) {
            throw new RuntimeException("Ошибка при создании экземпляра фильтра", e);
        }

        T[] resultArray = (T[]) java.lang.reflect.Array.newInstance(array.getClass().getComponentType(), resultList.size());
        for (int i = 0; i < resultList.size(); i++) {
            resultArray[i] = resultList.get(i);
        }

        return resultArray;
    }
}


