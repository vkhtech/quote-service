package org.vkhoma.quoteservice.domain;

public record Quote(
        String content,
        String author,
        Genre genre
) {}
