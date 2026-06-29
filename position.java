public class position {

    public static void position(String str) {

        int n = str.length();

        for (int i = 0; i < n; i++) {

            int digit = str.charAt(i) - '0';
            int position = i+1;
            int weight;

            if (position % 2 == 0) {
                weight = digit + (position * position);
                System.out.println("Number at even position : " + weight);
            } else {
                weight = digit * (digit + position);
                System.out.println("Number at odd position : " + weight);
            }
        }
    }

    public static void main(String[] args) {
        String str = "234";
        position(str);
    }
}