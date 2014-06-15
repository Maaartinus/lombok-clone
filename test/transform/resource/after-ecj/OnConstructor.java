import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
@Target(ElementType.PARAMETER) @interface MyAnnotation {
  String value();
}
public @lombok.AllArgsConstructor class OnConstructor {
  @lombok.experimental.OnConstructor() int x;
  String s;
  public @java.beans.ConstructorProperties({"x", "s"}) @java.lang.SuppressWarnings("all") OnConstructor(final @MyAnnotation("An eggs") int x, final String s) {
    super();
    this.x = x;
    this.s = s;
  }
}
