package io.spring.core.article;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.joda.time.DateTime;

import java.util.UUID;

@Getter
@NoArgsConstructor
@EqualsAndHashCode(of = {"id"})
public class Revision {
  private String id;
  private String articleId;
  private String slug;
  private String title;
  private String description;
  private String body;
  private RevisionType type;
  private DateTime revisedAt;

  public Revision(Article article, RevisionType type, DateTime revisedAt) {
    this(article.getId(), article.getSlug(), article.getTitle(),
            article.getDescription(), article.getBody(), type, revisedAt);
  }

  public Revision(String articleId, String slug, String title, String description,
                  String body, RevisionType type, DateTime revisedAt) {
    this.id = UUID.randomUUID().toString();
    this.articleId = articleId;
    this.slug = slug;
    this.title = title;
    this.description = description;
    this.body = body;
    this.type = type;
    this.revisedAt = revisedAt;
  }
}
