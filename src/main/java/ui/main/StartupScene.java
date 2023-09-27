package ui.main;

import jakarta.inject.Qualifier;

import java.lang.annotation.*;

@Qualifier
@Target({ ElementType.TYPE, ElementType.METHOD, ElementType.PARAMETER, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface StartupScene {

}
