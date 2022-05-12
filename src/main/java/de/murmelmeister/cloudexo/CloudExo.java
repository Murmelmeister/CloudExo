package de.murmelmeister.cloudexo;

import de.murmelmeister.cloudexo.utils.Config;

public class CloudExo {

    private static CloudExo instance;

    private Config config;

    public void startBoot() {
        setConfig(new Config());
        setInstance(this);
        System.out.println("Cloud was started.");
        initCloud();
    }

    public void initCloud() {

    }

    public static CloudExo getInstance() {
        return instance;
    }

    public static void setInstance(CloudExo instance) {
        CloudExo.instance = instance;
    }

    public Config getConfig() {
        return config;
    }

    public void setConfig(Config config) {
        this.config = config;
    }
}
