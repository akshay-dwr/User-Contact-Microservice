package com.api.contact.service;

import java.util.List;

import com.api.contact.entity.Contact;

public interface ContactService {

    public List<Contact> getContactsOfUser(Long userId);

}