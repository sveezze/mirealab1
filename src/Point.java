class Point {
    private double x;
    private double y;

    // Конструктор
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Методы аксессоры
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}

class Circle {
    private Point center;
    private double radius;

    // Конструктор
    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }
}

class Tester {
    public static void main(String[] args) {
        Circle[] circles = new Circle[5];

        // Инициализация массива объектов Circle

        // Пример использования методов или вывода информации
    }
}