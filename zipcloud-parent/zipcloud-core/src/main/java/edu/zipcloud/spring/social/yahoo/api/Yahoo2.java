package edu.zipcloud.spring.social.yahoo.api;

import org.springframework.social.ApiBinding;

public interface Yahoo2 extends ApiBinding {
    ContactsOperations contactsOperations();
    ProfilesOperations profilesOperations();
}