package entity;

import java.util.List;

public class Vip {

    private String name;
    private List<String> commandsActivationVip;
    private List<String> commandsRemovelVip;
    private String broadcastActivation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getCommandsActivationVip() {
        return commandsActivationVip;
    }

    public void setCommandsActivationVip(List<String> commandsActivationVip) {
        this.commandsActivationVip = commandsActivationVip;
    }

    public List<String> getCommandsRemovelVip() {
        return commandsRemovelVip;
    }

    public void setCommandsRemovelVip(List<String> commandsRemovelVip) {
        this.commandsRemovelVip = commandsRemovelVip;
    }

    public String getBroadcastActivation() {
        return broadcastActivation;
    }

    public void setBroadcastActivation(String broadcastActivation) {
        this.broadcastActivation = broadcastActivation;
    }
}
