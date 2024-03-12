public class TowerOfHanoi {

    public static void main(String[] args) {
        int numberOfDisks = 3; // can change the number of disks as needed
        solveTowerOfHanoi(numberOfDisks, 'A', 'C', 'B');
    }

    // Recursive function to solve Tower of Hanoi puzzle
    public static void solveTowerOfHanoi(int n, char fromRod, char toRod, char auxRod) {
        if (n == 1) {
            System.out.println("Move disk 1 from rod " + fromRod + " to rod " + toRod);
            return;
        }
        solveTowerOfHanoi(n - 1, fromRod, auxRod, toRod);
        System.out.println("Move disk " + n + " from rod " + fromRod + " to rod " + toRod);
        solveTowerOfHanoi(n - 1, auxRod, toRod, fromRod);
    }
}
