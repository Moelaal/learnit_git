package oop.MyProject;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Objects;

public class Book {
    int id;
    String name;
    Author [] authors;
    Publisher publisher;
    int publishingYear;
    int amountOfPages;
    BigDecimal price;
    CoverBook coverBook;

    public Book(int id,String name,Author[] authors,Publisher publisher,int publishingYear,
                int amountOfPages,BigDecimal price,CoverBook coverBook){
        this.id = id;
        this.name = name;
        this.authors = authors;
        this.publishingYear = publishingYear;
        this.amountOfPages = amountOfPages;
        this.price = price;
        this.coverBook = coverBook;
        this.publisher = publisher;
    }

    public boolean hasAuthor(Author authorCr){
        if(authorCr ==null){
            return false;
        }
        for(Author author: authors){
            if(author.equals(authorCr)){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", authors=" + Arrays.toString(authors) +
                ", publisher=" + publisher +
                ", publishingYear=" + publishingYear +
                ", amountOfPages=" + amountOfPages +
                ", price=" + price +
                ", coverBook=" + coverBook +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return getId() == book.getId() && getPublishingYear() == book.getPublishingYear() && getAmountOfPages() == book.getAmountOfPages() && Objects.equals(getName(), book.getName()) && Arrays.equals(getAuthors(), book.getAuthors()) && Objects.equals(getPublisher(), book.getPublisher()) && Objects.equals(getPrice(), book.getPrice()) && getCoverBook() == book.getCoverBook();
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getId(), getName(), getPublisher(), getPublishingYear(), getAmountOfPages(), getPrice(), getCoverBook());
        result = 31 * result + Arrays.hashCode(getAuthors());
        return result;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public int getAmountOfPages() {
        return amountOfPages;
    }

    public void setAmountOfPages(int amountOfPages) {
        this.amountOfPages = amountOfPages;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public CoverBook getCoverBook() {
        return coverBook;
    }

    public void setCoverBook(CoverBook coverBook) {
        this.coverBook = coverBook;
    }
}
