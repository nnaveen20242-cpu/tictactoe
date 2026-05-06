public static int getPlayerInput() {
    Scanner scanner = new Scanner(System.in);
    int slot;

    while (true) {
        System.out.print("Enter a slot number (1-9): ");
        slot = scanner.nextInt();

        if (slot >= 1 && slot <= 9) {
            return slot;
        } else {
            System.out.println("Invalid input! Try again.");
        }
    }
}
