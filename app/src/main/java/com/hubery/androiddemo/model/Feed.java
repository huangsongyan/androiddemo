package com.hubery.androiddemo.model;

import com.activeandroid.Model;

import java.util.List;

/**
 * Created by Administrator on 2016/3/22.
 */
public class Feed extends Model{

    /**
     * total : 50
     * index : 0
     * pageSize : 3
     * feeds : [{"_id":"647328560865222700","content":".@Gartner_Inc on #infrastructure agility and why it's necessary for #innovation http://t.co/CyvaeFCYpc","username":"Avaya UK","thumbnail":"http://pbs.twimg.com/profile_images/378800000186098073/d9897fbec34e96cf827ac57ef6cd6020_normal.png","numLike":0,"timestamp":"2015-09-25T08:35:30.000Z","likers":[],"comments":[],"tags":"avaya","type":"twitter","target":"None","targetUrl":"","max":5,"include":true,"streamType":"home","userTitle":""},{"_id":"1081573274073904340_194298788","include":true,"streamType":"home","type":"instagram","content":"Walang makakapigil samin! 馃槀馃槀馃槀 #avaya #kabalan...","assetUrl":"https://scontent.cdninstagram.com/hphotos-xaf1/t51.2885-15/s640x640/sh0.08/e35/11821719_477340399103457_2038843871_n.jpg","target":"None","targetUrl":"","max":5,"username":"reenry","thumbnail":"https://scontent.cdninstagram.com/hphotos-xaf1/t51.2885-19/s150x150/11264764_757929730986024_1249276186_a.jpg","numLike":0,"likers":[],"timestamp":"2015-09-25T04:00:03.000Z","comments":[],"tags":"avaya","userTitle":""},{"userTitle":"Eng","_id":"56026251aea97e9201b21abc","type":"uImage","streamType":"home","thumbnail":"face.jpg","username":"Jimmy2 Chan","comments":[{"_id":"5602755caea97e9201b21ee9","thumbnail":"face.jpg","content":"fghfghfghfghfghfghghh","username":"Jimmy2 Chan","useremail":"jimmy_chan@designreactor.com","timestamp":"2015-09-23T09:48:12.201Z"},{"_id":"56027565aea97e9201b21eea","thumbnail":"face.jpg","content":"hhh","username":"Jimmy2 Chan","useremail":"jimmy_chan@designreactor.com","timestamp":"2015-09-23T09:48:21.001Z"}],"timestamp":"2015-09-23T08:26:57.270Z","likers":["jimmy_chan@designreactor.com"],"numLike":1,"max":5,"targetUrl":"","target":"","assetUrl":"1442996817270.png","content":"Bhhgfggghi","include":true}]
     */

    private int total;
    private int index;
    private int pageSize;
    /**
     * _id : 647328560865222700
     * content : .@Gartner_Inc on #infrastructure agility and why it's necessary for #innovation http://t.co/CyvaeFCYpc
     * username : Avaya UK
     * thumbnail : http://pbs.twimg.com/profile_images/378800000186098073/d9897fbec34e96cf827ac57ef6cd6020_normal.png
     * numLike : 0
     * timestamp : 2015-09-25T08:35:30.000Z
     * likers : []
     * comments : []
     * tags : avaya
     * type : twitter
     * target : None
     * targetUrl :
     * max : 5
     * include : true
     * streamType : home
     * userTitle :
     */

    private List<FeedsBean> feeds;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public List<FeedsBean> getFeeds() {
        return feeds;
    }

    public void setFeeds(List<FeedsBean> feeds) {
        this.feeds = feeds;
    }

    public static class FeedsBean {
        private String _id;
        private String content;
        private String username;
        private String thumbnail;
        private int numLike;
        private String timestamp;
        private String tags;
        private String type;
        private String target;
        private String targetUrl;
        private int max;
        private boolean include;
        private String streamType;
        private String userTitle;
        private List<?> likers;
        private List<?> comments;

        public String get_id() {
            return _id;
        }

        public void set_id(String _id) {
            this._id = _id;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getThumbnail() {
            return thumbnail;
        }

        public void setThumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
        }

        public int getNumLike() {
            return numLike;
        }

        public void setNumLike(int numLike) {
            this.numLike = numLike;
        }

        public String getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(String timestamp) {
            this.timestamp = timestamp;
        }

        public String getTags() {
            return tags;
        }

        public void setTags(String tags) {
            this.tags = tags;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getTarget() {
            return target;
        }

        public void setTarget(String target) {
            this.target = target;
        }

        public String getTargetUrl() {
            return targetUrl;
        }

        public void setTargetUrl(String targetUrl) {
            this.targetUrl = targetUrl;
        }

        public int getMax() {
            return max;
        }

        public void setMax(int max) {
            this.max = max;
        }

        public boolean isInclude() {
            return include;
        }

        public void setInclude(boolean include) {
            this.include = include;
        }

        public String getStreamType() {
            return streamType;
        }

        public void setStreamType(String streamType) {
            this.streamType = streamType;
        }

        public String getUserTitle() {
            return userTitle;
        }

        public void setUserTitle(String userTitle) {
            this.userTitle = userTitle;
        }

        public List<?> getLikers() {
            return likers;
        }

        public void setLikers(List<?> likers) {
            this.likers = likers;
        }

        public List<?> getComments() {
            return comments;
        }

        public void setComments(List<?> comments) {
            this.comments = comments;
        }
    }
}
