package factory;

/**
 * Created by shinkook.kim on 2018-04-09.
 * WriterFactory : write File for account
 */
public class WriterFactory {
    public Object createWriterFactory(String classInfo) {
        try {
            return Class.forName(classInfo).newInstance();
        } catch (Exception e) {
            return null;
        }
    }
}
