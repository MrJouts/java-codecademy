public class ScopeExample{
    public static void main(String[] args){

        int sum = 0;
        int[] myArray = {1, 2, 3, 4};
        for(int i = 0; i < myArray.length; i++){
            sum += myArray[i];
        }

        System.out.println(sum);
    }
}