package Annotation.Custom_annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone {
    String calling() default "voice call";
    int version() default 5;
}

@SmartPhone
public class CustomAnnotation {
    int model = 9;
}
