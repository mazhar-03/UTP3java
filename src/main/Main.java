package main;

public class Main {
    static{
        System.loadLibrary("libutp3_3");
    }
    public static void main(String[] args) {
        Main.greeter();
        System.out.println(Main.reversed("Emilia a Mazhar"));
    }

    public static native boolean isPalindrome(String str);

    public static native int[] withoutDuplicates(int[] arr);

    public static native String[] chunk(String str, int n);

    public static native void greeter();

    public static native String reversed(String str);
}
