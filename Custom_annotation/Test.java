package Custom_annotation;

import java.lang.annotation.Annotation;

public class Test {
    public static void main(String[] args) {
        CustomAnnotation t = new CustomAnnotation();
        System.out.println(t.model);
        Class obj = t.getClass();
        Annotation a = obj.getAnnotation(SmartPhone.class);
        SmartPhone s = (SmartPhone) a;
        System.out.println(s.calling());
        System.out.println(s.version());
    }
}

