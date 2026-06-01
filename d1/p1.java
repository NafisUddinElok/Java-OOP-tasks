import java.util.Scanner;

class triangle{
    double base, height;

    double side1, side2, side3;

    double side;

    
    triangle(double side){
        this.side = side;
    }
    
    triangle(double s1, double s2, double s3){
        side1 = s1;
        side2 = s2;
        side3 = s3;
    }

    
    triangle(double b, double h){
        base = b;
        height = h;
    }

    public double area() {
        
        if(base != 0 && height != 0) {
            return 0.5 * base * height;
        } 
        else if (side1 != 0 && side2 != 0 && side3 != 0) {
            double s = (side1 + side2 + side3) / 2;
            return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        }
        else if(side != 0) {
            return (Math.sqrt(3) / 4) * Math.pow(side, 2);
        }
        else {
            return 0; 
        }
    }

}

class ball{
    double radius;
    double pi = 3.14159;
    ball(double r){
        radius = r;
    }
    public double volume() {
        return (4.0/3.0) * pi * Math.pow(radius, 3);
    }   
}

class circle{
    double radius;
    double pi = 3.14159;
    circle(double r){
        radius = r;
    }
    public double area() {
        return pi * Math.pow(radius, 2);
    }
}

public class p1{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        
        triangle t1;
        System.out.print("Enter the base and height of the triangle: ");
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        t1 = new triangle(base, height);
        System.out.println("Area of the triangle is: " + t1.area());


        triangle t2;
        System.out.print("Enter the three sides of the triangle: ");
        double s1 = sc.nextDouble();
        double s2 = sc.nextDouble();
        double s3 = sc.nextDouble();
        t2 = new triangle(s1, s2, s3);
        System.out.println("Area of the triangle is: " + t2.area());    


        triangle t3;
        System.out.print("Enter the side of the equilateral triangle: ");
        double side = sc.nextDouble();
        t3 = new triangle(side);
        System.out.println("Area of the triangle is: " + t3.area());


        ball b;
        System.out.print("Enter the radius of the ball: ");
        double radius = sc.nextDouble();
        b = new ball(radius);
        System.out.println("Volume of the ball is: " + b.volume()); 


        circle c;
        System.out.print("Enter the radius of the circle: ");
        double cRadius = sc.nextDouble();
        c = new circle(cRadius);
        System.out.println("Area of the circle is: " + c.area());   


        int num;
        System.out.print("Enter a number to check if it is even or odd: ");
        num = sc.nextInt();
        if(num % 2 == 0) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }


        int a;
        System.out.print("Enter a number to check if it is positive, negative or zero: ");
        a = sc.nextInt();
        if(a > 0) {
            System.out.println(a + " is positive.");
        } else if(a < 0) {
            System.out.println(a + " is negative.");
        } else {
            System.out.println(a + " is zero.");
        }


        int grade;
        System.out.print("Enter a grade : ");
        grade = sc.nextInt();
        if(grade >= 90) {
            System.out.println("Grade: A+");
        } else if(grade >= 80){
            System.out.println("Grade: A");
        } else if(grade >= 70){
            System.out.println("Grade: A-");
        } else if(grade >= 60){
            System.out.println("Grade: B");
        } else if(grade >= 40){
            System.out.println("Grade: C+");
        } else {
            System.out.println("Grade: F");
        }


        // building a simple calculator
        double num1, num2;
        char operator;
        System.out.print("Enter first number: ");
        num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        num2 = sc.nextDouble();
        System.out.print("Enter an operator: ");
        operator = sc.next().charAt(0);
        if(operator == '+') {
            System.out.println("Result: " + (num1 + num2));
        } else if(operator == '-') {
            System.out.println("Result: " + (num1 - num2));
        } else if(operator == '*') {
            System.out.println("Result: " + (num1 * num2));
        } else if(operator == '/') {
            if(num2 != 0) {
                System.out.println("Result: " + (num1 / num2));
            } else {
                System.out.println("Error: Division by zero");
            }
        } else {
            System.out.println("Invalid operator");
        }
        
    }
}