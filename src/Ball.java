public class Ball {
    private double x;
    private double y;

    // Конструктор
    public Ball(double x, double y) {
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

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Метод для движения мяча
    public void move(double xDisp, double yDisp) {
        x += xDisp;
        y += yDisp;
    }

    // Метод для вывода информации о мяче
    @Override
    public String toString() {
        return "Ball[x=" + x + ",y=" + y + "]";
    }
}
