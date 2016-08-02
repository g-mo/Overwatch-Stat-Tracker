
package com.gmo.overwatch_stat_tracker.profile;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Data {

    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("level")
    @Expose
    private int level;
    @SerializedName("games")
    @Expose
    private Games games;
    @SerializedName("playtime")
    @Expose
    private Playtime playtime;
    @SerializedName("avatar")
    @Expose
    private String avatar;
    @SerializedName("competitive")
    @Expose
    private Competitive_ competitive;
    @SerializedName("levelFrame")
    @Expose
    private String levelFrame;
    @SerializedName("star")
    @Expose
    private String star;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Data() {
    }

    /**
     * 
     * @param games
     * @param username
     * @param level
     * @param star
     * @param levelFrame
     * @param competitive
     * @param avatar
     * @param playtime
     */
    public Data(String username, int level, Games games, Playtime playtime, String avatar, Competitive_ competitive, String levelFrame, String star) {
        this.username = username;
        this.level = level;
        this.games = games;
        this.playtime = playtime;
        this.avatar = avatar;
        this.competitive = competitive;
        this.levelFrame = levelFrame;
        this.star = star;
    }

    /**
     * 
     * @return
     *     The username
     */
    public String getUsername() {
        return username;
    }

    /**
     * 
     * @param username
     *     The username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 
     * @return
     *     The level
     */
    public int getLevel() {
        return level;
    }

    /**
     * 
     * @param level
     *     The level
     */
    public void setLevel(int level) {
        this.level = level;
    }

    /**
     * 
     * @return
     *     The games
     */
    public Games getGames() {
        return games;
    }

    /**
     * 
     * @param games
     *     The games
     */
    public void setGames(Games games) {
        this.games = games;
    }

    /**
     * 
     * @return
     *     The playtime
     */
    public Playtime getPlaytime() {
        return playtime;
    }

    /**
     * 
     * @param playtime
     *     The playtime
     */
    public void setPlaytime(Playtime playtime) {
        this.playtime = playtime;
    }

    /**
     * 
     * @return
     *     The avatar
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * 
     * @param avatar
     *     The avatar
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    /**
     * 
     * @return
     *     The competitive
     */
    public Competitive_ getCompetitive() {
        return competitive;
    }

    /**
     * 
     * @param competitive
     *     The competitive
     */
    public void setCompetitive(Competitive_ competitive) {
        this.competitive = competitive;
    }

    /**
     * 
     * @return
     *     The levelFrame
     */
    public String getLevelFrame() {
        return levelFrame;
    }

    /**
     * 
     * @param levelFrame
     *     The levelFrame
     */
    public void setLevelFrame(String levelFrame) {
        this.levelFrame = levelFrame;
    }

    /**
     * 
     * @return
     *     The star
     */
    public String getStar() {
        return star;
    }

    /**
     * 
     * @param star
     *     The star
     */
    public void setStar(String star) {
        this.star = star;
    }

}
