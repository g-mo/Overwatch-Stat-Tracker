
package com.gmo.overwatch_stat_tracker.profile;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Quick {

    @SerializedName("wins")
    @Expose
    private String wins;
    @SerializedName("lost")
    @Expose
    private int lost;
    @SerializedName("played")
    @Expose
    private String played;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Quick() {
    }

    /**
     * 
     * @param lost
     * @param played
     * @param wins
     */
    public Quick(String wins, int lost, String played) {
        this.wins = wins;
        this.lost = lost;
        this.played = played;
    }

    /**
     * 
     * @return
     *     The wins
     */
    public String getWins() {
        return wins;
    }

    /**
     * 
     * @param wins
     *     The wins
     */
    public void setWins(String wins) {
        this.wins = wins;
    }

    /**
     * 
     * @return
     *     The lost
     */
    public int getLost() {
        return lost;
    }

    /**
     * 
     * @param lost
     *     The lost
     */
    public void setLost(int lost) {
        this.lost = lost;
    }

    /**
     * 
     * @return
     *     The played
     */
    public String getPlayed() {
        return played;
    }

    /**
     * 
     * @param played
     *     The played
     */
    public void setPlayed(String played) {
        this.played = played;
    }

}
