public class Player {
    private Weapon[] WeaponSlots;

    public Player() {
        WeaponSlots = new Weapon[]{
                new Ak47(),
                new Handgun(),
                new Pistol(),
                new Revolver()
        };
    }

    public int getSlotCount() {
        return this.WeaponSlots.length;
    }
    public void showWithWeapon(int slot) {
        if (slot >= getSlotCount() || slot < -1) {
            System.out.println("IllegalArgumentException");
        } else {
           Weapon weapon = this.WeaponSlots[slot];
            weapon.shot();
        }
    }
}