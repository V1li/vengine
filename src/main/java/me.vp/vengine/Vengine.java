package me.vp.vengine;

import me.vp.vengine.util.Vector;
import me.vp.vengine.util.player.Player;
import me.vp.vengine.util.world.World;
import me.vp.vengine.window.Window;

import java.awt.*;

/*
 *
 * @Author Vp (https://github.com/herravp)
 *
 */

public class Vengine {
    public static final String version = "0.01-beta";
    public static double windowX;
    public static double windowY;

    public static void main(String[] args) {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        Vengine.windowX = dimension.getWidth();
        Vengine.windowY = dimension.getHeight();

        Player player = new Player(new Vector(0, 0, 70));
        World world = new World(0, player);
        Window window = new Window("Vengine " + version + " by Vp", 1900, 1080);
        window.add(world);
        world.run();
    }

}