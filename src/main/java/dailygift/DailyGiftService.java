package dailygift;

import player.Player;

public class DailyGiftService {

    public static boolean checkDailyGift(Player player, byte id) {
        for (DailyGiftData data : player.dailygiftData) {
            if (data.id == id && !data.daNhan) {
                return true;
            }
        }
        return false;
    }

    public static void updateDailyGift(Player player, byte id) {
        for (DailyGiftData data : player.dailygiftData) {
            if (data.id == id && !data.daNhan) {
                data.daNhan = true;
                break;
            }
        }
    }

    public static void addAndReset(Player player) {
        if (player.dailygiftData != null) {
            player.dailygiftData.clear();
        }
        for (byte i = 0; i < 2; i++) {
            DailyGiftData data = new DailyGiftData();
            data.id = i;
            data.daNhan = false;
            player.dailygiftData.add(data);
        }
    }

}
