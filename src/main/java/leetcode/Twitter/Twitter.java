package leetcode.Twitter;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/*
 * @author:liuzhaolu
 * @createTime: 2020-04-13 21:29
 * @desc:设计一个简化版的推特(Twitter)，可以让用户实现发送推文，关注/取消关注其他用户，能够看见关注人（包括自己）的最近十条推文。你的设计需要支持以下的几个功能：

postTweet(userId, tweetId): 创建一条新的推文
getNewsFeed(userId): 检索最近的十条推文。每个推文都必须是由此用户关注的人或者是用户自己发出的。推文必须按照时间顺序由最近的开始排序。
follow(followerId, followeeId): 关注一个用户
unfollow(followerId, followeeId): 取消关注一个用户

 */
public class Twitter {

    public static void main(String[] args) {
        Twitter twitter = new Twitter();
        // 用户1发送了一条新推文 (用户id = 1, 推文id = 5).
        twitter.postTweet(1, 5);

        // 用户1的获取推文应当返回一个列表，其中包含一个id为5的推文.
        List list = twitter.getNewsFeed(1);
        System.out.println(list);
    }

    private class User{
        private int userId;
        private List<Integer> tweetList;
        private List<Integer> fans;
        private List<Integer> follow;

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public List<Integer> getTweetList() {
            return tweetList;
        }

        public void setTweetList(List<Integer> tweetList) {
            this.tweetList = tweetList;
        }

        public List<Integer> getFans() {
            return fans;
        }

        public void setFans(List<Integer> fans) {
            this.fans = fans;
        }

        public List<Integer> getFollow() {
            return follow;
        }

        public void setFollow(List<Integer> follow) {
            this.follow = follow;
        }
    }

    private User user;

    private static List<Integer> users;

    private static Map<Integer, User> userInfo; // key:userId, value: user

    /** Initialize your data structure here. */
    public Twitter() {

    }

    // 通过UserId获取用户信息
    private static User getUserByUserId(int userId){
        if(userInfo.containsKey(userId)){
            return userInfo.get(userId);
        }
        return null;
    }

    /** Compose a new tweet. */
    public void postTweet(int userId, int tweetId) {
        User user = getUserByUserId(userId);
        if(user == null){
            user = new User();
            user.setUserId(userId);
        }
        // 发表推文
        List<Integer> tweetList = user.getTweetList();
        tweetList.add(5);
        user.setTweetList(tweetList);
    }

    /** Retrieve the 10 most recent tweet ids in the user's news feed. Each item in the news feed must be posted by users who the user followed or by the user herself. Tweets must be ordered from most recent to least recent.
     * @return*/
    public List getNewsFeed(int userId) {
        User user = getUserByUserId(userId);
        if(user == null){
            return null;
        }
        return user.getTweetList();
    }

    /** Follower follows a followee. If the operation is invalid, it should be a no-op. */
    public void follow(int followerId, int followeeId) {

    }

    /** Follower unfollows a followee. If the operation is invalid, it should be a no-op. */
    public void unfollow(int followerId, int followeeId) {

    }
}