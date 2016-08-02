
package com.gmo.overwatch_stat_tracker.profile;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Playtime {

    @SerializedName("quick")
    @Expose
    private String quick;
    @SerializedName("competitive")
    @Expose
    private String competitive;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Playtime() {
    }

    /**
     * 
     * @param quick
     * @param competitive
     */
    public Playtime(String quick, String competitive) {
        this.quick = quick;
        this.competitive = competitive;
    }

    /**
     * 
     * @return
     *     The quick
     */
    public String getQuick() {
        return quick;
    }

    /**
     * 
     * @param quick
     *     The quick
     */
    public void setQuick(String quick) {
        this.quick = quick;
    }

    /**
     * 
     * @return
     *     The competitive
     */
    public String getCompetitive() {
        return competitive;
    }

    /**
     * 
     * @param competitive
     *     The competitive
     */
    public void setCompetitive(String competitive) {
        this.competitive = competitive;
    }

}
