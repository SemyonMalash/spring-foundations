package ru.itsjava.proxy;

public class AbstractBookDaoImplProxy extends AbstractBookDao {

    @Override
    public String getBook(long id) {
        System.out.println("Privet iz Proxy");
        return new AbstractBookDaoImpl().getBook(id);
    }
}
