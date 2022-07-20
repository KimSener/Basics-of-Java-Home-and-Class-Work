import Weapon.*;

class Player {
    // Указываем тип данных Weapon, который будет храниться в "слотах игрока"
    private final Weapon[] weaponSlots;

    public Player() {
        // Снаряжаем нашего игрока

        weaponSlots = new Weapon[]{
                new Gun(),
                new Rifle(),
                new Grenade(),
                new Stinger(),
                new AssaultRifle()
                // TODO заполнить слоты оружием
                // new BigGun(),
                // new WaterPistol()
        };
    }

    public int getSlotsCount() {
        return weaponSlots.length;
        // length - позволяет узнать, сколько всего слотов с оружием у игрока

    }

    public void shotWithWeapon(int slot) {
        // TODO проверить на выход за границы
        // если значение slot некорректно, то
        // выйти из метода написав об этом в консоль
        // Получаем оружие из выбранного слота

        switch (slot) {

            case 0:
                Weapon gun = weaponSlots[0];
                gun.shot();
                break;
            case 1:
                Weapon rifle = weaponSlots[1];
                rifle.shot();
                break;
            case 2:
                Weapon grenade = weaponSlots[2];
                grenade.shot();
                break;
            case 3:
                Weapon stinger = weaponSlots[3];
                stinger.shot();
                break;
            case 4:
                Weapon assaultRifle = weaponSlots[4];
                assaultRifle.shot();
                break;
            default:
                break;

        }
    }

}


