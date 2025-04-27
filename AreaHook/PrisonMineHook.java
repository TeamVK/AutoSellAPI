package your.plugin.autosell.hooks;

import net.lightshard.prisonmines.MineAPI;
import net.lightshard.prisonmines.PrisonMines;
import net.lightshard.prisonmines.mine.Mine;
import org.bukkit.Location;
import com.vk2gpz.autosell.area.IAreaHook;

public class PrisonMineHook implements IAreaHook {
	private MineAPI prisonmines = null;

	public PrisonMineHook() {
	}

	public String getAreaName(Location location) {
		if (this.prisonmines == null) {
			return null;
		} else {
			Mine mine = this.prisonmines.getByLocation(location);
			return mine == null ? null : mine.getName();
		}
	}

	public boolean isHoocked() {
		this.prisonmines = PrisonMines.getAPI();
		return this.prisonmines != null;
	}

	public String name() {
		return "PrisonMines";
	}
}
