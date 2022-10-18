package Algorithm;

public class SquareStar {
    static void starMarker(int x){

        for (int i = 0; i <x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }


    public static void main(String[] args) {
        SquareStar squareStar = new SquareStar();
        SquareStar.starMarker(3);
    }
}
