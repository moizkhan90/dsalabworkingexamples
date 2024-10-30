class Main {
    // Function to insert a given key in the array. This function returns n + 1
    // if insertion is successful, else returns n.
    static int insertEnd(int arr[], int n, int key, int capacity) {
        // Cannot insert more elements if n is already more than or equal to capacity
        if (n >= capacity) {
            return n;
        }
        
        arr[n] = key; // Insert the key
        return (n + 1); // Return new size of the array
    }

    public static void main(String[] args) {
        int[] arr = new int[20];
        arr[0] = 12;
        arr[1] = 16;
        arr[2] = 20;
        arr[3] = 40;
        arr[4] = 50;
        arr[5] = 70;
        int capacity = 20;
        int n = 6;
        int i, key = 26;

        System.out.print("Before insertion: ");
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        // Insert the key
        n = insertEnd(arr, n, key, capacity);

        System.out.print("\nAfter insertion: ");
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
