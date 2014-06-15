import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.PARAMETER)
@interface MyAnnotation {

	String value();
}
public class OnConstructor {
	@lombok.experimental.OnConstructor
	int x;
	String s;

	@java.beans.ConstructorProperties({"x", "s"})
	@java.lang.SuppressWarnings("all")
	public OnConstructor(@MyAnnotation("An eggs") final int x, final String s) {
		this.x = x;
		this.s = s;
	}
}
