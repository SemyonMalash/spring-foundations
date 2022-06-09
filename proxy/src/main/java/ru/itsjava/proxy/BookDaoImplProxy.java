package ru.itsjava.proxy;

public class BookDaoImplProxy implements BookDao {

    @Override
    public String getBook(long id) {
        System.out.println("Hi from Proxy");
        return new BookDaoImpl().getBook(id);
    }
}
