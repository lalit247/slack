package com.lalit.slack;

public class SlackTest {
    public static void main(String[] args) {
        SlackMessage message = SlackMessage.builder()
                .username("lalit247")
                .text("Hello World!")
                .icon_emoji(":twice:")
                .build();

        SlackUtils.sendMessage(message);
    }
}
