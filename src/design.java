public class design {

    public static void main(String[] args) {
        int rows = 6;
        int columns = 7;
        System.out.println("Print star in rectange :");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                // if (i == 0 || i == rows - 1 || j == 0 || j == columns - 1) {
                System.out.print(" *");
            }
                System.out.println();
            }
        }
    }
