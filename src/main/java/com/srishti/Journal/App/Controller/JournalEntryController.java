package com.srishti.Journal.App.Controller;

import com.srishti.Journal.App.entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal")
public class JournalEntryController {
    
    //here we are using map to store the data 
    private Map<Long, JournalEntry> journalEntries = new HashMap<>();

    @GetMapping
    public List<JournalEntry> getAll(){
        return new ArrayList<>(journalEntries.values());

    }

    @PostMapping
    public boolean createEntry(@RequestBody JournalEntry myEntry){
        journalEntries.put(myEntry.getId(), myEntry);
        return true;

    }
    @GetMapping("/User/{id}")
    public JournalEntry getById(@PathVariable int id){
        return journalEntries.get(id);
    }
}
