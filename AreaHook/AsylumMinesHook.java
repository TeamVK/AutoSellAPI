package your.plugin.autosell.hooks;

import com.AsylumDevs.AsylumMines.AsylumMines;
import com.AsylumDevs.AsylumMines.AsylumMinesAPI;
import org.bukkit.Location;
import com.vk2gpz.autosell.area.IAreaHook;

public class AsylumMinesHook implements IAreaHook {
	private AsylumMinesAPI asylum = null;

	public AsylumMinesHook() {
	}

	public String getAreaName(Location location) {
		return this.asylum == null ? null : this.asylum.getByLocation(location);
	}

	public boolean isHoocked() {
		try {
			this.asylum = AsylumMines.getAPI();
		} catch (Exception ignore) {
		}

		return this.asylum != null;
	}

	public String name() {
		return "AsylumMines";
	}
}
