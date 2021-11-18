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
}
