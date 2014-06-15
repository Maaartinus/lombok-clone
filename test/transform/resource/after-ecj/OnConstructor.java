import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
@Target(ElementType.PARAMETER) @interface MyAnnotation {
  String value();
}
public @lombok.AllArgsConstructor class OnConstructor {
  int x;
  public @java.beans.ConstructorProperties({"x"}) @java.lang.SuppressWarnings("all") OnConstructor(final @MyAnnotation("An eggs") int x) {
    super();
    this.x = x;
  }
}
@lombok.AllArgsConstructor @lombok.RequiredArgsConstructor class OnConstructor2 {
  @lombok.NonNull String blue;
  @lombok.NonNull String red;
  String black;
  public @java.beans.ConstructorProperties({"blue", "red", "black"}) @java.lang.SuppressWarnings("all") OnConstructor2(final @lombok.NonNull @MyAnnotation("colored") String blue, final @lombok.NonNull @MyAnnotation("colored") String red, final String black) {
    super();
    if ((blue == null))
        {
          throw new java.lang.NullPointerException("blue");
        }
    if ((red == null))
        {
          throw new java.lang.NullPointerException("red");
        }
    this.blue = blue;
    this.red = red;
    this.black = black;
  }
  public @java.beans.ConstructorProperties({"blue", "red"}) @java.lang.SuppressWarnings("all") OnConstructor2(final @lombok.NonNull @MyAnnotation("colored") String blue, final @lombok.NonNull @MyAnnotation("colored") String red) {
    super();
    if ((blue == null))
        {
          throw new java.lang.NullPointerException("blue");
        }
    if ((red == null))
        {
          throw new java.lang.NullPointerException("red");
        }
    this.blue = blue;
    this.red = red;
  }
}
