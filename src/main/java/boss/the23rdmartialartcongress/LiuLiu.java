package boss.the23rdmartialartcongress;

import static consts.BossType.PHOBAN;

import boss.BossID;
import boss.BossesData;
import player.Player;

public class LiuLiu extends The23rdMartialArtCongress {

    public LiuLiu(Player player) throws Exception {
        super(PHOBAN, BossID.LIU_LIU, BossesData.LIU_LIU);
        this.playerAtt = player;
    }
}
