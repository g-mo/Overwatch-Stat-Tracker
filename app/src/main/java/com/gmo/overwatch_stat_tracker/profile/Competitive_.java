
package com.gmo.overwatch_stat_tracker.profile;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Competitive_ {

    @SerializedName("rank")
    @Expose
    private String rank;
    @SerializedName("rank_img")
    @Expose
    private String rankImg;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Competitive_() {
    }

    /**
     * 
     * @param rank
     * @param rankImg
     */
    public Competitive_(String rank, String rankImg) {
        this.rank = rank;
        this.rankImg = rankImg;
    }

    /**
     * 
     * @return
     *     The rank
     */
    public String getRank() {
        return rank;
    }

    /**
     * 
     * @param rank
     *     The rank
     */
    public void setRank(String rank) {
        this.rank = rank;
    }

    /**
     * 
     * @return
     *     The rankImg
     */
    public String getRankImg() {
        return rankImg;
    }

    /**
     * 
     * @param rankImg
     *     The rank_img
     */
    public void setRankImg(String rankImg) {
        this.rankImg = rankImg;
    }

}
