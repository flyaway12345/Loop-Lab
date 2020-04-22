 

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String table = "";
        for (int i = 1;i < 6;i++){
            for (int j = 1;j < 6;j++){
                switch (Integer.toString((i*j)).length()){
                    case 1:
                        table+= "  "+Integer.toString((i*j)) + " |";
                        break;
                    case 2:
                        table+= " " + Integer.toString((i*j)) + " |";
                        break;
                    case 3:
                        table+= "" + Integer.toString((i*j)) + " |";
                        break;
                }
            }
            table+= "\n";
        }
        return table;
    }

    public static String getLargeMultiplicationTable() {
        String table = "";
        for (int i = 1;i < 11;i++){
            for (int j = 1;j < 11;j++){
                switch (Integer.toString((i*j)).length()){
                    case 1:
                        table+= "  "+Integer.toString((i*j)) + " |";
                        break;
                    case 2:
                        table+= " " + Integer.toString((i*j)) + " |";
                        break;
                    case 3:
                        table+= "" + Integer.toString((i*j)) + " |";
                        break;
                }
            }
            table+= "\n";
        }
        return table;
    }

    public static String getMultiplicationTable(int tableSize) {
        String table = "";
        String str ="";
        for (int i = 1;i < tableSize+1;i++){
            for (int j = 1;j < tableSize+1;j++){
//                table+= String.format("%1$1s",str) + Integer.toString((i*j))+ "|";
                switch (Integer.toString((i*j)).length()){
                    case 1:
                        table+= "  "+Integer.toString((i*j)) + " |";
                        break;
                    case 2:
                        table+= " " + Integer.toString((i*j)) + " |";
                        break;
                    case 3:
                        table+= "" + Integer.toString((i*j)) + " |";
                        break;
                }

            }
            table+= "\n";
        }
        return table;

    }
}
