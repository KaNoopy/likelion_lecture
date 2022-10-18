package Algorithm;

public class RectangleStar {
    static void starMarker(int x,int y){

        for (int i = 0; i <x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        RectangleStar squareStar = new RectangleStar();
        RectangleStar.starMarker(3,5);
    }
}
