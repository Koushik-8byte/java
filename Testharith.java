import java.util.*;
import Harith.Harith;
 class Testharith
 {
 public static void main(String[] args){
 Scanner sc=new Scanner(System.in);
 System.out.print("Enter the first number:");
 int a= sc.nextInt();
 float d=a;
 System.out.print("Enter the second number:");
 int b=sc.nextInt();
 float f=b;
 Harith h= new Harith(d,f);
 h.add();
 h.sub();
 h.mul();
 h.division();
 }
 }
 