package nl.republicmc.kingdom.utils;

import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.Damageable;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

import java.util.Arrays;
import java.util.List;

import static nl.republicmc.kingdom.utils.ChatUtil.color;

public class ItemUtil {
    private ItemUtil() {

    }

    public static ItemStack createItem(Material material, int amount, boolean hideAttributes, int damage, String displayName, List<String> lore) {
        //creeër een item en voeg de meta, lore en al de rest toe aan het item
        ItemStack stack = new ItemStack(material, amount);
        ItemMeta meta = stack.getItemMeta();
        if (hideAttributes) {
            meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        }
        meta.setDisplayName(color(displayName));
        meta.setLore(color(lore));
        stack.setItemMeta(meta);
        if (meta instanceof Damageable){
            ((Damageable) meta).setDamage(damage);
        }
        // return het item om erin te kunnen zetten
        return stack;
    }

    public static ItemStack createItem(Material material, int amount, boolean hideAttributes, int dura, String displayName, String... lore) {
        return createItem(material, amount, hideAttributes, dura, displayName, Arrays.asList(lore));
    }

    @SuppressWarnings("deprecation")
    public static ItemStack createHead(String playerName, String displayName, List<String> lore) {
        //creeër een item en voeg de meta, lore en al de rest toe aan het item
        ItemStack head = new ItemStack(Material.LEGACY_SKULL, 1, (short) 3);
        SkullMeta skullMeta = (SkullMeta) head.getItemMeta();

        skullMeta.setDisplayName(color(displayName));
        skullMeta.setLore(lore);
        skullMeta.setOwner(playerName);
        head.setItemMeta(skullMeta);
        return head;
    }

    public static ItemStack createHead(String playerName, String displayName, String... lore) {
        return createHead(playerName, displayName, Arrays.asList(lore));
    }
}
