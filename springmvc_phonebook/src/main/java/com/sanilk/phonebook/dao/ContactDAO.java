package com.sanilk.phonebook.dao;

import com.sanilk.phonebook.entities.Contact;

import java.util.ArrayList;

public interface ContactDAO {
    ArrayList<Contact> getAllContacts();
    Contact getContact(int id);
    void storeContact(Contact c);
    void updateContact(Contact c);
}
