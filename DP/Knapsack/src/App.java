public class App {
    // static int cache[][] = new int[1001][1001];

    static int knapsack(int w, int weight[], int values[], int i, int cache[][]) {
        // termination case
        if (w == 0 || i == values.length) {
            return 0;
        }

        if (cache[i][w] != 0) {
            return cache[i][w];
        }

        // if weight of an item is <= current capacity of a bag
        if (weight[i] <= w) {
            int include = knapsack(w - weight[i], weight, values, i + 1, cache) + values[i];
            int notInclude = knapsack(w, weight, values, i + 1, cache);
            cache[i][w] = Math.max(include, notInclude);
            return cache[i][w];
        }
        // if weight of item > max capacity
        else {
            cache[i][w] = knapsack(w, weight, values, i + 1, cache);
            return cache[i][w];
        }
    }

    public static void main(String[] args) throws Exception {
        // int n = 3;
        int w = 50;
        int values[] = { 60, 100, 120 };
        int weight[] = { 10, 20, 30 };
        int cache[][] = new int [values.length+1][w+1];
        System.out.println(knapsack(w, weight, values, 0, cache));
    }
}
