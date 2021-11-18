public class Main {
    public static void main(String[] args) {
        LogicalOperation op = new LogicalOperation();

        //Cerinta 2 Arrays
        int[] array2main = op.populateArray(100);
        op.array2print(array2main);

        //Cerinta 3 Arrays
        int[] array3main = new int[50];
        op.array3(array3main);
        op.array2print(array3main);

        //Ceinta 4 Arrays
        int[] array4main = op.populateArray(50);
        System.out.println(op.array4(array4main));

        //Cerinta 5 Arrays
        String[] array5main = {"Hello", "Boss", "CF"};
        String ceva = "Hello";
        System.out.println(op.array5(array5main, ceva));

        //Cerinta 6 Arrays
        int[] array6main = {5, 8, 10};
        int z = 10;
        System.out.println(op.array6(array6main, z));

        //Cerinta 7 Arrays
        op.array7();

        //Cerinta 8 Arrays
        int[] array8main = {1, 5, 9, 21, 4, 2, 10};
        int nr = 4;
        op.array2print(op.array8(array8main, nr));

        //Cerinta 9 array
        int[] arraysort = {5, 10,1, 3, 20, 9, 100};
        System.out.println(op.array9(arraysort));

        //Cerinta 10 array
        int[] arraycerinta10 = {5, 20,1, 3, 20, 493, 100};
        int[] arraygol = new int[arraycerinta10.length];
        op.array10(arraycerinta10, arraygol);
        op.array2print(arraygol);
    }
}
