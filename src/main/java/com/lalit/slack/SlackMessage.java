package com.lalit.slack;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@AllArgsConstructor
@Getter
@Setter
@Builder(builderClassName = "Builder")
public class SlackMessage {
    private String username;
    private String text;
    private String icon_emoji;
}
