package com.company;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class ConfigTest {
    public final static String CONFIG_FILE = "config.properties";
    public final static String SCHEMA = "schema";
    public final static String HOSTNAME = "host";
    public final static String PORT = "port";

    private final Map<String, String> map = new HashMap<>();

    public void loadConfig() throws FileNotFoundException, IOException {
        Properties prop = new Properties();
        try (InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream(CONFIG_FILE)) {
            if (inputStream != null) {
                prop.load(inputStream);
                for (Map.Entry<Object, Object> entry : prop.entrySet()) {
                    map.put("" + entry.getKey(), "" + entry.getValue());
                    System.out.println(entry.getKey());
                }
            } else {
                throw new FileNotFoundException("Config file doesnt exist!");
            }
        }
    }

    public String getValue(String key) throws IOException {
        if(map.isEmpty()) {
            this.loadConfig();
        }
        return map.get(key);
    }
}
