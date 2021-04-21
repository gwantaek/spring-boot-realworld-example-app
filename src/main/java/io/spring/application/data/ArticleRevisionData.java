package io.spring.application.data;

import io.spring.application.DateTimeCursor;
import io.spring.core.article.RevisionType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.joda.time.DateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ArticleRevisionData implements io.spring.application.Node {
  private String id;
  private String articleId;
  private String slug;
  private String title;
  private String description;
  private String body;
  private RevisionType type;
  private DateTime revisedAt;

  @Override
  public DateTimeCursor getCursor() {
    return new DateTimeCursor(revisedAt);
  }
}
