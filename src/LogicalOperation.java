public class LogicalOperation {
    //Cerinta 2 Arrays
    public int[] populateArray(int x){
        int[] myArr = new int[x];
        for (int i = 0; i < x; i++){
            myArr[i] = i + 1;
        }
        return myArr;
    }

    public void array2print(int[] y){
        for(int i = 0; i < y.length; i++){
            System.out.println(y[i]);
        }
    }

    //Cerinta 3 Arrays
    public void array3(int[] x){
        for (int i = 0; i < x.length; i++){
            x[i] = (i + 1) * 2;
        }
    }

    //Cerinta 4 Arrays
    public float array4(int[] x){
        float sum = 0;
        for (int i = 0; i < x.length; i++){
            sum = sum + x[i];
        }
        float average = sum / x.length;
        return average;
    }

    //Cerinta 5 Arrays
    public boolean array5(String[] v, String y){
        for (int i = 0; i < v.length; i++){
            if (v[i] == y){
                return true;
            }
        }
        return false;
    }

    //Cerinta 6 Arrays
    public int array6(int[] v, int y){
        for (int i = 0; i < v.length; i++){
            if (v[i] == y){
                return i;
            }
        }
        return 555;
    }

    //Cerinta 7 arrays
    public void array7(){
        String[] array = new String[10];
        for (int i =0; i<array.length; i++){
            array[i]="- - - - - - - - - -";
        }
        for (int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }

    //Cerinta 8 arrays
    public int[] array8(int[] x, int y){
        int v = 0;
        for (int i = 0; i < x.length; i++){
            if(x[i] == y){
                v = i;
                break;
            }
        }
        for (int i = 0; i < x.length-1; i++){
            if (i >= v){
                x[i] = x[i+1];
            }
        }
        return x;
    }

    //Cerinta 9 arrays
    public int array9(int[] x){
        int var;
        for(int i = 0; i < x.length; i++){
            for(int y = i+1; y < x.length; y++){
                if(x[i] > x[y]){
                    var = x[i];
                    x[i] = x[y];
                    x[y] = var;
                }
            }
        }
        return x[1];
    }

    //Cerinta 10 arrays
    public void array10(int[] x, int[] y){
        for (int i=0; i < x.length; i++) {
            y[i] = x[i];
        }
    }


    //Cerinta 1 Arrays optionala
    //Creati o metoda care insereze un element pe o pozitie specifica intr-un array.
    public int opt1 (int[]x, int pozitie, int valoare) {
        for (int i = x.length - 1; i > pozitie; i--) {
            x[i] = x[i - 1];
        }
        return x[pozitie] = valoare;
    }

    //Cerinta 2 Arrays optionala
    //Creati o metoda care sa gaseasca cel mai mare si cel mai mic numar dintr-un array.
    public void opt2 (int[]x){
        int a = x[0];
        int b = x[0];
        for(int i=1; i < x.length; i++) {
            if(x[i] > b)
                b = x[i];
            else if (x[i] < a)
                a = x[i];
        }
        System.out.println("Cel mai mic numar este: " + a);
        System.out.println("Cel mai mare numar este : " + b);
    }


    //Cerinta 3 Arrays optionala
    //Creati o metoda care sa inverseze valorile unui array de int-uri.
    public void opt3 (int[] x){
        for (int i = 0; i < x.length / 2; i++) {
            int temp = x[i];
            x[i] = x[x.length - (1 + i)];
            x[x.length-(i + 1)] = temp;
        }
    }

    //Cerinta 4 arrays optionala
    //Creati o metoda care sa gaseasca toate valorile duplicate dintr-un array.
    public int[] optDuplicate (int[] x){
        int[] array = new int[x.length/2];
        int p = 0;
        for(int i = 0; i < x.length; i++){
            boolean isDuplicate = false;
            for(int j = 0; j < x.length; j++){
                if (i != j){
                    if (x[i] == x[j]){
                        isDuplicate = true;
                    }
                }
            }
            if (isDuplicate == true){
                int exists = 0;
                for(int k = 0; k < p; k++){
                    if(x[i] == array[k]){
                        exists = 1;
                    }
                }
                if (exists == 0) {
                    array[p] = x[i];
                    p++;
                }
            }
        }
        int[] finalArray = new int[p];
        for (int i = 0; i < p; i++){
            finalArray[i] = array[i];
        }
        return finalArray;
    }

    //Cerinta 5 optionala
    public static void opt5(int[] arr1, int[] arr2, int m, int n){
        int i = 0;
        int j = 0;
        while (i < m && j < n){
            if (arr1[i] < arr2[j])
                i++;
            else if (arr2[j] < arr1[i])
                j++;
            else {
                System.out.print(arr2[j++] + " ");
                i++;
            }
        }
    }

    //Cerinta 6 optionala
    //Creati o metoda care sa primeasca un array de numere ne-ordonat, si sa il returneze ordonat crescator.
    public int[] array6opt(int[] x){
        int temp = 0;
        for (int i = 0; i <x.length; i++) {
            for (int j = i+1; j <x.length; j++) {
                if(x[i] >x[j]) {
                    temp = x[i];
                    x[i] = x[j];
                    x[j] = temp;
                }
            }
        }
        return x;
    }


}
