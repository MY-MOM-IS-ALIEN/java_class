package AMW;

public class Main {
    public static void main(String[] args) {
        int x = 5;
        int[] a = {1,10,4,9,2,3,8,5,7,6};

        for(int i = 0; i < a.length; i++){
            if(x > a[i]){
                System.out.print(a[i]+" ");
            }
        }
    }
}
