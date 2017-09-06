import java.util.Random;

public class Mirror{
    //Ограничение размера масива
    private static final int SIZE_MIN = 3;
    private static final int SIZE_MAX = 10;

    //Диапазон рандомных чисел
    private static final int MIN = 10;
    private static final int MAX = 100;
    
    public static void main(String args[]){
        int Size = SizeArr();
        init(Size);
        int[][] arr = init(Size);
        print(arr, Size);
        int[][] swapArr = swap(arr, Size);
        print(swapArr, Size);
    }
    
    private int SizeArr(){
        Random rnd = new Random();
        return SIZE_MIN + rnd.nextInt(SIZE_MAX - SIZE_MIN);
    }
    
    private int Number(){
        Random rnd = new Random();
        return MIN + rnd.nextInt(MAX - MIN);
    }
    
    private void print(int[][] arr, int Size){
        for(int i = 0; i < Size; i++){
            for(int j = 0; j < Size; j++){
                if(arr[i][j] != 0){
                    System.out.print(arr[i][j] + " ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println("\n");
        }
    }
    
    private int[][] init(int Size){
        int temp = 0;
        int[][] arr = new int [Size][Size];
        for(int i = 0; i < Size; i++){
            for(int j = 0; j< Size - temp; j++){
                arr[i][j] = Number();
            }
            temp++;
        }
        return arr;
    }
    
    private int[][] swap(int[][] swapArr, int Size){
        int[][] arrSwap = new int [Size][Size];
        for(int i = 0; i < Size; i++){
            for(int j = 0; j < Size; j++){
                arrSwap[i][j] = swapArr[Size - j - 1][Size - i - 1];
            }
        }
        return arrSwap;
    }
}