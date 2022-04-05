package practice.project.p1;

import java.util.Scanner;
public class Calculator {
public static void main(String[] args) {
double n1,n2;
double ans;
Scanner sc = new Scanner(System.in);
double q = 0;
do {

System.out.println("1. + for ADDITION");
System.out.println("2. - for SUBTRACTION");
System.out.println("3. * for MULTIPLICATION");
System.out.println("4. / for DIVISION");
System.out.println();
System.out.print("Enter your first number:\n");
n1 = sc.nextDouble();

System.out.print("Enter your second number:\n");
n2 = sc.nextDouble();

System.out.print("Enter an operators like (+, -, *, /) only:\n ");

char operator = sc.next().charAt(0);
switch (operator) {
case '+':
ans= n1 + n2;
break;
case '-':
ans = n1 - n2;
break;
case '*':
ans = n1 * n2;
break;
case '/':
ans = n1 / n2;
break;
default:
System.out.printf("Please enter specified operator only");
return;
}
System.out.println("ans="+" "+n1+ " " + operator + " " + n2 + " = " + ans);
} while (ans != q);
sc.close();
}
}
