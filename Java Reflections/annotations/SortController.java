package annotations;


import java.lang.annotation.*;
import 

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface SortController{
	
	String strategy;

}
