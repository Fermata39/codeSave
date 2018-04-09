package factory;

/**
 * Created by shinkook.kim on 2018-04-09.
 */
public class WriterFactory {
    public Object createFactory(String classInfo) {
        try {
            Object object = classInfo.getClass().newInstance();
            return object;
        }catch (Exception e){
            return null;
        }

    }
}
