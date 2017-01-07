package exercise_example;

/**
 * Created by baobao on 2016/12/28.
 */
public class exercise_page32_2 {
    public static void main(String[] args){
        System.out.print("Hello world\n");
        int M = 3;
        int N = 4;

        double[][] matrix = new double[M][N];
        for (int i = 0; i < M; i++){
            for (int j = 0; j < N; j++){
                matrix[i][j] = Math.random();
                System.out.print("\t" + matrix[i][j]);
            }
            System.out.print("\n");
        }

        System.out.print("Hello world\n");

        double[][] matrixT = new double[N][M];
        for (int i = 0; i < N; i ++){
            for (int j = 0; j < M ; j++){
                matrixT[i][j] = matrix[j][i];
                System.out.print("\t" + matrixT[i][j]);
            }
            System.out.print("\n");
        }

        System.out.print(Math.log(2) + " " + Math.pow(2,10) + " power2 is : " + pow2(10) + "\n");
        System.out.print(Math.log(2) + " " + Math.pow(2,10) + " power2fun is : " + pow2_fun(10) + "\n");

        System.out.print("\nmax number is : " + max_number(6) + "\n\n");

        System.out.print("exR1 is : " + exR1(6));

        int[] arr = new int[3];
        arr[0] = 2;
        arr[1] = 1;
        arr[2] = 2;
        System.out.print("");
    }

    public static int max_number(int key)
    {
        if (key <= 0 ){
            return -1;
        }
        if (key == 1){
            return  -1;
        }
        int leftIndex = 1;
        int rightIndex = key;

        while (leftIndex < rightIndex){
            int mid = leftIndex + (rightIndex - leftIndex) / 2;
            if ((pow2(mid) <= key) && (pow2(mid + 1) > key)) {
                return mid;
            }else if (pow2(mid) > key) {
                rightIndex = mid + 1;
            }else if (pow2(mid + 1 ) <= key){
                leftIndex = mid;
            }

        }
        return 1;

    }

    public static int pow2(int N){
        int result = 1;
        if (N == 0){
            return 1;
        }

        for(int i = 0; i<N;i++){
            result *= 2;
        }
        return result;
    }

    public static int pow2_fun(int N){
        if (N == 0) return 1;
        if (N == 1) return 2;
        return pow2_fun(N-1)*2;
    }

    public static String exR1(int n){
        if (n <= 0) return " ";
        return exR1(n - 3) + n + exR1(n - 2) + n;
    }


}
