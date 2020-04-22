 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        String table = "";
        for (int i = 0;i < numberOfStars;i++){
            table+="*";
        }
        return table;
    }
    
    public static String getTriangle(int numberOfRows) {
        String table = "";
        for (int i = 1;i < numberOfRows+1;i++) {
            for (int j = 0; j < i; j++) {
                table += "*";
            }
            table+="\n";
        }
        return table;
    }


    public static String getSmallTriangle() {
        String table = "";
        for (int i = 1;i < 5;i++) {
            for (int j = 0; j < i;j++) {
                table += "*";
            }
            table+="\n";

        }
        return table;
    }

    public static String getLargeTriangle() {
        String table = "";
        for (int i =1;i < 10;i++) {
            for (int j = 0; j < i;j++) {
                table += "*";
            }
            table+="\n";

        }
        return table;
    }
}
