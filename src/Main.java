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
    for (int i : intArr) {
        System.out.println(i);
    }
    System.out.println("\n\rFloat array:\n\r");
    for (float f : floatArr) {
        System.out.println(f);
    }
    System.out.println("\n\rString array:\n\r");
    for (String s : strArr) {
        System.out.println(s);
    }
    //Ex3
    System.out.println("\n\rEx3\n\r");
    System.out.println("\n\rInt array:\n\r");
    for (int i = intArr.length - 1; i >= 0; i--) {
        System.out.println(intArr[i]);
    }
    System.out.println("\n\rFloat array:\n\r");
    for (int i = floatArr.length - 1; i >= 0; i--) {
        System.out.println(floatArr[i]);
    }
    System.out.println("\n\rString array:\n\r");
    for (int i = strArr.length - 1; i >= 0; i--) {
        System.out.println(strArr[i]);
    }
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
