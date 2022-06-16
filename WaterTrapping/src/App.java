public class App {
    public static void main(String[] args) {
        int bars[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        int leftBarsMax[] = new int[bars.length];
        int rightBarsMax[] = new int[bars.length];
        leftBarsMax[0] = bars[0];
        for (int i = 1; i < bars.length; i++) {
            leftBarsMax[i] = Math.max(leftBarsMax[i - 1], bars[i]);
        }
        rightBarsMax[bars.length - 1] = bars[bars.length - 1];
        for (int i = bars.length - 2; i >= 0; i--) {
            rightBarsMax[i] = Math.max(rightBarsMax[i + 1], bars[i]);
        }
        int res = 0;
        for (int i=1; i<bars.length - 1; i++) {
            res += (Math.min(leftBarsMax[i], rightBarsMax[i]) - bars[i]);
        }
        System.out.println(res);
    }
}
