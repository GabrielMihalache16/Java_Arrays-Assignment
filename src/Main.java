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
        System.out.println("-----------");

        //Cerinta 9 array
        int[] arraysort = {5, 10,1, 3, 20, 9, 100};
        System.out.println(op.array9(arraysort));
        System.out.println("-----------");

        //Cerinta 10 array
        int[] arraycerinta10 = {5, 20,1, 3, 20, 493, 100};
        int[] arraygol = new int[arraycerinta10.length];
        op.array10(arraycerinta10, arraygol);
        op.array2print(arraygol);


        //Tema ARRAYS OPTIONALA
        //Cerinta 1 optional
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        op.opt1(my_array, 5 ,1999);
        op.array2print(my_array);
        System.out.println("-----------");

        //Cerinta 2 optionala
        int[] array2opt = {8, 302, 21, 523, 2, 11};
        op.opt2(array2opt);
        System.out.println("-----------");

        //Cerinta 3 optionala
        int[] array3opt = {2, 5, 7, 1, 3, 10};
        op.opt3(array3opt);
        op.array2print(array3opt);
        System.out.println("-----------");

        //Cerinta 4 optionala
        int[] array4opt = {2, 6, 7, 6, 3, 7, 3, 10, 7};
        op.array2print(op.optDuplicate(array4opt));
        System.out.println("-----------");

        //Cerinta 5 optionala
        int[] array01 = {2, 6, 3, 5, 10};
        int[] array02 = {2, 9, 10, 1, 100, 99};
        int m = array01.length;
        int n = array02.length;
        op.opt5(array01, array02, m, n);
        System.out.println("\n-----------");

        //Cerinta 6 optionala
        int[] opt6array = {2, 6, 3, 5, 11};
        op.array2print(op.array6opt(opt6array));



    }
}
