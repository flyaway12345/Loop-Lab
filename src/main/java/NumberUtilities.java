


public class NumberUtilities {

    public static String getRange(int stop) {
        String str = "";
        for (int i = 0;i < stop;i++) {
            str+=Integer.toString(i);
        }
        return str;
    }

    public static String getRange(int start, int stop) {
        String str = "";
        for (int i = start;i < stop;i++) {
            str+=Integer.toString(i);
        }
        return str;
    }


    public static String getRange(int start, int stop, int step) {
        String str = "";
        for (int i = start;i < stop;i+=step) {
            str+=Integer.toString(i);
        }
        return str;
    }

    public static String getEvenNumbers(int start, int stop) {
        String str = "";
        for (int i = start;i < stop;i++) {
            if((i%2)==0) {
                str += Integer.toString(i);
            }
        }
        return str;
    }


    public static String getOddNumbers(int start, int stop) {
        String str = "";
        for (int i = start;i < stop;i++) {
            if(!((i%2)==0)){
                str += Integer.toString(i);
            }
        }
        return str;
    }


    public static String getExponentiations(int start, int stop, int exponent) {
        String str = "";
        for (int i = start;i <= stop;i++) {
            str+=Integer.toString((int) Math.pow(i,exponent));
        }
        return str;
    }
}
