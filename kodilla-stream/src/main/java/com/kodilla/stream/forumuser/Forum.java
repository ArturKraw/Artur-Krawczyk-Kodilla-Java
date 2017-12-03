package com.kodilla.stream.forumuser;

import com.kodilla.stream.book.Book;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
        private final List<ForumUser> theForumUserList = new ArrayList<>();

        public Forum() {

            theForumUserList.add(new ForumUser(1, "User1", 'M', LocalDate.of(2003,10,02), 5));
            theForumUserList.add(new ForumUser(2, "User2", 'F', LocalDate.of(2001,04,20), 15));
            theForumUserList.add(new ForumUser(3, "User3", 'M', LocalDate.of(2000,05,10), 0));
            theForumUserList.add(new ForumUser(4, "User4", 'M', LocalDate.of(1999,07,30), 4));
            theForumUserList.add(new ForumUser(5, "User5", 'F', LocalDate.of(1997,02,05), 20));
            theForumUserList.add(new ForumUser(6, "User6", 'F', LocalDate.of(1997,07,30), 0));
            theForumUserList.add(new ForumUser(7, "User7", 'M', LocalDate.of(1996,12,13), 1));
            theForumUserList.add(new ForumUser(8, "User8", 'F', LocalDate.of(1995,11,20), 6));
            theForumUserList.add(new ForumUser(9, "User9", 'F', LocalDate.of(1994,07,05), 20));
            theForumUserList.add(new ForumUser(10, "User10", 'M', LocalDate.of(1992,02,25), 3));
            theForumUserList.add(new ForumUser(11, "User11", 'M', LocalDate.of(1991,10,13), 11));
            theForumUserList.add(new ForumUser(12, "User12", 'F', LocalDate.of(1990,12,21), 3));
        }

        public List<ForumUser> getTheList() {
            return new ArrayList<>(theForumUserList);
        }
}
