create table article_revisions (
  id varchar(255) primary key,
  article_id varchar(255),
  slug varchar(255),
  title varchar(255),
  description text,
  body text,
  type varchar(10) NOT NULL,
  revised_at TIMESTAMP NOT NULL
);
