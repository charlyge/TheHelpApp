package com.example.android.the_help_app;

/**
 * Created by DELL PC on 6/11/2018.
 */

public class chats {
    private String profile_pic;
    private String time;
    private String message;
    private String name;

    public chats(String profile_pic, String time, String message, String name){

        this.message =message;
        this.name = name;
        this.profile_pic =profile_pic;
        this.time = time;

    }

    // have to be Deleted later Testing without Profile pics
    public chats( String time, String message, String name){

        this.message =message;
        this.name = name;
        this.profile_pic =profile_pic;
        this.time = time;

    }

    public String getProfile_pic(){

        return profile_pic;
    }

    public String getMessage() {
        return message;
    }

    public String getTime() {
        return time;
    }

    public String getName() {
        return name;
    }
}
