import java.util.*;
public class Practic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();//18
        int b = scan.nextInt();//2
        int c = b;
        while (a%b != 0) {
            c = a % b;
            a = b;
            b = c;
        }
        System.out.println(c);
    }
}




//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        double sum = 0;
//        int flg = 1;
//        for (int i = 1;i <= n ;i++ ) {
//            sum = sum + 1.0/i * flg;
//            flg = -flg;
//        }
//        System.out.println(sum);
//    }
//}





//    public static void main(String[] args) {
//        for (int n = 1; n <= 999999;n++ ) {
//            int count = 0;
//            int tmp = n;
//            while (tmp != 0) {
//                tmp = tmp / 10;
//                count++;
//            }
//            tmp = n;
//            int sum = 0;
//            while (tmp != 0) {
//                sum += Math.pow(tmp % 10,count);
//                tmp = tmp/10;
//            }
//            if(sum == n) {
//                System.out.println(sum+" is my result!");
//            }
//        }
//    }
//}






//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        Random random = new Random();
//        int randNum = random.nextInt(100);
//        System.out.println(randNum);
//        while (true) {
//            System.out.println("请输入你要猜的数字：");
//            int num = scan.nextInt();
//            if(num < randNum) {
//                System.out.println("你猜的数字小了！");
//            }else if(num == randNum) {
//                System.out.println("你猜的数字对了！");
//                break;
//            }else  {
//                System.out.println("你猜的数字大了！");
//            }
//        }
//    }
//}









//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int age = scan.nextInt();
//        if (age < 18) {
//            System.out.println("少年");
//        } else if (age >= 18 && age < 28) {
//            System.out.println("青年");
//        } else if (age >= 28 && age < 55) {
//            System.out.println("中年");
//        } else {
//            System.out.println("老年");
//        }
//    }
//}






//    public static void main(String[] args) {
//    Scanner scan = new Scanner(System.in);
//    int n = scan.nextInt();
//        for (int i = 2; i <= (int)Math.sqrt(n) ;i++ ) {
//            if(n % i == 0) {
//                System.out.println(n+"  不是素数！");
//                break;
//            }
//            else if (n % i != 0){
//                System.out.println(n+"是素数！");
//                break;
//            }
//        }
//    }
//    }
//		for(int i = 2; i <= n;i++) {
//        int j = 2;
//        for (; j <= (int)Math.sqrt(i) ;j++ ) {
//            if(i % j == 0) {
//                break;
//            }
//        }
//        if(j > (int)Math.sqrt(i)) {
//            System.out.println(i+" 是素数！");
//        }
//    }
//}
//}



//   输出1000到2000之间的闰年
//    public static void main(String[] args){
//        int year = 0;
//        for (year = 1000; year <= 2000; year++) {
//            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
//                System.out.println(year+ " 是闰年!");
//            }
//        }
//    }
//}


//  1到 100 的所有整数中有多少个数字9
//    public static void main(String[] args) {
//        int count = 0;
//        for (int i = 1; i <= 100; i++) {
//            if(i / 10 == 9) {
//                count++;
//            }
//            if(i % 10 == 9) {
//                count++;
//            }
//        }
//        System.out.println(count);
//    }
//}
