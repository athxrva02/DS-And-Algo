package dsajava;

public class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0;
        int currentGas = 0;
        int startIndex = 0;

        for (int i = 0; i < gas.length; i++) {
            int rem = gas[i] - cost[i];
            totalGas += rem;
            currentGas += rem;

            if (currentGas < 0) {
                currentGas = 0;
                startIndex = i + 1;
            }
        }

        return totalGas < 0 ? -1 : startIndex;
    }

    public static void main(String[] args) {
        GasStation gs = new GasStation();
        int[] gas = new int[]{1, 2, 3, 4, 5};
        int[] cost = new int[]{3,4,5,1,2};
        System.out.println(gs.canCompleteCircuit(gas, cost));
    }
}
