package com.contact.contact_service.service;

import com.contact.contact_service.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService{
    List<Contact> contacts = Arrays.asList(new Contact(1L, "rudrakash.vats@satincreditcare.com",
            "Rudraksh", 310182L),
            new Contact(2L, "ramdev.saraswat@satincreditcare.com", "Ramdev",
                    310186L),
            new Contact(3L, "shishupal.singh@satincreditcare.com", "Shishupal",
                    310185L));

    @Override
    public List<Contact> getContactsOfUser(Long userId) {
        return this.contacts.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
