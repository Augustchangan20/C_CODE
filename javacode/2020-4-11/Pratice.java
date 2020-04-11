import java.util.Scanner;
public class Pratice{
                    public static void main(String [] args) {
					// int age = 10;
					// int age =scan.nextInt();
					// if (age < 18){
						// System.out.println("少年");
					// }
					// else if (age >= 18 && age < 28){
						// System.out.println("青年");
					// }
					// else if (age >= 28 && age < 55){
						// System.out.println("中年");
					// }
					// else {
						// System.out.println("老年");
						
						//找到第一个即能被三又能被五整除的数
						// Scanner scan = new Scanner(System.in);
						// int num = scan.nextInt();
						// // while (num <= 100){
						// while (num <= 100){
							// if (num % 15 == 0){
								// System.out.println(num);
								// // break;//提前结束循环，可以在switch和循环中使用
								// continue;//continue结束本趟循环，只能在循环中使用
							// }
							// System.out.println("hhhhh");
							// num++;
						// }
					// }
					
					
						// int i = 1;
						// for(;i <= 10;i++){
						// System.out.println(i);
						// }
						
						
						// for(byte i =0;i<=130;i++){
							 // System.out.println(i);//-128 - 127之间死循环
						// }
						
						
						// Scanner scan = new Scanner(System.in);
						// int num = scan.nextInt();
						// int sum = 0;
						// for (int j = 1;j <= num;j++){
							// int ret = 1;
							// for(int i = 1;i <= j;i++){
								// ret *= i;
							// }
							// sum += ret;		
						// }
						// System.out.println("sum = " ); 
						// System.out.println("sum = " + sum); 
					    // }
						
						
						
						//判断素数
						Scanner scan = new Scanner(System.in);
						int n = scan.nextInt();
						for (int i = 2;i < n;i++){
							if(n % i == 0){
								System.out.println(n+"不是素数");
								break;
							}
							else {
								System.out.println("是素数");
							}
						}
						}
						}
						
						
					 