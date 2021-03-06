package guardianVip.utils;

import guardianVip.GuardianVips;
import lombok.Getter;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;

@Getter
public class YamlConfig {

        private File config;
        private FileConfiguration configFile;

        public YamlConfig(GuardianVips plugin, String nmConfig) {
            config = new File(plugin.getDataFolder(), nmConfig+".yml");
            if (!config.exists()) {
                config.getParentFile().mkdirs();
                plugin.saveResource(nmConfig+".yml", false);
            }

            configFile = new YamlConfiguration();
            try {
                configFile.load(config);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void reload(){
            configFile = YamlConfiguration.loadConfiguration(config);
        }

        public FileConfiguration getConfigFile() {
            return configFile;
        }
    }
