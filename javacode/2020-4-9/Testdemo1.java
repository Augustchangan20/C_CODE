import java.util.Scanner;
public class Testdemo1{
                 public static void main(String [] args) {
					 /* int i=10;
					 i = i++;
					 System.out.println(i); */
					 
					 
					/*  int a = 10; 
					 int b = 20;
					 int c = 30;
					 System.out.println(a < b && b < c);  */
					 
					 
					/*  int a = 10; 
					 int b = 20;
					/*  System.out.println(!a < b); */  //!只能作用于boolean
				/* 	 boolean flg = true;
					 System.out.println(!flg); */ 
					 
				/* 	 int a = 10; 
					 int b = 20; 
					 System.out.println(a & b);
					 System.out.println(a | b);
					 System.out.println(a ^ b);
					 System.out.println(~a);     //-11，按位取反后的补码
					 System.out.println(~b); */
					 
					 /* int a = 0xf; 
					 System.out.printf("%x\n", ~a); */
					 
					 
					 // int a = 0xffffffff;
					 // System.out.printf("%x\n", a >>> 1);  //没有无符号左移
					 
					 
					 // Scanner scan = new Scanner(System.in);
					 // int a = scan.nextInt();
					 
					 // System.out.println(str);
					 
					int num = 5;
					int sum = 0;
					int i = 1;
                    int ret = 1;
                    while(i <= num) {
                    ret *= i;
					sum += ret;
					i++;
					}
					 System.out.println(sum);
				    } 
					}
					 