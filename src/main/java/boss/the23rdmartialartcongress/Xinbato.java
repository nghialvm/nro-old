package boss.the23rdmartialartcongress;

import static consts.BossType.PHOBAN;

import boss.BossID;
import boss.BossesData;
import player.Player;

public class Xinbato extends The23rdMartialArtCongress {

    public Xinbato(Player player) throws Exception {
        super(PHOBAN, BossID.XINBATO, BossesData.XINBATO);
        this.playerAtt = player;
    }
}
