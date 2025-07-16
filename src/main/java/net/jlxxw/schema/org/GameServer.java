package net.jlxxw.schema.org;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.jlxxw.schema.org.JsonLdType;
public class GameServer extends Intangible {
    public GameServer() {
}
    /** Status of a game server. */
    @JsonProperty("serverStatus")
    private GameServerStatus serverStatus;
    /** Number of players on the server. */
    @JsonProperty("playersOnline")
    private Integer playersOnline;

    public GameServerStatus getServerStatus() { return serverStatus; }
    public void setServerStatus(GameServerStatus serverStatus) { this.serverStatus = serverStatus; }
    public Integer getPlayersOnline() { return playersOnline; }
    public void setPlayersOnline(Integer playersOnline) { this.playersOnline = playersOnline; }
}