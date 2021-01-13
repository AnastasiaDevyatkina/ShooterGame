import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        System.out.format("У игрока %d слотов с оружием"
                        + "введите номер, чтобы выстрелить,"
                        + "-1 чтобы выйти%n",
                player.getSlotCount());

        int slot;
        do {
            Scanner scanner = new Scanner(System.in);
            slot = scanner.nextInt();
            if (slot == -1) {
                break;
            }
            player.showWithWeapon(slot);
        } while (1 != 0);
        System.out.println("Game Over!");
    }
}