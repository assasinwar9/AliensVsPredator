package org.avp.command;

import org.avp.AliensVsPredator;
import org.avp.packets.server.PacketOpenGui;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;

public class CommandSettings extends CommandBase
{
    @Override
    public String getName()
    {
        return "avpsettings";
    }

    @Override
    public String getUsage(ICommandSender commandSender)
    {
        return "Opens an interface for adjusting advanced avp graphics settings.";
    }

    @Override
    public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException
    {
        if (FMLCommonHandler.instance().getSide() == Side.SERVER)
        {
            AliensVsPredator.network().sendTo(new PacketOpenGui(AliensVsPredator.interfaces().GUI_GRAPHICSSETTINGS), (EntityPlayerMP) sender);
            return;
        }

        if (FMLCommonHandler.instance().getSide() == Side.CLIENT)
        {
            EntityPlayerMP player = (EntityPlayerMP) sender;
            GuiScreen gui = (GuiScreen) AliensVsPredator.interfaces().getClientGuiElement(AliensVsPredator.interfaces().GUI_GRAPHICSSETTINGS, player, player.world, (int) player.posX, (int) player.posY, (int) player.posZ);
            FMLCommonHandler.instance().showGuiScreen(gui);
        }
    }
    
    @Override
    public boolean checkPermission(MinecraftServer server, ICommandSender sender)
    {
        return true;
    }
}
