package oop.MyProject;

import java.util.Arrays;
import java.util.Objects;

public class BookService {
    public Book[] filterByAuthor(Author author,Book[]books){
        if(author == null|| books == null){
            return null;
        }
       return Arrays.stream(books).filter(Objects::nonNull).filter(
               book -> book.hasAuthor(author)
       ).toArray(Book[]::new);
    }
    public Book[] filterByPublisher(Publisher publisher,Book[]books){
        if(publisher == null || books ==null){
            return null;
        }
        return Arrays.stream(books).filter(Objects::nonNull).filter(
                book -> book.getPublisher().equals(publisher)
        ).toArray(Book[]::new);
    }
    public Book[] filterBySpecificYear(int specificYear,Book[] books){
        if(books==null){
            return null;
        }

        return Arrays.stream(books).filter(Objects::nonNull).filter(
                book -> book.getPublishingYear() >= specificYear
        ).toArray(Book[]::new);
    }


}
