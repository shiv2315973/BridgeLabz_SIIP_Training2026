public class CircleExample {
    static class Circle {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        public double area() {
            return Math.PI * radius * radius;
        }

        public double circumference() {
            return 2 * Math.PI * radius;
        }

        public void display() {
            System.out.printf("Circle (radius=%.2f) - Area: %.4f, Circumference: %.4f\n", radius, area(), circumference());
        }
    }

    public static void main(String[] args) {
        Circle c = new Circle(5.0);
        c.display();
    }
}
