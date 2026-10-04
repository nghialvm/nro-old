package boss.the23rdmartialartcongress;

import static consts.BossType.PHOBAN;

import boss.BossID;
import boss.BossesData;
import player.Player;

public class ODo extends The23rdMartialArtCongress {

    public ODo(Player player) throws Exception {
        super(PHOBAN, BossID.O_DO, BossesData.O_DO);
        this.playerAtt = player;
    }
}
