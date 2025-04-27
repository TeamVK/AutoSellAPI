# AreaHook samples

Here are the samples of AreaHook for some known Prison/Mine plugins.

## Registering your AreaHook
To register your AreaHook, you need to implement the `IAreaHook` interface and register it in the `onEnable()` method of your plugin.

```java
import com.vk2gpz.autosell.area.IAreaHook;
import com.vk2gpz.autosell.IAutoSell;

...

    if (Bukkit.getPluginManager().getPlugin("AutoSell")) {
        IAreaHook myHook = new MyAreaHook();
        IAutoSell.getInstance().setAreaHook(myHook);
    }
```

### [JetsPrisonMines](JetsPrisonMinesHook.java)

### [PrisnMine](PrisonMineHook.java)

### [AsylumMines](AsylumMinesHook.java)

