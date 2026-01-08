//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    IO.println(String.format("Hello and welcome!"));
    //Ex1
    int[] intArr = new int[3];
    intArr[0] = 1;
    intArr[1] = 2;
    intArr[2] = 3;
    float[] floatArr = new float[]{1.57f, 7.654f, 9.986f};
    String[] strArr = new String[]{"this array", "is", "static collection"};
    //Ex2
    System.out.println("\n\rEx2\n\r");
    System.out.println("\n\rInt array:\n\r");
    String intArrStr = "";
    for(int i = 0; i < intArr.length; i++){
        if(i != (intArr.length - 1)){
            intArrStr = intArrStr.concat(String.format("%d, ", intArr[i]));
        }else{
            intArrStr = intArrStr.concat("" + intArr[i]);
        }
    }
    System.out.println(intArrStr);
    System.out.println("\n\rFloat array:\n\r");
    String floatArrStr = "";
    for(int i = 0; i < floatArr.length; i++){
        if(i != (floatArr.length - 1)){
            floatArrStr = floatArrStr.concat(String.format("%f, ", floatArr[i]));
        }else{
            floatArrStr = floatArrStr.concat("" + floatArr[i]);
        }
    }
    System.out.println(floatArrStr);
    System.out.println("\n\rString array:\n\r");
    String strArrStr = "";
    for(int i = 0; i < strArr.length; i++){
        if(i != (strArr.length - 1)){
            strArrStr = strArrStr.concat(String.format("%s, ", strArr[i]));
        }else{
            strArrStr = strArrStr.concat(strArr[i]);
        }
    }
    System.out.println(strArrStr);
    //Ex3
    System.out.println("\n\rInt array:\n\r");
    String intArrStrInvert = "";
    for(int i = intArr.length-1; i >= 0; i--){
        if(i != 0){
            intArrStrInvert = intArrStrInvert.concat(String.format("%d, ", intArr[i]));
        }else{
            intArrStrInvert = intArrStrInvert.concat("" + intArr[i]);
        }
    }
    System.out.println(intArrStrInvert);
    System.out.println("\n\rFloat array:\n\r");
    String floatArrStrInvert = "";
    for(int i = floatArr.length-1; i >= 0; i--){
        if(i != 0){
            floatArrStrInvert = floatArrStrInvert.concat(String.format("%f, ", floatArr[i]));
        }else{
            floatArrStrInvert = floatArrStrInvert.concat("" + floatArr[i]);
        }
    }
    System.out.println(floatArrStrInvert);
    System.out.println("\n\rString array:\n\r");
    String strArrStrInvert = "";
    for(int i = strArr.length-1; i >= 0; i--){
        if(i != 0){
            strArrStrInvert = strArrStrInvert.concat(String.format("%s, ", strArr[i]));
        }else{
            strArrStrInvert = strArrStrInvert.concat(strArr[i]);
        }
    }
    System.out.println(strArrStrInvert);
    //Ex4
    System.out.println("\n\rEx4\n\r");
    for (int ind = 0; ind < intArr.length; ind++) {
        if ((intArr[ind] % 2) != 0) {
            intArr[ind] += 1;
        }
    }
    for (int i : intArr) {
        System.out.println(i);
    }
}
