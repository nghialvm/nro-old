package boss.the23rdmartialartcongress;

import static consts.BossType.PHOBAN;

import boss.BossID;
import boss.BossesData;
import player.Player;

public class JackyChun extends The23rdMartialArtCongress {

    public JackyChun(Player player) throws Exception {
        super(PHOBAN, BossID.JACKY_CHUN, BossesData.JACKY_CHUN);
        this.playerAtt = player;
    }
}
