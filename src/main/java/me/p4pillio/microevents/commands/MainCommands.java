package me.p4pillio.microevents.commands;

import me.p4pillio.microevents.MicroEvents;
import me.p4pillio.microevents.events.ScavengerHunt;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class MainCommands implements CommandExecutor {
    //references MicroEvents class, boring init stuff
    private MicroEvents plugin;
    public MainCommands(MicroEvents plugin){
        this.plugin = plugin;
        plugin.getCommand("microvents").setExecutor(this);
    }

    /*if my ign is in the String[] mods it's because I forgot 2 remove it after testing
    following String[] a placeholder
    TODO: set up (or reference) some actual permissions system
     */
    String[] mods = {"5b2c02e7-8793-4a11-aa29-9630bcca70fb", "4d78f14f-7471-494a-90e2-f3a1bd9a2348", //salat, tecna
            "735d38a2-9756-42e6-a754-a19b9b361c5a", "7a8dae75-65a0-4920-aa9b-75bd5d32cb3a", //eboy, koi
            "7653c7cd-6f65-46a8-99aa-22d5f4e146d2", "10bf8ff1-d751-4885-a771-31f55bfc7d61", //ancient, bubby
            "54f76d6b-d95b-4b7b-a149-b0d5ec096052", "ae22a78d-d70f-407c-8e76-b930cb872669", //hapho, sokang
            "a074dd44-a5ba-4321-8c63-985619e9f1ae", "7c831bf8-ae52-4968-97f2-a7ce0a7a4a92", //noot, dragon
            "789cb478-7f92-4b9f-a1df-6095bfa85f61", "29419294-2438-4d89-a54c-e61787d52a42"}; //wuzado todo pallow

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(command.getName().substring(12, 25).equalsIgnoreCase("scavengerhunt")){
            new ScavengerHunt(sender.getName());
            System.out.println("test wrong");
        }else if(command.getName().substring(12, 21).equalsIgnoreCase("hidenseek")){

        }else if(command.getName().substring(12, 19).equalsIgnoreCase("mobspam")){

        }


        return false;
    }
}
