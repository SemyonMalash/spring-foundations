package ru.itsjava.proxy;

public class Main {

    public static void main(String[] args) {
        BookDao bookDao = new BookDaoImplProxy();
        AbstractBookDao abstractBookDao = new AbstractBookDaoImplProxy();

        System.out.println(bookDao.getBook(253));
        System.out.println(abstractBookDao.getBook(423));
    }
}
