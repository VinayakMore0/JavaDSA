package L3SwitchSt;

import java.util.Scanner;

public class L3Quesion1 {
    public static void main(String[] args) {



        Scanner scn = new Scanner(System.in);


        //Q1
//        System.out.println("Enter an integer: ");
//        int num = scn.nextInt();
//
//        if(num%2 == 0){
//            System.out.println("Even");
//        }else {
//            System.out.println("Odd");
//        }

        //Q2
//        int a = scn.nextInt();
//        int b = scn.nextInt();
//        int c = scn.nextInt();
//
//        int tot = a+b+c;
//
//        if(a>0 && b>0 && c>0){
//            if(tot == 180){
//                System.out.println("Valid Triangle");
//            }else{
//                System.out.println("Invalid Triangle");
//            }
//        }else{
//            System.out.println("invalid Triangle");
//        }

        //Q3
//        int year = scn.nextInt();
//
//        if(year%4 == 0){
//            if(year%100 == 0){
//                if(year%400 == 0){
//                    System.out.println("Not Leap Year");
//                }else {
//                    System.out.println("Leap Year");
//                }
//            }else {
//                System.out.println("Leap Year");
//            }
//        }else {
//            System.out.println("Not Leap Year");
//        }
//
//        //OR
//        int year2 = scn.nextInt();
//
//        if((year2%4==0 && year2%100!=0) || (year2%400==0)){
//            System.out.println("Leap Year");
//        }else{
//            System.out.println("Not Leap Year");
//        }

        //Q4
//        int x = scn.nextInt();
//        int y = scn.nextInt();
//        int z = scn.nextInt();
//
//        if(x>=y && x>=z){
//            System.out.println(x);
//        } else if (y>=x && y>=z) {
//            System.out.println(y);
//        }else{
//            System.out.println(z);
//        }

//        //Q5
//        int side1 = scn.nextInt();
//        int side2 = scn.nextInt();
//        int side3 = scn.nextInt();
//
//        if(side1 == side2 && side2 == side3){
//            System.out.println("Equilateral Triangle");
//        }else if(side1 == side2 || side2 == side3){
//            System.out.println("Isosceles Triangle");
//        }else{
//            System.out.println("scalene");
//        }

//        //Q6
//        System.out.println("Enter year");
//        int year = scn.nextInt();
//        System.out.println("Enter Month according to table");
//        int month = scn.nextInt();
//        System.out.println("Enter Date");
//        int date = scn.nextInt();
//
//        int yearLastDigit = year%100;
//        int oneQuarter = yearLastDigit/4;
//
//        int sum0 = yearLastDigit+oneQuarter+month+date;
//
//       if(year>1753){
//           if(1753<year && year>1800){
//               sum0 += 4;
//           }else if(1800<year && year>1900) {
//               sum0 += 2;
//           }else if(2000<year && year>2099){
//               sum0 -= 1;
//           }else{
//               System.out.println("It doesn't work in this circumstances ");
//           }
//       }else {
//           System.out.println("Doesn't work before 1753");
//       }
//
//        int day = sum0%7;
//
//       switch (day){
//           case(0):
//               System.out.println("Saturday");
//               break;
//           case(1):
//               System.out.println("Sunday");
//               break;
//           case(2):
//               System.out.println("Monday");
//               break;
//           case(3):
//               System.out.println("Tuesday");
//               break;
//           case(4):
//               System.out.println("Wednesday");
//               break;
//           case(5):
//               System.out.println("Thusday");
//               break;
//           case(6):
//               System.out.println("Friday");
//               break;
//           default:
//               System.out.println("Something went Wrong");
//               break;
//       }




    }
}
