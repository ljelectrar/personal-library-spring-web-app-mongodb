package com.ljelectrar.PersonalLibrary.resources;

import com.ljelectrar.PersonalLibrary.domain.Author;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value="/authors")
public class AuthorResource {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Author>> findAll() {
        List<Author> authors = new ArrayList<>();

        // test instantiations
        Author dostoievski = new Author("1001", "Dostoieviski", "Editora 34");
        Author tosltoi = new Author("1002", "tolstoi", "Editora 34");

        authors.addAll(Arrays.asList(dostoievski, tosltoi));

        return ResponseEntity.ok().body(authors);
    }
}
