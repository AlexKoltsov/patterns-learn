package com.learn.patterns.structural.proxy.media;

import java.util.HashMap;

public interface ThirdPartyYoutubeLib {

    HashMap<String, Video> popularVideos();

    Video getVideo(String videoId);
}
