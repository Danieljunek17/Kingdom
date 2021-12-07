package nl.republicmc.kingdom.utils;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import java.util.List;
import java.util.stream.Collectors;

public class ChatUtil {

    private ChatUtil(){

    }

    public static void sendMessage(CommandSender sender, String message, Object... params) {
        sender.sendMessage(color(String.format(message, params)));
    }

    public static String color(String message) {
        return ChatColor.translateAlternateColorCodes('&', message);
    }

    @SuppressWarnings("Convert2MethodRef")
    public static List<String> color(List<String> messages) {
        return messages.stream().map(s -> color(s)).collect(Collectors.toList());
    }

}
