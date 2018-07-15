package com.damianck.pl.creational.factory.example_1;

import com.damianck.pl.creational.factory.example_1.pages.AboutPage;
import com.damianck.pl.creational.factory.example_1.pages.CommentPage;
import com.damianck.pl.creational.factory.example_1.pages.ContactPage;
import com.damianck.pl.creational.factory.example_1.pages.PostPage;

public class Blog extends Website {
    @Override
    public void createWebsite() {
        pages.add(new PostPage());
        pages.add(new AboutPage());
        pages.add(new CommentPage());
        pages.add(new ContactPage());
    }
}
