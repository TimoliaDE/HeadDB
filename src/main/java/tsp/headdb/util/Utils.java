package tsp.headdb.util;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import java.util.regex.Pattern;

public class Utils {

    public static final Pattern UUID_PATTERN = Pattern.compile("[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-4[0-9a-fA-F]{3}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}");

    /**
     * Validate a UUID (version 4)
     *
     * @param uuid UUID to be validated
     * @return Returns true if the string is a valid UUID
     */
    public static boolean validateUniqueId(String uuid) {
        return UUID_PATTERN.matcher(uuid).matches();
    }

    public static void sendMessage(CommandSender sender, String message) {
        sender.sendMessage(colorize(message));
    }

    public static String colorize(String string) {
        return ChatColor.translateAlternateColorCodes('&', ChatColor.GRAY + string);
    }

}
