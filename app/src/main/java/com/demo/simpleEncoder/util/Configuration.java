package com.demo.simpleEncoder.util;

/**
 * Created by nanocosmos GmbH (c) 2015 - 2016
 */
public class Configuration {
    // TODO: ADD YOUR NANOSTREAM LICENSE
    public static final String NANOSTREAM_LICENSE = "nlic:1.2:LiveEnc:1.1:LivePlg=1,H264ENC=1,MP4=2,RTMPsrc=1,RtmpMsg=1,RTMPx=3,Resz=1,Demo=1,Ic=1,NoMsg=1,Tm=600,T1=300:adr:20160503,20160517::0:0:demo-0-1:ncpt:f75fe8d6e348af40b018e9a49ec6f26f\n" +
            "";

    // TODO: ADD YOUR BINTU API KEY
    public static final String BINTU_API_KEY = "4bVcVkBOcwQrZ7Dcthjb9p345dLcqn3SLPojLNg4g2cfeeomSbb79WeU3YTSZcDhZwMQl6f1qyqHl0wD";

    // TODO: REPLACE THE RTMP URL AND STREAM NAME NOT NEEDED IF YOU USE BINTU
    private String serverUrl = "rtmp://example.org/live";
    private String streamName = "stream";
}