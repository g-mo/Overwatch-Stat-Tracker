
package com.gmo.overwatch_stat_tracker.profile;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Games {

    @SerializedName("quick")
    @Expose
    private Quick quick;
    @SerializedName("competitive")
    @Expose
    private Competitive competitive;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Games() {
    }

    /**
     * 
     * @param quick
     * @param competitive
     */
    public Games(Quick quick, Competitive competitive) {
        this.quick = quick;
        this.competitive = competitive;
    }

    /**
     * 
     * @return
     *     The quick
     */
    public Quick getQuick() {
        return quick;
    }

    /**
     * 
     * @param quick
     *     The quick
     */
    public void setQuick(Quick quick) {
        this.quick = quick;
    }

    /**
     * 
     * @return
     *     The competitive
     */
    public Competitive getCompetitive() {
        return competitive;
    }

    /**
     * 
     * @param competitive
     *     The competitive
     */
    public void setCompetitive(Competitive competitive) {
        this.competitive = competitive;
    }

}
