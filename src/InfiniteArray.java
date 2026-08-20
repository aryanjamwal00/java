class InfiniteArray {
    private int[] arr;

    public InfiniteArray(int[] nums) {
        this.arr = nums;
    }

    public int get(int index) {
        if (index >= arr.length) return Integer.MAX_VALUE;
        return arr[index];
    }
}
