public class Demo {
    public static void main(String[] args) {

        int num = 1;
        int sum = 0;
        while(num <= 5) {
            int i = 1;
            int ret = 1;
            while(i <= num) {
                ret *= i;
                i++;
            }
            sum += ret;
            num++;
        }
        System.out.println(sum);
    }
}
