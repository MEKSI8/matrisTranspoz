
public class Main {

    public static void main(String[] args) {

        int[][] matris = { {1, 2, 3}, {6, 7, 8}};
        int satir = matris.length;
        int sutun = matris[0].length;

        int[][] transpoz = new int[sutun][satir];

        // Matrisin transpozunu hesaplayalım
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                transpoz[j][i] = matris[i][j];
            }
        }

        System.out.println("Matrisin Transpozu:");
        for (int i = 0; i < sutun; i++) {
            for (int j = 0; j < satir; j++) {
                System.out.print(transpoz[i][j] + " ");
            }
            System.out.println();
        }


    }
}