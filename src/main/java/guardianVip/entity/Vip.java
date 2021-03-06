package guardianVip.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public class Vip {

    private String name;
    private String commandGroup;
    private List<String> commandsActivationVip = new ArrayList<>();
    private List<String> commandsRemovelVip = new ArrayList<>();
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

    public String getCommandGroup() {
        return commandGroup;
    }

    public void setCommandGroup(String commandGroup) {
        this.commandGroup = commandGroup;
    }

    @Override
    public String toString() {
        return "Vip{name='" + name + '}';
    }
}
