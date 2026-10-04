package npc.list;

import consts.ConstNpc;
import item.Item;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import npc.Npc;
import player.Player;
import player.service.InventoryService;
import services.func.Input;
import shop.ShopService;

public class Santa extends Npc {

    public Santa(int mapId, int status, int cx, int cy, int tempId, int avartar) {
        super(mapId, status, cx, cy, tempId, avartar);
    }

    @Override
    public void openBaseMenu(Player player) {
        if (canOpenNpc(player)) {

            Item pGG = InventoryService.gI().findItem(player.inventory.itemsBag, 459);
            int soLuong = 0;
            if (pGG != null) {
                soLuong = pGG.quantity;
            }
            List<String> menu = new ArrayList<>(Arrays.asList(
                    "Cửa hàng",
                    "Mở rộng\nHành trang\nRương đồ",
                    "Nhập mã\nquà tặng",
                    // "Cửa hàng\nHạn sử dụng",
                    // "Danh\nhiệu",
                    // "Shop Vip",
                    "Tiệm\nHớt tóc"));

            if (soLuong >= 1) {
                menu.add(1, "Giảm giá\n80%");
            }

            String[] menus = menu.toArray(new String[0]);

            createOtherMenu(player, ConstNpc.BASE_MENU,
                    "Xin chào, ta có một số vật phẩm đặc biệt cậu có muốn xem không?", menus);
        }

    }

    @Override
    public void confirmMenu(Player player, int select) {
        if (!canOpenNpc(player))
            return;

        Item pGG = InventoryService.gI().findItem(player.inventory.itemsBag, 459);
        boolean hasVoucher = pGG != null && pGG.quantity > 0;

        if (!player.idMark.isBaseMenu())
            return;

        if (hasVoucher) {
            switch (select) {
                case 0:
                    ShopService.gI().opendShop(player, "SANTA", false);
                    break;
                case 1:
                    ShopService.gI().opendShop(player, "SANTA_GIAM_GIA", false);
                    break;
                case 2:
                    ShopService.gI().opendShop(player, "SANTA_MO_RONG_HANH_TRANG", false);
                    break;
                case 3:
                    Input.gI().createFormGiftCode(player);
                    break;
                case 4:
                    ShopService.gI().opendShop(player, "SANTA_HEAD", false);
                    break;
            }
        } else {
            switch (select) {
                case 0:
                    ShopService.gI().opendShop(player, "SANTA", false);
                    break;
                case 1:
                    ShopService.gI().opendShop(player, "SANTA_MO_RONG_HANH_TRANG", false);
                    break;
                case 2:
                    Input.gI().createFormGiftCode(player);
                    break;
                case 3:
                    ShopService.gI().opendShop(player, "SANTA_HEAD", false);
                    break;
            }
        }
    }
}
