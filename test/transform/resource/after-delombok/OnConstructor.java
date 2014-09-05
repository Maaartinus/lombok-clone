import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.PARAMETER)
@interface MyAnnotation {

	String value();
}
public class OnConstructor {
	@lombok.experimental.OnConstructor
	int x;

	@java.beans.ConstructorProperties({"x"})
	@java.lang.SuppressWarnings("all")
	public OnConstructor(@MyAnnotation("An eggs") final int x) {
		this.x = x;
	}
}
class OnConstructor2 {
	@lombok.experimental.OnConstructor
	@lombok.NonNull
	String blue;
	@lombok.experimental.OnConstructor
	@lombok.NonNull
	String red;
	String black;

	@java.beans.ConstructorProperties({"blue", "red", "black"})
	@java.lang.SuppressWarnings("all")
	public OnConstructor2(@lombok.NonNull @MyAnnotation("colored") final String blue, @lombok.NonNull final String red, final String black) {
		if (blue == null) {
			throw new java.lang.NullPointerException("blue");
		}
		if (red == null) {
			throw new java.lang.NullPointerException("red");
		}
		this.blue = blue;
		this.red = red;
		this.black = black;
	}

	@java.beans.ConstructorProperties({"blue", "red"})
	@java.lang.SuppressWarnings("all")
	public OnConstructor2(@lombok.NonNull final String blue, @lombok.NonNull final String red) {
		if (blue == null) {
			throw new java.lang.NullPointerException("blue");
		}
		if (red == null) {
			throw new java.lang.NullPointerException("red");
		}
		this.blue = blue;
		this.red = red;
	}
}
