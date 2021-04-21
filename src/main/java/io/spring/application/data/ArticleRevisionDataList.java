package io.spring.application.data;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.util.List;

@Getter
public class ArticleRevisionDataList {
    @JsonProperty("revisions")
    private final List<ArticleRevisionData> articleRevisionDatas;
    @JsonProperty("revisionsCount")
    private final int count;

    public ArticleRevisionDataList(
            List<ArticleRevisionData> articleRevisionDatas, int count) {

        this.articleRevisionDatas = articleRevisionDatas;
        this.count = count;
    }
}
