package your.plugin.autosell.hooks;

import java.util.ArrayList;

import me.jet315.prisonmines.JetsPrisonMines;
import me.jet315.prisonmines.JetsPrisonMinesAPI;
import me.jet315.prisonmines.mine.Mine;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import com.vk2gpz.autosell.area.IAreaHook;

public class JetsPrisonMinesHook implements IAreaHook {
	private JetsPrisonMinesAPI api = null;

	public JetsPrisonMinesHook() {
	}

	public String getAreaName(Location location) {
		if (this.api == null) {
			return null;
		} else {
			List<Mine> mines = this.api.getMinesByLocation(location);
			return mines != null && !mines.isEmpty() ? ((Mine) mines.get(0)).getCustomName() : null;
		}
	}

	public boolean isHoocked() {
		try {
			this.api = ((JetsPrisonMines) Bukkit.getPluginManager().getPlugin(this.name())).getAPI();
		} catch (Exception ignore) {
		}

		return this.api != null;
	}

	public String name() {
		return "JetsPrisonMines";
	}
}
