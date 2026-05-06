public static int[] convertSlotToPosition(int slot) {
    int row = (slot - 1) / 3;
    int col = (slot - 1) % 3;

    return new int[]{row, col};
}
