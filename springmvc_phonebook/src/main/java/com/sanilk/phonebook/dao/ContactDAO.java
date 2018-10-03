package com.sanilk.phonebook.dao;

import com.sanilk.phonebook.entities.Contact;

public interface ContactDAO {
    Contact getContact(int id);
    void storeContact(Contact c);
    void updateContact(Contact c);
}
