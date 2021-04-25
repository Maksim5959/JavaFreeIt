package Annotation;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class SearchAnnotationProgram {

    public static void testMyService(MyService service) throws Exception {

        Class clazz = Class.forName(MyService.class.getName());

        if (clazz.isAnnotationPresent(Version.class)) {
            service = (MyService) clazz.newInstance();

            Field field = service.getClass().getDeclaredField("nameProduct");
            field.setAccessible(true);
            field.set(service,"Car");

            field = service.getClass().getDeclaredField("countProducts");
            field.setAccessible(true);
            field.set(service,5);

            field = service.getClass().getDeclaredField("price");
            field.setAccessible(true);
            field.set(service,50385.68);

            Method method = service.getClass().getDeclaredMethod("thisClassInfo");
            method.setAccessible(true);
            method.invoke(service);
        }
    }
}
