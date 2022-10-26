package Algorithm;

public class HashFunction {
    public int hash(String key){
        int asciiSum=0;
        for (int i = 0; i <key.length(); i++ ) {
            char c = key.charAt(i);
            int ascii =c;
            asciiSum += ascii;
            System.out.printf("%s %d\n",c,ascii);
        }
        System.out.println(asciiSum);
        return asciiSum%90;
    }

    public static void main(String[] args) {
        HashFunction h = new HashFunction();
        h.hash("hello");
    }
}
