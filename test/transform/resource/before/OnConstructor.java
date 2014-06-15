import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.PARAMETER) @interface MyAnnotation {
	String value();
}

@lombok.AllArgsConstructor public class OnConstructor {
	@lombok.experimental.OnConstructor(onParam=@__(@MyAnnotation("An eggs")))
	int x;
	String s;
}
