package homework_48;

public class Rectangle {

  private final int length; // длина // неизменяемое значение, хотите новое - создайте новый объект
  private final int width; // ширина // неизменяемое значение, хотите новое - создайте новый объект
//  private final int height; // обычно в программировании ширина и высота, но у нас геометрия,
  // где длина и ширина

  public Rectangle(int a, int b) {
    // в моей программе ширина всегда меньше длины
    // это геометрия, а не дизайн, тогда прямоугольники можно вращать без последствий
    length = Math.max(a, b);
    width = Math.min(a, b);
  }

  public int getLength() {
    return length;
  }

  public int getWidth() {
    return width;
  }
}
