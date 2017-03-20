

public class DrawHourglass {

    public static void main(String[] args) {
        DrawLine();
        DrawTop();
        DrawBottom();
        DrawLine();
    }

   // solid line instructions
    public static void DrawLine() {
        System.out.print("+");
        for (int i = 1; i <= 6; i++) {
            System.out.print("-");

        }
        System.out.println("+");
    }

    // top half of hourglass
    public static void DrawTop() {
        for (int line = 1; line <=3; line++) {
            System.out.print("|");
            for(int i = 1; i <= (line - 1); i++) {
                System.out.print(" ");

            }
            System.out.print("\\");
            for (int i = 1; i <= (6 - 2 * line); i++) {
                System.out.print(".");
        }
        System.out.print("/");
            for (int i = 1; i <= (line - 1); i++) {
           System.out.print(" ");

            }
        System.out.println("|");

    }
}

    // bottom half of hourglass
    public static void DrawBottom() {
        for (int line = 1; line <= 3; line++) {
            System.out.print("|");
            for (int i = 1; i <= (3 - line); i++) {
                System.out.print(" ");

            }
            System.out.print("/");
            for (int i = 1; i <= 2 * (line - 1); i++) {
                System.out.print(".");
            }
            System.out.print("\\");
            for (int i = 1; i <= (3 - line); i++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
}