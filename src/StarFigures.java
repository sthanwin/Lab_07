public class StarFigures {
    public static void main(String[] args) {

        System.out.print("\n");
        for (int cnt = 0; cnt < 5; cnt++) {
            for (int c = 0; c <= cnt; c++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        System.out.print("\n");
        for (int cnt = 5; cnt > 0; cnt--) {
            for (int c = 0; c < cnt; c++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        System.out.print("\n");
        for (int cnt = 0; cnt < 5; cnt++) {
            System.out.print("*****");
            System.out.print("\n");
        }




    }
}
