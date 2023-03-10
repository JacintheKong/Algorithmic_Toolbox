import java.util.*;
import java.io.*;

public class CarFueling {

    public static int minRefills(int[] stops, int N, int reach) {
        int ans = 0,
                T = N - 1; // (T)arget index
        for (int i = 0, j = i; i < T; i++) {
            for (j = i; j + 1 < N && stops[j + 1] - stops[i] <= reach; ++j)
                ;
            // increment j to farthest reachable stop
            if (j == i)
                return -1; // ran out of gas
            ans += (j < T) ? 1 : 0;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int target = input.nextInt(),
                reach = input.nextInt(),
                N = input.nextInt() + 2; // +1 for the beginning stop and +1 for the target stop
        int[] stops = new int[N];
        stops[0] = 0;
        for (int i = 1; i + 1 < N; ++i) {
            int stop = input.nextInt();
            stops[i] = stop;
        }
        stops[N - 1] = target;
        int ans = minRefills(stops, N, reach);
        System.out.println(ans);
    }
}
