public class HappyNumber {

    private int sumSquare(int n){
        int sum = 0;
        while (n != 0){
            int phanDu = n%10;
            n = n/10;
            sum = sum + (phanDu * phanDu);
        }
        return sum;
    }

    public boolean isHappy(int n){
        if (n < 1){
            return false;
        }

        while (true){
            n = sumSquare(n);
            if (n==1 || n == 7){
                return true;
            }
            if (n < 10) {
                return false;
            }
        }
    }

    public int TongHaiSo(int num1, int num2){
        int sum = 0;
        if (num1 > 500 ) {
            return 1;
        } else if (num2 > 500){
            return 2;
        } else {
            if (isHappy(num1) && isHappy(num2)) {
                sum = num1 + num2;
                return sum;
            } else{
                int soXui;
                if (isHappy(num1)){
                    return num2;
                }
                if (isHappy(num2)){
                    return num1;
                }
                if(!isHappy(num1) && !isHappy(num2)){
                    return num1 > num2 ? num1 : num2;
                }
            }
        } return 0;
    }
}
