package shapes;

import java.util.Scanner;

public class Shapes {

    public static void main(String[] args) {

        boolean loop = true;

        while (loop) {

            Scanner scan = new Scanner(System.in);

            //Frågar användaren vilken figur som denne vill räkna ut
            System.out.println("Which figure do you want to calculate\n" + "\n1.Circle\n2.Rectangle\n3.Triangel");
            int svarFigur = scan.nextInt(); //Svaret deklareras i en variabel
            scan.nextLine();

            //switch 
            switch (svarFigur) {
                case 1:
                    System.out.println("Do you want to calculate the Circles area or the circumference?");
                    String svarCircle = scan.nextLine();//Svaret deklareras i en variabel

                    //Om användaren väljer "area"
                    if (svarCircle.equalsIgnoreCase("area")) {
                        System.out.println();
                        System.out.println("Enter a value for the radius");//Användaren matar in ett värde för radius
                        double svarArea = scan.nextDouble();//Svaret deklareras i en variabel
                        Circle circleArea = new Circle(svarArea);
                        System.out.println();
                        System.out.println("The Circles area with the radius " + circleArea.getRadius() + " is " + circleArea.area());
                        System.out.println();

                        //Om user vill fortsätta igen
                        System.out.println("Do you want to calculate another figur, y/n?");
                        scan.nextLine();
                        String input = scan.nextLine();//Svaret deklareras i en variabel

                        if (input.equalsIgnoreCase("y")) {
                        }//Om användaren väljer att fortsätta då börjar programmet om
                        else { //Om användaren väljer att sluta då avslutas programmet
                            loop = false;
                            System.out.println("Welcome back!");
                        }//Slut på programmet

                        //Om användaren väljer "circumference"                                                                       
                    } else if (svarCircle.equalsIgnoreCase("circumference")) {
                        System.out.println();
                        System.out.println("Enter a value for the radius to calculate the circumference");
                        double svarCf = scan.nextDouble();
                        Circle circleC = new Circle(svarCf);
                        System.out.println();
                        System.out.println("The Circles circumference with the radius " + circleC.getRadius() + " is " + circleC.circumference());
                        System.out.println();

                        //Om användaren vill forstätta en gång till
                        System.out.println("Do you want to calculate another figure? y/n");
                        scan.nextLine();
                        String input = scan.nextLine();

                        if (input.equalsIgnoreCase("y")) {//Om användaren väljer att forstätta
                        } else {//Om användaren väljer att inte forstätta
                            loop = false;
                            System.out.println("Welcome back");
                        }//Slut på programmet

                    }

                    break;//Slut på Case 1

                case 2:
                    System.out.println("Do you want to calculate the Rectangles area or the circumference?");
                    String svarRectangle = scan.nextLine();

                    if (svarRectangle.equalsIgnoreCase("area")) {
                        System.out.println();
                        System.out.println("Enter a value for the Length and one value for the Width");
                        double svarRL = scan.nextDouble();
                        double svarRW = scan.nextDouble();
                        Rectangle recLW = new Rectangle(svarRL, svarRW);
                        System.out.println();
                        System.out.println("The area of the Rectangle with the length: " + svarRL + " and width " + svarRW + " is " + recLW.area());
                        System.out.println();

                        System.out.println("Do you want to calculate another figure y/n?");
                        scan.nextLine();
                        String input = scan.nextLine();
                        if (input.equalsIgnoreCase("y")) {
                        } else {
                            loop = false;
                            System.out.println("Welcome back!");
                        }

                    } else if (svarRectangle.equalsIgnoreCase("circumference")) {
                        System.out.println();
                        System.out.println("Enter a values for the length and a values for the width");
                        double svarRL1 = scan.nextDouble();
                        double svarRW1 = scan.nextDouble();
                                                
                        Rectangle recLW12 = new Rectangle(svarRW1,svarRL1);
                        
                        System.out.println();
                        System.out.println("The Rectangles circumference with the length " + svarRL1 + " and width " + svarRW1 + " is " + recLW12.circumference());
                        System.out.println();

                        System.out.println("Do you want to calculate another figure y/n?");
                        scan.nextLine();
                        String input = scan.nextLine();

                        if (input.equalsIgnoreCase("y")) {
                        } else {
                            loop = false;
                            System.out.println("Welcome back!");
                        }

                    }
                    break;//Case 2 slut
                case 3:
                    System.out.println("Do you want to calculate the Triangles area or the circumference");
                    String svarTriangle = scan.nextLine();

                    if (svarTriangle.equalsIgnoreCase("area")) {
                        System.out.println("Enter a value for the base and a value for the height");
                        double svarTB = scan.nextDouble();
                        double svarTH = scan.nextDouble();
                        Triangle triBH = new Triangle(svarTB, svarTH);
                        System.out.println();
                        System.out.println("The area of the Triangle with the base " + svarTB + " and the heigth "
                                + svarTH + " is " + triBH.area());
                        System.out.println();

                        System.out.println("Do you want to calculate another figure y/n?");
                        scan.nextLine();
                        String input = scan.nextLine();
                        if (input.equalsIgnoreCase("y")) {
                        } else {
                            loop = false;
                            System.out.println("Welcome back!");
                        }
                    } else if (svarTriangle.equalsIgnoreCase("circumference")) {
                        System.out.println("Enter a value for the side1, a value for side2 and a value for side3");
                        double svarTs1 = scan.nextDouble();
                        double svarTs2 = scan.nextDouble();
                        double svarTs3 = scan.nextDouble();
                        Triangle tri123 = new Triangle(svarTs1, svarTs2, svarTs3);
                        System.out.println();
                        System.out.println("The circumference of the triangle with the side1 " + svarTs1 + " ,the side2 " + svarTs2
                                + " and the side3 " + svarTs3 + " is " + tri123.circumference());
                        System.out.println();

                        System.out.println("Do you want to calculate another figure y/n?");
                        scan.nextLine();
                        String input = scan.nextLine();
                        if (input.equalsIgnoreCase("y")) {
                        } else {
                            loop = false;
                            System.out.println("Welcome back!");
                        }

                    }

                    break;//case 3 slut
                default:
                    System.out.println("Enter a valid number!");

                    break;

            }

        }
        //double number = sc.nextDouble();
        //Circle cR = new Circle(number);
        //System.out.println(cR.getRadius() +" "+ cR.circumference()+ " " + cR.area());
    }

}
