public abstract class Shape2D {
    public static final double PI = 3.14;
    abstract void getName();
    abstract double getSquare();
    abstract double getPerimeter();
    abstract void getParallelTransfer(int a, int b);
}
class Dot extends Shape2D{
    int x, y;
    Dot (int x, int y){
        this.x = x;
        this.y = y;
    }

    public Dot() {

    }

    @Override
    void getName() {
        System.out.println("This figure is dot");
    }
    @Override
    double getPerimeter() {
        return 0;
    }
    @Override
    double getSquare() {
        return 0;
    }
    @Override
    void getParallelTransfer(int x1, int y1) {
        x+= x1;
        y+= y1;
        System.out.println("After parallel transfer new coordinates of dot are {" + x + ";" + y + "}");
    }
}
class Circle extends Shape2D{
    double r;
    Circle(double r){
        this.r = r;
    }
    @Override
    double getPerimeter(){
        return 2*PI*r;
    }
    @Override
    double getSquare(){
        return PI*r*r;
    }
    @Override
    void getName(){
        System.out.println("This figure is circle");
    }
    @Override
       void getParallelTransfer(int x1, int y1) {
    }
}
class Ellipse extends Shape2D{
    double a, b;
    Ellipse (double a, double b){
        this.a = a;
        this.b = b;
    }
    @Override
    double getPerimeter(){
        return 4*(PI*a*b + (a + b))/(a+b);
    }
    @Override
    double getSquare(){
        return PI * a * b;
    }
    @Override
    void getName() {
        System.out.println("This figure is ellipse");
    }
    @Override
    void getParallelTransfer(int x1, int y1) {
    }
}
class Line extends Shape2D {
    Dot d1 = new Dot();
    Dot d2 = new Dot();
    Line (int x1, int y1, int x2, int y2){
        d1.x = x1;
        d1.y = y1;
        d2.x = x2;
        d2.y = y2;
    }
    @Override
    void getName(){
        System.out.println("This figure is line");
    }
    @Override
    double getSquare() {
        return 0;
    }
    @Override
    double getPerimeter() {
        return 0;
    }
    void getEquation(){
        System.out.println("The equation of line is " + (d1.y-d2.y) + "x + " + (d2.x-d1.x) + "y + " + (d1.x*d2.y - d2.x*d1.y));
    }
    @Override
    void getParallelTransfer(int x1, int y1) {
    }
}
class Polygonal extends Shape2D{
    @Override
    void getName(){
        System.out.println("This figure is polygon");
    }
    @Override
    double getSquare() {
        return 0;
    }
    @Override
    double getPerimeter() {
        return 0;
    }
    @Override
    void getParallelTransfer(int x1, int y1) {
    }
}
class Square extends Shape2D{

    double a;
    Square (double a){
        this.a = a;
    }
    @Override
    void getName(){
        System.out.println("This figure is square");
    }
    @Override
    double getSquare() {
        return a * a;
    }
    @Override
    double getPerimeter() {
        return 4 * a;
    }
    @Override
    void getParallelTransfer(int x1, int y1) {
    }
}
class Rectangle extends Shape2D {
    double a, b;

    Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }
    @Override
    void getName() {
        System.out.println("This figure is rectangle");
    }
    @Override
    double getSquare() {
        return a * b;
    }
    @Override
    double getPerimeter() {
        return (a + b) * 2;
    }
    @Override
    void getParallelTransfer(int x1, int y1) {
    }
}
class Parallelogram extends Shape2D{
    double a, b, alpha;
    Parallelogram (double a, double b, double alpha){
        this.a = a;
        this.b = b;
        this.alpha = alpha;
    }
    @Override
    void getName() {
        System.out.println("This figure is parallelogram");
    }
    @Override
    double getSquare() {
        return a * b;
    }
    @Override
    double getPerimeter() {
        return a * b * Math.sin(alpha);
    }
    @Override
    void getParallelTransfer(int x1, int y1) {
    }
}
class Trapezoid extends Shape2D{
    double a, b, h;
    Trapezoid (double a, double b, double h){
        this.a = a;
        this.b = b;
        this.h = h;
    }
    @Override
    void getName() {
        System.out.println("This figure is trapezoid");
    }
    @Override
    double getSquare() {
        return (a + b) * h / 2;
    }
    @Override
    double getPerimeter() {
        return 0;
    }
    @Override
    void getParallelTransfer(int x1, int y1) {
    }
}
class Rhombus extends Shape2D{
    double a, h;
    Rhombus (double a, double h){
        this.a = a;
        this.h = h;
    }
    @Override
    void getName() {
        System.out.println("This figure is rhombus");
    }
    @Override
    double getSquare() {
        return a * h;
    }
    @Override
    double getPerimeter() {
        return 4 * a;
    }
    @Override
    void getParallelTransfer(int x1, int y1) {
    }
}
class RightTriangle extends Shape2D{
    double a, b;
    RightTriangle (double a, double b){
        this.a = a;
        this.b = b;
    }
    @Override
    void getName() {
        System.out.println("This figure is right triangle");
    }
    @Override
    double getSquare() {
        return a * b / 2;
    }
    @Override
    double getPerimeter() {
        return a + b + Math.sqrt(a * a + b * b);
    }
    @Override
    void getParallelTransfer(int x1, int y1) {
    }
}
class Figuretest {
    public static void main(String[] args) {
        Circle round = new Circle(2);
        System.out.println("Area of circle " + round.getSquare());
        System.out.println("Circumference " + round.getPerimeter());
        round.getName();

        Ellipse e = new Ellipse(2, 4);
        System.out.println("Area of ellipse " + e.getSquare());
        System.out.println("Ellipse length " + e.getPerimeter());
        e.getName();

        Dot d = new Dot(1, 1);
        d.getParallelTransfer(2, 5);
        d.getName();

        Line l = new Line(1, 2, 3, 4);
        l.getName();
        l.getEquation();

        Square s = new Square(6);
        s.getName();
        System.out.println("Area of square " + s.getSquare());
        System.out.println("Perimeter of square " + s.getPerimeter());

        Rectangle r = new Rectangle(4, 8);
        s.getName();
        System.out.println("Area of rectangle " + s.getSquare());
        System.out.println("Perimeter of rectangle " + s.getPerimeter());

        Parallelogram p = new Parallelogram(4, 8, 45);
        p.getName();
        System.out.println("Area of rectangle " + p.getSquare());
        System.out.println("Perimeter of rectangle " + p.getPerimeter());

        Trapezoid t = new Trapezoid(8, 4, 4);
        t.getName();
        System.out.println("Area of trapezoid " + t.getSquare());

        Rhombus rH = new Rhombus(5, 6);
        rH.getName();
        System.out.println("Area of rhombus " + rH.getSquare());
        System.out.println("Perimeter of rhombus " + rH.getPerimeter());

        RightTriangle rT = new RightTriangle(3, 7);
        rT.getName();
        System.out.println("Area of right triange " + rT.getSquare());
        System.out.println("Perimeter of right triangle " + rT.getPerimeter());
    }
}